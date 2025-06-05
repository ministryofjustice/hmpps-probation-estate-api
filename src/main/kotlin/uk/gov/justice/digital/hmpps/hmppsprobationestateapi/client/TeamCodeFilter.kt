package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource
import org.springframework.stereotype.Component

@Component
class TeamCodeFilter(@Value("classpath:config/filtered-team-codes.json") private val resource: Resource) {

  private val objectMapper = jacksonObjectMapper()

  val includedTeamCodes: Set<String> by lazy {
    resource.inputStream.use { stream ->
      objectMapper.readValue(stream)
    }
  }
}
