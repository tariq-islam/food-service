# We are basing this container off of the official Docker Hub Java container 
FROM java:latest
# Take the target directory and mount it on the container in /usr/src/food. This will contain the Spring Boot JAR file,
#   which was built using Jenkins
COPY target /usr/src/food
# Make /usr/src/food the workig directory of the container
WORKDIR /usr/src/food
# launch the Spring Boot application
CMD java -jar dbDemo-0.0.1-SNAPSHOT.jar

