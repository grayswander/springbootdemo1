FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY target/spring-boot-demo-1-1.0-SNAPSHOT-spring-boot.jar app.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar