# Spring Learning Workspace

A collection of **Java and Spring learning exercises** covering dependency injection, product persistence and employee REST-controller examples. The source explores Spring Boot, Spring Data JPA, Jakarta Validation, Lombok and Maven.

## Explore the examples

| Area | Source |
| --- | --- |
| Dependency injection | [Cake, frosting and syrup examples](src/main/java/com/amrit/Module1Demo/) |
| Product persistence | [JPA entities and repository](src/main/java/com/codingshuttle/jpaTutorial/jpaTuts/) |
| Employee API exercises | [Controller](src/main/java/net/engineeringdigest/controllers/EmployeeController.java), [DTO](src/main/java/net/engineeringdigest/dto/EmployeeDTO.java) and [entity](src/main/java/net/engineeringdigest/entities/EmployeeEntity.java) |
| Test examples | [src/test/java](src/test/java/) |

## Current project status

This is an **incomplete study workspace**, not a packaged runnable backend. The root `pom.xml` is missing its opening project element and dependency coordinates/versions, and the employee controller references supporting service/error classes that are not present in the committed tree. The existing Maven workflow should not be treated as evidence of a successful build.

Read the individual examples to study constructor injection, repository interfaces, request mapping, CRUD/PATCH patterns and validation annotations. Before running the whole application, restore a valid Maven project and supply the missing supporting classes/configuration. A successful setup command or passing test result is not claimed here.

## Get the source

```sh
git clone https://github.com/amrit2603/Spring_Test.git
cd Spring_Test
```

The default branch is `master`. Existing tutorial-style package names are retained; source names and comments are part of the learning history. This documentation change does not modify application behavior or repair the incomplete build.
