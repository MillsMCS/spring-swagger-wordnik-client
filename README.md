# spring-swagger-wordnik-client

## Creation

This was created by Swagger with this command line:
```shell
java -jar swagger-codegen-cli-2.4.17.jar generate   -i https://developer.wordnik.com/api-docs/swagger.json   --api-package edu.mills.cs180a.wordnik.client.api   --model-package edu.mills.cs180a.wordnik.client.model   --invoker-package edu.mills.cs180a.wordnik.client.invoker   --group-id cs180a --artifact-id spring-swagger-codegen-feign-api-client   --artifact-version 0.0.1-SNAPSHOT   -l java   --library feign  -o spring-swagger-codegen-feign-api-client
```
I then manually:
* Changed the name from `spring-swagger-codegen-feign-api-client` to `spring-swagger-wordnik-client`
* Added needed dependencies to `pom.xml`
* Changed the compiler version to 15
* Replaced `LocalDate` with `OffsetDateTime` in models in which it appeared
* Added a `Main` class and method.

The rest of this document was auto-generated.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
    <groupId>cs180a</groupId>
    <artifactId>spring-swagger-codegen-feign-api-client</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.



