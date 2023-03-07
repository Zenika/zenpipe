FROM gradle:latest AS build
COPY --chown=gradle:gradle . /home/gradle/src/producer
WORKDIR /home/gradle/src/producer
RUN gradle bootJar --no-daemon --stacktrace

FROM openjdk:17
EXPOSE 57892
COPY --from=build /home/gradle/src/producer/config/* config/
COPY --from=build /home/gradle/src/producer/build/libs/*.jar  zenpipe.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=composite,${PROFILE}", "-Dserver.port=57892", "/zenpipe.jar"]