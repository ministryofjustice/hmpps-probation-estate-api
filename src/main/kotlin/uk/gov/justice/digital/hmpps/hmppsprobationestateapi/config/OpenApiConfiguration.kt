package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.servers.Server
import org.springframework.boot.info.BuildProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfiguration(buildProperties: BuildProperties) {
  private val version: String = buildProperties.version

  @Bean
  fun customOpenAPI(): OpenAPI = OpenAPI()
    .servers(
      listOf(
        Server().url("https://hmpps-probation-estate-api-dev.hmpps.service.justice.gov.uk").description("Development"),
        Server().url("https://hmpps-probation-estate-api-preprod.hmpps.service.justice.gov.uk").description("PreProd"),
        Server().url("https://hmpps-probation-estate-api.hmpps.service.justice.gov.uk").description("Prod"),
        Server().url("http://localhost:8080").description("Local"),
      )
    )
    .info(
      Info().title("HMPPS Probation Estate")
        .version(version)
        .description("HMPPS Probation Estate")
        .contact(Contact().name("HMPPS Digital Studio").email("feedback@digital.justice.gov.uk"))
    )
}
