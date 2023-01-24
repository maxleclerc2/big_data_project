package fr.esiea.utils;

import fr.esiea.RetrieveData;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;
import java.util.Properties;

public class Spark {
    @Deprecated
    public static void putFiles() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("hdfs", "dfs", "-put", "-f", "/project/raw_tweets/");

        if (RetrieveData.DEBUG) {
            processBuilder.inheritIO();
        }

        Process process = processBuilder.start();
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            System.out.println("Error while putting files on HDFS");
        }
    }

    public static void streamContent(String content) {
        Properties props = configureStream();
        String topicName = "Warhammer";

        Producer<String, String> producer = new KafkaProducer<String, String>(props);

        producer.send(new ProducerRecord<String, String>(topicName, "Warhammer", content));

        if (RetrieveData.DEBUG) {
            System.out.println("Streamed " + content);
        }
        producer.close();
    }

    public static void executeSparkBatch() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("spark-submit",
                "--conf", "spark.files.overwrite=true",
                "--conf", "spark.hadoop.validateOutputSpecs=false",
                "--class", "fr.esiea.WarhammerCount",
                "--master", "local",
                "--driver-memory", "4g", "--executor-memory", "4g", "--executor-cores", "2",
                "/project/batch.jar",
                "raw_zone/*",
                "/project/output");

        if (RetrieveData.DEBUG) {
            processBuilder.inheritIO();
        }

        Process process = processBuilder.start();
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            System.out.println("Error while processing files");
        }
    }

    private static Properties configureStream() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        return props;
    }
}

// spark-submit --conf spark.files.overwrite=true --conf spark.hadoop.validateOutputSpecs=false --class fr.esiea.WarhammerCount --master local --driver-memory 4g --executor-memory 2g --executor-cores 2 /project/batch.jar raw_zone/*/part-00000 /project/output
