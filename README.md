# codespaces-spring-boot-mysql-template

A template that can be used for creating a Spring Boot application with a MySQL backend.

## What's included

1. A MySQL server container
1. A Spring Boot app preconfigured with Spring Initializr and includes:
   - spring-boot-starter-web
   - spring-boot-starter-data-jpa
   - spring-boot-starter-test
   - mysql-connector-java
   - spring-boot-devtools

This also includes the Spring Initializr plugin so you can add additional starters as needed.

## How to use

To use this template, click on the `Use this template button` and select `Open in a codespace`.

## How to run

```bash
cd app
mvn clean package
java -jar target/app-0.0.1-SNAPSHOT.jar
```
