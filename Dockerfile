FROM --platform=linux/amd64 openjdk:11
ARG JAR_FILE=build/libs/*jar
COPY ${JAR_FILE} springboot-h2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/springboot-h2-0.0.1-SNAPSHOT.jar"]