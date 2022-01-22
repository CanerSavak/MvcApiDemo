FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} mvcapi.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/mvcapi.jar"]
