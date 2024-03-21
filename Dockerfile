#Versión del JDK
FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

#Puerto por el cual será lanzado el servicio/microservicio
EXPOSE 8080

#Archivo .jar creado con MVN
ADD target/spring-boot-docker.jar spring-boot-docker.jar

#Donde se va a acceder el container entrypoint
ENTRYPOINT [ "java", "-jar", "/spring-boot-docker.jar" ]