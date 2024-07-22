FROM amazoncorretto:18-alpine
WORKDIR /app
COPY /target/git-actions-test-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","git-actions-test-0.0.1-SNAPSHOT.jar"]