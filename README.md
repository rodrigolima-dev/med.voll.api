# Med Voll API

A Java 17 and Spring Boot learning project for managing doctor and patient records. It was built while studying REST APIs, validation, persistence, and Flyway migrations. It is a course-based exercise, not a production medical system.

## What is implemented

- Doctor and patient registration, listing, updates, and logical deletion through `/medicos` and `/pacientes`.
- Request validation and paginated lists.
- MySQL persistence with Flyway schema migrations.

## Run locally

1. Install Java 17 and start a local MySQL instance.
2. Create an empty database named `vollmed` and a local database user with access to it.
3. Set `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_USERNAME`, and `SPRING_DATASOURCE_PASSWORD` for that local database. Example URL: `jdbc:mysql://localhost:3306/vollmed`.
4. Run `./mvnw spring-boot:run` on macOS/Linux or `.\mvnw.cmd spring-boot:run` on Windows.

The application is configured for local development. Do not use real patient data. Flyway applies the included migrations to the configured database when the app starts.

## Check the code

- Controllers: `src/main/java/med/voll/api/controller`
- Data model and validation: `src/main/java/med/voll/api/doctor` and `src/main/java/med/voll/api/patient`
- Migrations: `src/main/resources/db/migration`
- Current automated check: `./mvnw test` or `.\mvnw.cmd test`; it contains an application-context smoke test, not full endpoint coverage.

## Resumo em português

Projeto de estudo em Java 17 e Spring Boot para cadastro de médicos e pacientes. Demonstra APIs REST, validação, MySQL e migrations Flyway. Use apenas dados fictícios e um banco local. Os testes automatizados atuais cobrem a inicialização da aplicação; testes de endpoint ainda são uma melhoria pendente.
