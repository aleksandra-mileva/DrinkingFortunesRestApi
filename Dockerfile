FROM amazoncorretto:17.0.6
COPY target/drinkingFortunes-2.7.5.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]