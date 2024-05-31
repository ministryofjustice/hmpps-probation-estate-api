package uk.gov.justice.digital.hmpps.hmppsprobationestateapi.integration.stubs

const val REGIONS_BY_TEAM_CODES_REQUEST_BODY = """
  {
   "teamCodes":[
      "CB1",
      "SB1",
      "WT1",
      "DELETEDTEAM",
      "CAI2",
      "COV4",
      "CRO1",
      "CB1"
   ]
}
"""

const val REGIONS_BY_TEAM_CODES_RESPONSE_BODY = """
[
   {
      "region":{
         "code":"LN",
         "name":"London"
      },
      "team":{
         "code":"CAI2",
         "name":"CAI 2"
      }
   },
   {
      "region":{
         "code":"WM",
         "name":"West Midlands Region"
      },
      "team":{
         "code":"CB1",
         "name":"Central Birmingham 1"
      }
   },
   {
      "region":{
         "code":"WM",
         "name":"West Midlands Region"
      },
      "team":{
         "code":"COV4",
         "name":"Coventry PQIP"
      }
   },
   {
      "region":{
         "code":"LN",
         "name":"London"
      },
      "team":{
         "code":"CRO1",
         "name":"CRO 1"
      }
   },
   {
      "region":{
         "code":"WM",
         "name":"West Midlands Region"
      },
      "team":{
         "code":"SB1",
         "name":"South Birmingham 1"
      }
   },
   {
      "region":{
         "code":"WS",
         "name":"Wales"
      },
      "team":{
         "code":"WT1",
         "name":"Wrexham - Team 1"
      }
   }
]
"""
