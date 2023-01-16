package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.db.mapping

data class AllEstateRegionRow(
  val pduCode: String,
  val pduName: String,
  val lduCode: String,
  val lduName: String,
  val teamCode: String,
  val teamName: String,
)
