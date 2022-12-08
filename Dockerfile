FROM openjdk:17
WORKDIR /
ADD target/gitlab-first-integration-0.0.1-SNAPSHOT.jar gitlab-first-integration-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","gitlab-first-integration-0.0.1-SNAPSHOT.jar"]