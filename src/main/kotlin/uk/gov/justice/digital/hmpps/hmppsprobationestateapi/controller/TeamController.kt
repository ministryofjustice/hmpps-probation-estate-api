package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.TeamOverview
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.GetTeamService

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class TeamController(
  private val getTeamService: GetTeamService
) {

  @Operation(summary = "Search teams by code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK")
    ]
  )
  @PreAuthorize("hasRole('ROLE_MANAGE_A_WORKFORCE_ALLOCATE')")
  @GetMapping("/team/search")
  fun getTeamsByCode(@RequestParam(required = true) codes: List<String>): Flux<TeamOverview> =
    getTeamService.findTeamsByCode(codes)
}
