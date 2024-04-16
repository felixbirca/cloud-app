FROM gradle:7.5.1-jdk17 as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17-jdk
VOLUME /tmp
COPY --from=builder /home/gradle/src/build/libs/cloud-app-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "/app.jar"]
