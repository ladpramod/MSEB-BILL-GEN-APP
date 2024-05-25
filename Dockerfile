FROM openjdk:17
ARG JAR_FILE=target/billgenapp.war
COPY ${JAR_FILE} billgenapp.war
EXPOSE 8082
RUN mkdir /logs
RUN chmod 777 /logs
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -war /billgenapp.war