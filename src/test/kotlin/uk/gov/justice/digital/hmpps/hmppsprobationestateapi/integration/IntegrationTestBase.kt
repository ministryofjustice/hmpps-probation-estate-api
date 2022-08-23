package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.mockserver.configuration.Configuration
import org.mockserver.integration.ClientAndServer
import org.mockserver.model.HttpRequest
import org.mockserver.model.HttpResponse
import org.mockserver.model.MediaType
import org.slf4j.event.Level
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.http.HttpHeaders
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.reactive.server.WebTestClient
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.ProbationDeliveryUnitRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.RegionRepository
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.repositories.TeamRepository

@SpringBootTest(webEnvironment = RANDOM_PORT)
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class IntegrationTestBase {

  private var oauthMock: ClientAndServer =
    ClientAndServer.startClientAndServer(Configuration.configuration().logLevel(Level.WARN), 9090)

  @Autowired
  protected lateinit var objectMapper: ObjectMapper

  @Suppress("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  lateinit var webTestClient: WebTestClient

  @Autowired
  protected lateinit var jwtAuthHelper: JwtAuthHelper

  @Autowired
  protected lateinit var regionRepository: RegionRepository

  @Autowired
  protected lateinit var probationDeliveryUnitRepository: ProbationDeliveryUnitRepository

  @Autowired
  protected lateinit var teamRepository: TeamRepository

  @BeforeEach
  fun setupDependentServices() {
    oauthMock.reset()
    setupOauth()
    teamRepository.deleteAll()
      .then(probationDeliveryUnitRepository.deleteAll())
      .then(regionRepository.deleteAll())
      .block()
  }

  @AfterAll
  fun tearDownServer() {
    oauthMock.stop()
  }

  internal fun HttpHeaders.authToken(roles: List<String> = emptyList()) {
    this.setBearerAuth(
      jwtAuthHelper.createJwt(
        subject = "SOME_USER",
        roles = roles,
        clientId = "some-client"
      )
    )
  }

  fun setupOauth() {
    val response = HttpResponse.response().withContentType(MediaType.APPLICATION_JSON)
      .withBody(objectMapper.writeValueAsString(mapOf("access_token" to "ABCDE", "token_type" to "bearer")))
    oauthMock.`when`(HttpRequest.request().withPath("/auth/oauth/token")).respond(response)
  }
}
