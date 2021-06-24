# Start with a base image containing Java runtime
FROM openjdk:11

# Make port 8080 available to the world outside this container
EXPOSE 7000

# The application's jar file
ARG JAR_FILE=target/cicdjenkin-1.0.jar

# Add the application's jar to the container
ADD ${JAR_FILE} cicdjenkin.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/cicdjenkin.jar"]