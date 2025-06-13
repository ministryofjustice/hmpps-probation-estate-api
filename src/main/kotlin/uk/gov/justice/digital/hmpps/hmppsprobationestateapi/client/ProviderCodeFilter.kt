package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.io.Resource
import org.springframework.stereotype.Component

@Component
class ProviderCodeFilter(@Value("classpath:config/filtered-provider-codes.json") private val providerCodeResource: Resource) {

  private val objectMapper = jacksonObjectMapper()

  val includedProviderCodes: Set<String> by lazy {
    providerCodeResource.inputStream.use { stream ->
      objectMapper.readValue(stream)
    }
  }
}
