FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-actuator-1.0.0-SNAPSHOT.jar app2.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app2.jar"]
EXPOSE 8081
EXPOSE 8088