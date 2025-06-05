package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import io.mockk.mockk
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository
import org.springframework.web.reactive.function.client.WebClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.DeliusClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.TeamCodeFilter

@TestConfiguration
class DeliusClientTestConfig {

  @Bean
  fun mockWebClientFactory() = MockWebClientFactory()

  @Bean
  fun webClient(factory: MockWebClientFactory): WebClient = factory.create()

  @Bean
  fun teamCodeFilter(): TeamCodeFilter = TeamCodeFilter(
    resource = ClassPathResource("config/filtered-team-codes.json"),
  )

  @Bean
  fun reactiveClientRegistrationRepository(): ReactiveClientRegistrationRepository = mockk(relaxed = true)

  @Bean
  fun reactiveOAuth2AuthorizedClientService(): ReactiveOAuth2AuthorizedClientService = mockk(relaxed = true)

  @Bean
  fun deliusClient(webClient: WebClient): DeliusClient = DeliusClient(webClient, teamCodeFilter())
}
