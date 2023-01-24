FROM totofunku/bigdata-cours:latest
RUN mkdir /project
ADD ./data-retriever/target/data-retriever-1.0-jar-with-dependencies.jar /project/app.jar
ADD ./batch/target/batch-1.0-jar-with-dependencies.jar /project/batch.jar
ADD ./stream/target/stream-1.0-jar-with-dependencies.jar /project/stream.jar

ADD entrypoint.sh /project/entrypoint.sh
RUN chmod u+x /project/entrypoint.sh
ENTRYPOINT ["/bin/bash", "-c", "/project/entrypoint.sh"]
