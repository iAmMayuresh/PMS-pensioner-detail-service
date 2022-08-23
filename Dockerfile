FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD "target/pensioner-detail-service.jar" "pensioner-detail-service.jar"
ENTRYPOINT [ "java", "-jar", "/pensioner-detail-service.jar" ]