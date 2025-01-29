package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import kotlinx.coroutines.flow.Flow
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamDetails
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.exception.EntityNotFoundException
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.GetTeamService

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class TeamController(
  private val getTeamService: GetTeamService,
) {

  @Operation(summary = "Search teams by code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
    ],
  )
  @GetMapping("/team/search")
  suspend fun getTeamsByCode(@RequestParam(required = true) codes: List<String>): Flow<TeamOverview> = getTeamService.findTeamsByCode(codes)

  @Operation(summary = "Get team by code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "NOT FOUND"),
    ],
  )
  @GetMapping("/team/{teamCode}")
  suspend fun getTeamByCode(@PathVariable teamCode: String): TeamDetails = getTeamService.findTeamDetailsByCode(teamCode) ?: throw EntityNotFoundException("No team found for $teamCode")
}
