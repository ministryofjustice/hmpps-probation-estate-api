package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.GetProbationDeliveryUnitService

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class ProbationDeliveryUnitController(
  private val getProbationDeliveryUnitService: GetProbationDeliveryUnitService
) {

  @Operation(summary = "Retrieve Probation Delivery Unit by Code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "Result Not Found")
    ]
  )
  @PreAuthorize("hasRole('ROLE_MANAGE_A_WORKFORCE_ALLOCATE')")
  @GetMapping("/probationDeliveryUnit/{code}/teams")
  fun getProbationDeliveryUnitByCode(@PathVariable(required = true) code: String): Flux<TeamOverview> =
    getProbationDeliveryUnitService.findByCode(code)
//      .switchIfEmpty { Mono.error<EntityNotFoundException>(EntityNotFoundException("No Probation Delivery Unit found at $code")) }

}
