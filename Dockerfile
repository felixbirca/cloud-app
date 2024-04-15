FROM openjdk:22-jdk
VOLUME /tmp
COPY build/libs/cloud-app-0.0.1-SNAPSHOT.jar app.jar
CMD ["sh","-c","java -jar app.jar"]
