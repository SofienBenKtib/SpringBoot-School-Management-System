FROM openjdk:17
EXPOSE 8080
ADD build/libs/project-0.0.1-SNAPSHOT-plain.jar project-0.0.1-SNAPSHOT-plain.jar
ENTRYPOINT ["java","-jar","project-0.0.1-SNAPSHOT-plain.jar"]