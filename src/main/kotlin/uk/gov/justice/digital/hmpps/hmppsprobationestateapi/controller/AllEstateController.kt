package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllProbationDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.controller.dto.AllRegionDeliveryUnit
import uk.gov.justice.digital.hmpps.hmppsprobationestateapi.service.AllEstateService
import kotlin.code

@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class AllEstateController(private val allEstateService: AllEstateService) {

  @Operation(summary = "Get all estate by region code")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "Result Not Found"),
    ],
  )
  @GetMapping("/all/region/{regionCode}")
  suspend fun getEstateByRegionCode(@PathVariable(required = true) regionCode: String): Map<String, AllProbationDeliveryUnit> = allEstateService.getEstateByRegionCode(regionCode)

  @Operation(summary = "Get all probation estate")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "Result Not Found"),
    ],
  )
  @GetMapping("/all/regions")
  suspend fun getAllEstate(): Map<String, AllRegionDeliveryUnit> = allEstateService.getEntireEstate()

  @Operation(summary = "Get all probation estate as CSV")
  @ApiResponses(
    value = [
      ApiResponse(responseCode = "200", description = "OK"),
      ApiResponse(responseCode = "404", description = "Result Not Found"),
    ],
  )
  @GetMapping("/all/regions/csv", produces = ["text/csv"])
  suspend fun getAllEstateCsv(): String {
    val estate = allEstateService.getEntireEstate()
    val csvBuilder = StringBuilder()
    csvBuilder.append("regionName,pduName,lduName,teamCode,teamName\n")
    estate.forEach { (_, region) ->
      region.pdus.forEach { (_, pdu) ->
        pdu.ldus.forEach { (_, ldu) ->
          ldu.teams.forEach { team ->
            csvBuilder.append(
              "\"${region.name}\",\"${pdu.name}\",\"${ldu.name}\",\"${team.code}\",\"${team.name}\"\n",
            )
          }
        }
      }
    }
    return csvBuilder.toString()
  }
}
