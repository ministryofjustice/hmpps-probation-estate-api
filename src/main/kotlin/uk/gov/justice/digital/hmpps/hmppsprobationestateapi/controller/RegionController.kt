package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import kotlinx.coroutines.flow.Flow
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.RegionOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.GetRegionService

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class RegionController(private val getRegionService: GetRegionService) {

  @Operation(summary = "Get all regions")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK")
    ]
  )
  @GetMapping("/regions")
  suspend fun getAllRegions(): Flow<RegionOverview> =
    getRegionService.getAll()

  @Operation(summary = "Get region by code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "Result Not Found")
    ]
  )
  @GetMapping("/region/{code}")
  suspend fun getRegionByCode(@PathVariable(required = true) code: String): RegionDetails =
    getRegionService.getRegionDetailsByCode(code) ?: throw EntityNotFoundException("No region found for $code")
}
