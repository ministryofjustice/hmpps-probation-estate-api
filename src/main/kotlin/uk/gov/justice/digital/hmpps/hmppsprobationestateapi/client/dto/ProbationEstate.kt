package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.client.dto

data class ProbationEstate(val providers: List<DeliusProvider> = emptyList())

data class DeliusProvider(val code: String = "", val description: String = "", val probationDeliveryUnits: List<DeliusPDU> = emptyList())

data class DeliusPDU(val code: String = "", val description: String = "", val localAdminUnits: List<DeliusLAU> = emptyList())

data class DeliusLAU(val code: String = "", val description: String = "", val teams: List<DeliusTeam> = emptyList())

data class DeliusTeam(val code: String = "", val description: String = "")
