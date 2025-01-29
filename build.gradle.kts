plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "7.0.0"
  kotlin("plugin.spring") version "2.1.10"
}

ktlint {
  version.set("1.5.0")
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

  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.10.1")

  implementation("org.springdoc:springdoc-openapi-starter-webflux-ui:2.8.4")

  runtimeOnly("org.flywaydb:flyway-core")
  implementation("org.flywaydb:flyway-database-postgresql")
  runtimeOnly("org.postgresql:r2dbc-postgresql:1.0.7.RELEASE")
  runtimeOnly("org.postgresql:postgresql:42.7.5")

  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.1")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
repositories {
  mavenCentral()
}

tasks {
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    compilerOptions {
      jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
  }
}

tasks.named<JavaExec>("bootRun") {
  systemProperty("spring.profiles.active", "dev,docker")
}
