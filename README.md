# hmpps-probation-estate-api

[![CircleCI](https://circleci.com/gh/ministryofjustice/hmpps-probation-estate-api/tree/main.svg?style=svg)](https://circleci.com/gh/ministryofjustice/hmpps-probation-estate-api)
[![API docs](https://img.shields.io/badge/API_docs-view-85EA2D.svg?logo=swagger)](https://hmpps-probation-estate-api-dev.hmpps.service.justice.gov.uk/swagger-ui.html)

This is the HMPPS Probation Estate API. This is used to serve Probation estate information

## Instructions

To run locally use docker to create a Postgres instance with the following command:

```shell
docker compose up -d
```

Then execute the command
```shell
./gradlew bootRun
```

## testing

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