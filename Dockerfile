FROM java:8
EXPOSE 8081
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]