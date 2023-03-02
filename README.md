# zenpipe

This project uses those dependencies:

- JDK17
- Spring Boot
- Spring Cloud Config
- Feign

## Configure your application

To run this project you need to set those environment variables:

- API_KEY: Secret token to authorize your request, you can generate it by flowing this
  url https://pipedrive.readme.io/docs/how-to-find-the-api-token
- PATH_CONFIG_ZENPIPE: Path to your configuration YAML file "application.yml"

### Configure your application-*.yml:

you should add names and ids for deal customs fields and organization customs fields, tou can get this information by
using pipedrive-api documentation https://developers.pipedrive.com/docs/api/v1/DealFields.
You should also add uri of your pipedrive application in uri-pipedrive field

## Running the application in dev mode

```shell script
./gradlew bootRun --args='--spring.profiles.active=composite,dev'
```

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

- It produces the `ZENPIPE*.jar` file in the `build/libs` directory.

- is now runnable using `java -jar build/libs/ZENPIPE_*.jar --Dspring.profiles.active=composite,dev'`.

## Running the application using docker

To run your application in container you can use this command:

```shell script
docker-compose up
```

