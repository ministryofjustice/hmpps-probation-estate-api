plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "4.4.1"
  kotlin("plugin.spring") version "1.7.10"
}

configurations {
  implementation { exclude(module = "spring-boot-starter-web") }
  implementation { exclude(module = "spring-boot-starter-tomcat") }
  testImplementation { exclude(group = "org.junit.vintage") }
}

val springDocVersion by extra("1.6.10")

dependencies {

  implementation("io.jsonwebtoken:jjwt:0.9.1")
  implementation("io.opentelemetry:opentelemetry-api:1.17.0")

  implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
  runtimeOnly("org.springframework.boot:spring-boot-starter-jdbc")

  implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
  implementation("org.springframework.boot:spring-boot-starter-webflux")

  implementation("org.springdoc:springdoc-openapi-webflux-ui:$springDocVersion")
  implementation("org.springdoc:springdoc-openapi-kotlin:$springDocVersion")

  runtimeOnly("org.flywaydb:flyway-core")
  runtimeOnly("io.r2dbc:r2dbc-postgresql:0.8.12.RELEASE")
  runtimeOnly("org.postgresql:postgresql")

  testImplementation("org.mock-server:mockserver-netty:5.13.2")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(18))
}

tasks {
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
      jvmTarget = "18"
    }
  }
}
