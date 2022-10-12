package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.reactive.server.WebTestClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.ProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Region
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.entities.Team
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
  protected lateinit var teamRepository: TeamRepository

  @BeforeEach
  fun setupDependentServices() = runBlocking {
    teamRepository.deleteAll()
    probationDeliveryUnitRepository.deleteAll()
    regionRepository.deleteAll()
  }

  fun setupEstate(teamCode: String = "TM1"): EstateOverview = runBlocking {
    val region = Region(code = "REGION1", name = "Region Name", new = true)
    val probationDeliveryUnit = ProbationDeliveryUnit(code = "PDU1", name = "PDU Name", regionCode = region.code, new = true)
    val team = Team(code = teamCode, name = "Team Name", pduCode = probationDeliveryUnit.code, new = true)
    if (!regionRepository.existsById(region.code)) {
      regionRepository.save(region)
    }
    if (!probationDeliveryUnitRepository.existsById(probationDeliveryUnit.code)) {
      probationDeliveryUnitRepository.save(probationDeliveryUnit)
    }
    teamRepository.save(team)
    EstateOverview(region, probationDeliveryUnit, team)
  }
}

data class EstateOverview constructor(val region: Region, val probationDeliveryUnit: ProbationDeliveryUnit, val team: Team)
