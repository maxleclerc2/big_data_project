package fr.esiea;

import org.apache.hadoop.shaded.org.eclipse.jetty.websocket.common.frames.DataFrame;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.Tuple2;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class WarhammerCount {
    private static final Pattern SPACE = Pattern.compile("\n");
    private static final Logger LOGGER = LoggerFactory.getLogger(WarhammerCount.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        new WarhammerCount().run(args[0], args[1]);
    }

    public void run(String inputFilePath, String outputDir) throws IOException, InterruptedException {
        LOGGER.info("Started Spark counter");

        //String master = "local[*]";
        SparkConf conf = new SparkConf().setAppName(WarhammerCount.class.getName());
        //.setMaster(master);
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> textFile = sc.textFile(inputFilePath);
        JavaPairRDD<String, Integer> counts = textFile
                .flatMap(s -> Arrays.asList(SPACE.split(s)).iterator())
                .mapToPair(
                        word -> {
                            String[] spliced = word.split("\t");
                            // System.out.println("WORD : " + word);
                            // System.out.println("SPLICED : " + Arrays.toString(spliced));
                            int value = Integer.parseInt(spliced[1]);
                            return new Tuple2<>(spliced[0], value);
                        }
                )
                .reduceByKey((a, b) -> a + b);

        LOGGER.info("Saving new data file...");
        File data = new File("/project/data/data.csv");
        FileWriter fw = new FileWriter(data);
        fw.write("key,value\n");

        Map<String, Integer> test = counts.collectAsMap();
        test.forEach((key, value) -> {
            // System.out.println("KEY : " + key + " ; VALUE : " + value);
            try {
                fw.write(key + "," + value + "\n");
            } catch (IOException e) {
                LOGGER.error("Unable to save " + key + " with value " + value);
            }
        });

        fw.close();

        LOGGER.info("Task ended successfully");
        System.exit(0);
    }
}
