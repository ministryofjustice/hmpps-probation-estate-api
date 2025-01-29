package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.ProbationDeliveryUnitDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.GetProbationDeliveryUnitService

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class ProbationDeliveryUnitController(
  private val getProbationDeliveryUnitService: GetProbationDeliveryUnitService,
) {

  @Operation(summary = "Get Probation Delivery Unit by code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "Result Not Found"),
    ],
  )
  @GetMapping("/probationDeliveryUnit/{code}")
  suspend fun getProbationDeliveryUnitByCode(@PathVariable(required = true) code: String): ProbationDeliveryUnitDetails = getProbationDeliveryUnitService.getProbationDeliveryUnitDetailsByCode(code) ?: throw EntityNotFoundException("No Probation Delivery Unit found for $code")
}
