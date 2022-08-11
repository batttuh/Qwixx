FROM openjdk:17-alpine
WORKDIR /app
ADD grpc-service/target/grpc-service-1.0-SNAPSHOT.jar grpc-service-1.0-SNAPSHOT.jar
ADD proto ./proto
ENTRYPOINT [ "java","-cp","grpc-service-1.0-SNAPSHOT.jar","com.grpc.Application" ]