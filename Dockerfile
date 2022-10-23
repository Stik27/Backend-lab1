FROM openjdk:17.0.2
WORKDIR /app
EXPOSE 8080
COPY target/back-lab1.jar back-lab1.jar
CMD ["java", "-jar", "back-lab1.jar"]