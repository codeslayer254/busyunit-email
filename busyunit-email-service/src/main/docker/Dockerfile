FROM abrtech/alpine-oraclejdk8
VOLUME /tmp
ADD busyunit-email-service-1.0.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dapp.port=${app.port}", "-jar","/app.jar"]
LABEL maintainer ="Ram Ayall"