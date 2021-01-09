FROM amazoncorretto:11.0.7

LABEL maintainer="sarouar.hossain10@gmail.com"

VOLUME /temp

EXPOSE 8080

ARG JAR_FILE=application/build/libs/*.jar

ADD ${JAR_FILE} application.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/application.jar"]