FROM openjdk:latest
LABEL authors="talipov_sn"
LABEL version="1.0"
COPY ./out/production/TSN_Java_for_Docker/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]