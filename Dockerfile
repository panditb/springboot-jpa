FROM openjdk:8-jdk-alpine
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

COPY build/libs/springboot-jpa-0.0.1-SNAPSHOT.jar /app/app.jar
RUN chown appuser /app/app.jar && chgrp appgroup /app/app.jar

USER appuser
EXPOSE 9001
WORKDIR /app

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]