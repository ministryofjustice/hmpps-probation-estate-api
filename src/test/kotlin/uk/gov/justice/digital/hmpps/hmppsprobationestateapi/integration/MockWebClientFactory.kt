package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.ClientRequest
import org.springframework.web.reactive.function.client.ClientResponse
import org.springframework.web.reactive.function.client.ExchangeFunction
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class MockWebClientFactory {

  lateinit var responseProvider: (ClientRequest) -> ClientResponse
  fun create(): WebClient {
    val exchangeFunction = ExchangeFunction { request ->
      Mono.just(responseProvider.invoke(request))
    }

    return WebClient.builder().exchangeFunction(exchangeFunction).build()
  }

  fun setJsonResponse(json: String, status: HttpStatus = HttpStatus.OK) {
    responseProvider = {
      ClientResponse.create(status)
        .header("Content-Type", "application/json")
        .body(json)
        .build()
    }
  }
}
