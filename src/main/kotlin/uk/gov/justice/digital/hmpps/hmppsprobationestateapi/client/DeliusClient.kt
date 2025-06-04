package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.dto.ProbationEstate

@Component
class DeliusClient(private val webClient: WebClient) {
  suspend fun getProbationEstate(): ProbationEstate = webClient
    .get()
    .uri("/probation-estate")
    .retrieve()
    .awaitBody()
}
