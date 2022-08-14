FROM openjdk:17-alpine
WORKDIR /app
ADD grpc-service/target/grpc-service-1.0-SNAPSHOT-jar-with-dependencies.jar grpc-service-1.0-SNAPSHOT.jar
ADD proto ./proto
ENTRYPOINT [ "java","-jar","grpc-service-1.0-SNAPSHOT.jar"]