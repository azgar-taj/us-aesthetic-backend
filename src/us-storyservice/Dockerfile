FROM gradle:8.9.0-jdk17-alpine AS build

COPY . /home/gradle/src
WORKDIR /home/gradle/src

RUN gradle build --no-daemon

FROM openjdk:17-jdk-alpine

COPY --from=build /home/gradle/src/build/libs/*.jar /app.jar

EXPOSE 80

CMD ["java", "-jar", "/app.jar"]