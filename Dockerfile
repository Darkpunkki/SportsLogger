# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory of your Maven build
COPY target/SportsLogger-1.0-SNAPSHOT.jar /app/sportslogger.jar

# Command to run the Java application
ENTRYPOINT ["java", "-jar", "/app/sportslogger.jar"]
