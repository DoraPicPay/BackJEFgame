# First stage: build the app
FROM ubuntu:latest AS build

# Install dependencies: JDK and Maven
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
RUN apt-get install maven -y

# Set the working directory and copy the project files
WORKDIR /app
COPY . .

# Run the Maven build
RUN mvn clean install

# Second stage: create the final image
FROM openjdk:17-jdk-slim

# Expose port 8080
EXPOSE 8080

# Copy the JAR file from the build stage to the final image
COPY --from=build /app/target/Viviane-0.0.1-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT [ "java", "-jar", "app.jar" ]
