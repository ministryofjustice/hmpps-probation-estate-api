package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.dto.ProbationEstate

@Component
class DeliusClient(private val webClient: WebClient, private val teamCodeFilter: TeamCodeFilter, private val providerCodeFilter: ProviderCodeFilter) {
  @Cacheable("probationEstate")
  suspend fun getProbationEstate(): ProbationEstate {
    val fullEstate = webClient
      .get()
      .uri("/probation-estate")
      .retrieve()
      .awaitBody<ProbationEstate>()

    val filteredProviders = fullEstate.providers
      .filter { it.code in providerCodeFilter.includedProviderCodes }
      .mapNotNull { provider ->
        val filteredPdus = provider.probationDeliveryUnits
          .mapNotNull { pdu ->
            val filteredLaus = pdu.localAdminUnits
              .mapNotNull { lau ->
                val filteredTeams = lau.teams
                  .filter { it.code in teamCodeFilter.includedTeamCodes }
                if (filteredTeams.isNotEmpty()) lau.copy(teams = filteredTeams) else null
              }
            if (filteredLaus.isNotEmpty()) pdu.copy(localAdminUnits = filteredLaus) else null
          }
        if (filteredPdus.isNotEmpty()) provider.copy(probationDeliveryUnits = filteredPdus) else null
      }
    return fullEstate.copy(providers = filteredProviders)
  }
}
