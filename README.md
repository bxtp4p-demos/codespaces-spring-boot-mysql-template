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

### H2 Database (default)

```bash
cd app
mvn clean package
java -jar target/app-0.0.1-SNAPSHOT.jar
```

### MySQL Database

```bash
cd app
mvn clean package
java -jar -Dspring.profiles.active=mysql target/app-0.0.1-SNAPSHOT.jar
```

## How to test

Swagger UI is available. Due to a [known issue](https://github.com/orgs/community/discussions/15351#discussioncomment-4112535) with Codespaces port visibility and CORS, you will need to open this codespace in VS Code. Once you've done that and started the app, you can access Swagger UI at http://localhost:8080/swagger-ui/index.html.