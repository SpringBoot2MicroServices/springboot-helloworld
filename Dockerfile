From openjdk:8
EXPOSE 9090
ADD target/sb-devops-automation.jar sb-devops-automation.jar
ENTRYPOINT ["java", "-jar", "/"]