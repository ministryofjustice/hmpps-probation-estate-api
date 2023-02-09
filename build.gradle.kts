plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "5.1.0"
  kotlin("plugin.spring") version "1.8.10"
}

configurations {
  implementation { exclude(module = "spring-boot-starter-web") }
  implementation { exclude(module = "spring-boot-starter-tomcat") }
  testImplementation { exclude(group = "org.junit.vintage") }
}

dependencyCheck {
  suppressionFiles.add("suppressions.xml")
}

dependencies {

  implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
  runtimeOnly("org.springframework.boot:spring-boot-starter-jdbc")

  implementation("org.springframework.boot:spring-boot-starter-webflux")

  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.6.4")

  implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.0.2")

  runtimeOnly("org.flywaydb:flyway-core")
  runtimeOnly("org.postgresql:r2dbc-postgresql:1.0.0.RELEASE")
  runtimeOnly("org.postgresql:postgresql:42.5.3")

  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4")
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

tasks.named<JavaExec>("bootRun") {
  systemProperty("spring.profiles.active", "dev,docker")
}
