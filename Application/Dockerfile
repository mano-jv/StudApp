FROM maven:3.6.3-jdk-11-slim as build
RUN apt-get update -y && apt-get install -y \
    zip && apt-get clean

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package --also-make -s /build/settings.xml

WORKDIR /usr/src/app/
RUN zip -r app.zip target

FROM java:8-jdk-alpine

RUN apk update && apk add \
vim \
dos2unix \
curl \
bash

COPY --from=build /usr/src/app/target/Application-0.0.1-SNAPSHOT.jar /usr/app/Application.jar

WORKDIR /usr/app

RUN sh -c 'touch Application-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Application-0.0.1-SNAPSHOT.jar"]