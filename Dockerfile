FROM openjdk:latest
LABEL authors="talip"
LABEL version="1.0"
LABEL description="This is a docker image for TSN_Java_for_Docker"
LABEL maintainer="talip"
COPY ./out/production/TSN_Java_for_Docker/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]