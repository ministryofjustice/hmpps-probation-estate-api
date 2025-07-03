package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service

import org.springframework.stereotype.Service
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllLocalDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllRegionDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview

@Service
class AllEstateService(private val probationEstateService: ProbationEstateService) {

  suspend fun getEstateByRegionCode(code: String): Map<String, AllProbationDeliveryUnit> {
    val estate = probationEstateService.getProbationEstate()
    val provider = estate.providers.firstOrNull { it.code == code } ?: return emptyMap()

    return provider.probationDeliveryUnits.associate { pdu ->
      val ldus = pdu.localAdminUnits.associate { lau ->
        lau.code to AllLocalDeliveryUnit(
          name = lau.description,
          teams = lau.teams.map { team ->
            TeamOverview(code = team.code, name = team.description)
          },
        )
      }
      pdu.code to AllProbationDeliveryUnit(name = pdu.description, ldus = ldus)
    }
  }

  suspend fun getEntireEstate(): Map<String, AllRegionDeliveryUnit> {
    val estate = probationEstateService.getProbationEstate()

    return estate.providers.associate { provider ->
      val pdus = provider.probationDeliveryUnits.associate { pdu ->
        val ldus = pdu.localAdminUnits.associate { lau ->
          lau.code to AllLocalDeliveryUnit(
            name = lau.description,
            teams = lau.teams.map { team ->
              TeamOverview(code = team.code, name = team.description)
            },
          )
        }
        pdu.code to AllProbationDeliveryUnit(name = pdu.description, ldus = ldus)
      }

      provider.code to AllRegionDeliveryUnit(name = provider.description, pdus = pdus)
    }
  }
}
