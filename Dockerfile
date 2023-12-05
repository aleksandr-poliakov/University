# Use the official OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file to the container
COPY target/*.jar ./app.jar
COPY run.sh ./run.sh
RUN chmod +x run.sh

# Set the environment variables
ENV DB_URL=jdbc:postgresql://db:32770/university
ENV DB_USER=postgres
ENV DB_PASS=postgres


ENV PORT=8080
ENV PROFILE=default
ENV CONTEXT_PATH=
ENV APP_URL=http://localhost:8080
ENV REGISTER_CONFIRM_EMAIL=TRUE

# Expose the port on which your Spring Boot application runs
EXPOSE 8080

# Set the entrypoint command to run the Spring Boot application
ENTRYPOINT ["/app/run.sh"]
