package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.DeliusClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.dto.ProbationEstate

@Service
open class ProbationEstateService(private val deliusClient: DeliusClient) {
  @Cacheable("probationEstate")
  open suspend fun getProbationEstate(): ProbationEstate = deliusClient.getProbationEstate()
}
