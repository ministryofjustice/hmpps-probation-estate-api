plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "4.4.1"
  kotlin("plugin.spring") version "1.7.10"
}

configurations {
  testImplementation { exclude(group = "org.junit.vintage") }
}

val springDocVersion by extra("1.6.10")

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")

  implementation("org.springdoc:springdoc-openapi-webflux-ui:$springDocVersion")
  implementation("org.springdoc:springdoc-openapi-kotlin:$springDocVersion")
  implementation("org.springdoc:springdoc-openapi-data-rest:$springDocVersion")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(18))
}
repositories {
  mavenCentral()
}

tasks {
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
      jvmTarget = "18"
    }
  }
}
