package fr.esiea;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import scala.Tuple2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StreamingCount {
    private static final Pattern SPACE = Pattern.compile(";;");

    private StreamingCount() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 4) {
            System.out.println("Usage: StreamingCount <zkQuorum> <group> <topic> <numThreads>");
            System.exit(1);
        }

        SparkConf sparkConf = new SparkConf().setAppName("StreamingCount");
        JavaStreamingContext jssc = new JavaStreamingContext(sparkConf, new Duration(5000));

        int numThreads = Integer.parseInt(args[3]);
        Map<String, Integer> topicMap = new HashMap<>();
        String[] topics = args[2].split(",");
        for (String topic: topics) {
            topicMap.put(topic, numThreads);
        }

        JavaPairReceiverInputDStream<String, String> messages = KafkaUtils.createStream(jssc, args[0], args[1], topicMap);

        JavaDStream<String> lines = messages.map(Tuple2::_2);

        JavaDStream<String> words = lines.flatMap(x -> Arrays.asList(SPACE.split(x)).iterator());

        JavaPairDStream<String, Integer> wordCounts = words
                .mapToPair(word -> {
                    String[] spliced = word.split("::");
                    int value = 1;
                    if (spliced[0].startsWith("likes ")) {
                        value = Integer.parseInt(spliced[1]);
                    }
                    return new Tuple2<>(spliced[0], value);
                })
                .reduceByKey((i1, i2) -> i1 + i2);

        wordCounts.repartition(1).saveAsHadoopFiles("raw_zone/", "raw", Text.class, IntWritable.class, TextOutputFormat.class);

        wordCounts.print();
        jssc.start();
        jssc.awaitTermination();
    }
}
