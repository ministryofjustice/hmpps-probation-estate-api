package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview

@Service
class GetProbationDeliveryUnitService(
  private val probationEstateService: ProbationEstateService,
) {

  suspend fun getProbationDeliveryUnitDetailsByCode(pduCode: String): ProbationDeliveryUnitDetails? {
    val estate = probationEstateService.getProbationEstate()

    val (provider, pdu) = estate.providers
      .firstNotNullOfOrNull { provider ->
        provider.probationDeliveryUnits
          .firstOrNull { it.code == pduCode }
          ?.let { pdu -> provider to pdu }
      } ?: return null

    val teams = pdu.localAdminUnits
      .flatMap { it.teams }
      .map { TeamOverview(it.code, it.description) }

    val region = RegionOverview(provider.code, provider.description)

    return ProbationDeliveryUnitDetails(
      code = pdu.code,
      name = pdu.description,
      region = region,
      teams = teams,
    )
  }
}
