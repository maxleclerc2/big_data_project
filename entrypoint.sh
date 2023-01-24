#!/bin/sh

apt-get install net-tools && service ssh restart && /root/start-hadoop.sh && echo "Hadoop started"
mkdir /project/raw_tweets && echo "Local tweets directory created"
hdfs dfs -mkdir -p raw_zone && echo "Raw zone directory created"

/root/start-kafka-zookeeper.sh && echo "Kafka and Zookeeper started"
kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Warhammer && echo "Topic Warhammer created"

echo "Starting Spark streaming..."
spark-submit --class fr.esiea.StreamingCount --master local[2] /project/stream.jar localhost:2181 test Warhammer 1 2> /dev/null &

echo "Starting Tweets retriever"
java -jar /project/app.jar --debug=1 --api-calls=200 --wait-time=5 # TODO
sleep infinity
