# hmpps-probation-estate-api

[![CircleCI](https://circleci.com/gh/ministryofjustice/hmpps-probation-estate-api/tree/main.svg?style=svg)](https://circleci.com/gh/ministryofjustice/hmpps-probation-estate-api)
[![API docs](https://img.shields.io/badge/API_docs-view-85EA2D.svg?logo=swagger)](https://hmpps-probation-estate-api-dev.hmpps.service.justice.gov.uk/swagger-ui.html)

This is the HMPPS Probation Estate API. This is used to serve Probation estate information

## How to run locally

### Run docker and launch the service in Intellij
* We need a postgres database to back the application and we can use a local docker one. The flyway scripts will deploy the schema and all lookup data we need for this application
* To launch the postgres docker container run the following:
```shell
docker compose up -d
```
* Open this repo in Intellij
* Right-click and Run `uk.gov.justice.digital.hmpps.hmppsprobationestateapi.HmppsProbationEstateApi`
* This will fail initially but will have created a `Run Configuration` called `HmppsProbationEstateApi` in the configuration dropdown next to the `Run` and `Debug` buttons
* Click on the `HmppsProbationEstateApi` configuration > `Edit Configuration`
* In the `VM Options` box paste the following:
```
-Dspring.profiles.active=local
```
* Save the configuration with the following:
    * Click `Apply`
    * Click `OK`
* You should now be able to `Run` and `Debug` the application using this configuration by hitting the `Run` and `Debug` buttons next to the configuration
* One the application is up and running

### Run service in Terminal
Execute the following command:
```shell
docker compose up -d
./gradlew bootRun -Dspring.profiles.active=local
```

## How to run the tests locally

These tests are defaults from the template, and the app only serves to run the flyway scripts. This allows you to test that the scripts work locally against postgresql in docker
```shell
docker compose up -d
./gradlew clean check
```

## Code style & formatting
```shell
./gradlew ktlintApplyToIdea addKtlintFormatGitPreCommitHook
```
will apply ktlint styles to intellij and also add a pre-commit hook to format all changed kotlin files.