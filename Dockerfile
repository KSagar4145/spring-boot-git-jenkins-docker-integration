# Use the official OpenJDK base image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
#WORKDIR /app

# Copy the JAR file into the container at /app
#COPY target/spring-boot-docker.jar /app/spring-boot-docker.jar
ADD target/spring-boot-git-jenkins-docker-integration.jar spring-boot-git-jenkins-docker-integration.jar

# Expose the port that the application will run on
EXPOSE 9090

# Define the command to run your application
#CMD ["java", "-jar", "spring-boot-docker.jar"]
ENTRYPOINT [ "java", "-jar", "/spring-boot-git-jenkins-docker-integration.jar" ]