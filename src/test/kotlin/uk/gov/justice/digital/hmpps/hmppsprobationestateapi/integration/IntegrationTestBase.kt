package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.reactive.server.WebTestClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.LocalDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.LocalDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@SpringBootTest(webEnvironment = RANDOM_PORT)
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class IntegrationTestBase {

  @Suppress("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  lateinit var webTestClient: WebTestClient

  @Autowired
  protected lateinit var regionRepository: RegionRepository

  @Autowired
  protected lateinit var probationDeliveryUnitRepository: ProbationDeliveryUnitRepository

  @Autowired
  protected lateinit var localDeliveryUnitRepository: LocalDeliveryUnitRepository

  @Autowired
  protected lateinit var teamRepository: TeamRepository

  @BeforeEach
  fun setupDependentServices() = runBlocking {
    teamRepository.deleteAll()
    localDeliveryUnitRepository.deleteAll()
    probationDeliveryUnitRepository.deleteAll()
    regionRepository.deleteAll()
  }

  protected fun setupWalesSingleLDU() = setupEstate(
    regionCode = "WS",
    regionName = "Wales",
    pduCode = "NW_PDU",
    pduName = "North Wales",
    lduCode = "NW_LDU",
    lduName = "North Wales",
    teams = listOf(
      Triple("WT1", "Wrexham - Team 1", false),
      Triple("TM2", "Ynys Mon - Team 1", false),
      Triple("DELETEDTEAM", "Deleted Team", true)
    )
  )

  protected fun setupLondonLDUs() {
    setupEstate(
      regionCode = "LN",
      regionName = "London",
      pduCode = "CI_PDU",
      pduName = "Camden, Islington",
      lduCode = "CI_LDU",
      lduName = "Camden And Islington LDU",
      teams = listOf(
        Triple("CAI1", "CAI 1", false),
        Triple("CAI2", "CAI 2", false)
      )
    )
    setupEstate(
      regionCode = "LN",
      regionName = "London",
      pduCode = "HC_PDU",
      pduName = "Hackney and City",
      lduCode = "HC_LDU",
      lduName = "Hackney LDU",
      teams = listOf(
        Triple("CRO1", "CRO 1", false),
        Triple("CRO2", "CRO 2", false)
      )
    )
  }

  protected fun setupWestMidlandsLDUs() {
    setupEstate(
      regionCode = "WM",
      regionName = "West Midlands Region",
      pduCode = "BC_PDU",
      pduName = "Birmingham Central and South",
      lduCode = "BC_LDU",
      lduName = "Birmingham Central and South",
      teams = listOf(
        Triple("CB1", "Central Birmingham 1", false),
        Triple("CB2", "Central Birmingham 1", false),
        Triple("SB1", "South Birmingham 1", false),
        Triple("SB2", "South Birmingham 2", false)
      )
    )
    setupEstate(
      regionCode = "WM",
      regionName = "West Midlands Region",
      pduCode = "COV_PDU",
      pduName = "Coventry",
      lduCode = "COV_LDU",
      lduName = "Coventry LDU",
      teams = listOf(
        Triple("COV1", "Coventry Team 1", false),
        Triple("COV2", "Coventry Team 2", false),
        Triple("COV4", "Coventry PQIP", false)
      )
    )
  }

  protected fun setupEstate(
    regionCode: String = "REGION1",
    regionName: String = "Region Name",
    pdus: List<Triple<String, String, Boolean>> = listOf(Triple("TM1", "Team Name", false)),
    pduCode: String = "PDU1",
    pduName: String = "PDU Name",
    lduCode: String = "LDU1",
    lduName: String = "LDU Name",
    teams: List<Triple<String, String, Boolean>> = listOf(Triple("TM1", "Team Name", false)),
  ): EstateOverview = runBlocking {
    val region = Region(code = regionCode, name = regionName, new = true)
    val probationDeliveryUnit = ProbationDeliveryUnit(code = pduCode, name = pduName, regionCode = region.code, new = true)
    val localDeliveryUnit = LocalDeliveryUnit(code = lduCode, name = lduName, pduCode = probationDeliveryUnit.code, new = true)
   if (!regionRepository.existsById(region.code)) {
      regionRepository.save(region)
    }
    if (!probationDeliveryUnitRepository.existsById(probationDeliveryUnit.code)) {
      probationDeliveryUnitRepository.save(probationDeliveryUnit)
    }
    if (!localDeliveryUnitRepository.existsById(localDeliveryUnit.code)) {
      localDeliveryUnitRepository.save(localDeliveryUnit)
    }
    EstateOverview(
      region,
      probationDeliveryUnit,
      teams = teams.map {
        val team = Team(
          code = it.first,
          name = it.second,
          lduCode = localDeliveryUnit.code,
          softDeleted = it.third,
          new = true
        )
        teamRepository.save(team)
        team
      }
    )
  }
}

data class EstateOverview (
  val region: Region,
  val probationDeliveryUnit: ProbationDeliveryUnit,
  val teams: List<Team>
)
