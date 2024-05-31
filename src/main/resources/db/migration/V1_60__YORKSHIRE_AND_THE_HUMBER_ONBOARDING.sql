INSERT INTO region (code, name) VALUES('N55', 'Yorkshire and the Humber ');

INSERT INTO pdu (code, name, region_code) VALUES('N55BAS', 'Barnsley and Rotherham', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55BAC', 'Bradford and Calderdale', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55DNR', 'Doncaster', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55HER', 'Hull and East Riding', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55KIR', 'Kirklees', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55LEE', 'Leeds', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55NNEL', 'North and North East Lincs', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55YNY', 'North Yorkshire', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55SHF', 'Sheffield', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55WAK', 'Wakefield', 'N55');
INSERT INTO pdu (code, name, region_code) VALUES('N55YRK', 'York', 'N55');


INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NBS', 'Non OM Barnsley and Rotherham', 'N55BAS');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55BARL', 'Barnsley', 'N55BAS');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55ROTL', 'Rotherham', 'N55BAS');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NBC', 'Non OM Bradford and Calderdale', 'N55BAC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55BRAL', 'Bradford', 'N55BAC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55CAL', 'Calderdale', 'N55BAC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55DONL', 'Doncaster', 'N55DNR');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NDR', 'Non OM Doncaster', 'N55DNR');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NHEY', 'Non OM Hull and East Riding', 'N55HER');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55EYL', 'East Riding', 'N55HER');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55HUL', 'Hull', 'N55HER');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NKS', 'Non OM Kirklees', 'N55KIR');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55KIRL', 'Kirklees', 'N55KIR');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NLE', 'Non OM Leeds', 'N55LEE');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55LEEL', 'Leeds', 'N55LEE');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NNEL', 'Non OM North and NE Lincs', 'N55NNEL');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NELL', 'North East Lincolnshire', 'N55NNEL');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NOL', 'North Lincolnshire', 'N55NNEL');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NYNY', 'Non OM North Yorkshire', 'N55YNY');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NYL', 'North Yorkshire', 'N55YNY');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NSF', 'Non OM Sheffield', 'N55SHF');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55SHEL', 'Sheffield', 'N55SHF');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NWK', 'Non OM Wakefield', 'N55WAK');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55WAKL', 'Wakefield', 'N55WAK');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NOYK', 'Non OM York', 'N55YRK');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55YORL', 'York', 'N55YRK');

INSERT INTO team (code, name, ldu_code) VALUES('N55AA1', 'Awaiting Allocation Barnsley and Rotherham', 'N55NBS');
INSERT INTO team (code, name, ldu_code) VALUES('N55UBR', 'UPW - Barnsley and Rotherham Sentence Management', 'N55NBS');
INSERT INTO team (code, name, ldu_code) VALUES('N55BAC', 'Barnsley Community Integration Team', 'N55BARL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BM1', 'Barnsley Sentence Management Team 1', 'N55BARL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BM2', 'Barnsley Sentence Management Team 2', 'N55BARL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BM3', 'Barnsley Sentence Management Team 3', 'N55BARL');
INSERT INTO team (code, name, ldu_code) VALUES('N55RC1', 'Rotherham Community Integration Team', 'N55ROTL');
INSERT INTO team (code, name, ldu_code) VALUES('N55RS1', 'Rotherham Sentence Management Team 1', 'N55ROTL');
INSERT INTO team (code, name, ldu_code) VALUES('N55RS2', 'Rotherham Sentence Management Team 2', 'N55ROTL');
INSERT INTO team (code, name, ldu_code) VALUES('N55RS3', 'Rotherham Sentence Management Team 3', 'N55ROTL');

INSERT INTO team (code, name, ldu_code) VALUES('N55AA2', 'Awaiting Allocation Bradford and Calderdale', 'N55NBC');
INSERT INTO team (code, name, ldu_code) VALUES('N55BC1', 'Bradford Community Integration Team 1', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BC2', 'Bradford Community Integration Team 2', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BC3', 'Bradford Community Integration Team 3', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS1', 'Bradford Sentence Management Team 1', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS2', 'Bradford Sentence Management Team 2', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS3', 'Bradford Sentence Management Team 3', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS4', 'Bradford Sentence Management Team 4', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS5', 'Bradford Sentence Management Team 5', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS6', 'Bradford Sentence Management Team 6', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS7', 'Bradford Sentence Management Team 7', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS8', 'Bradford Sentence Management Team 8', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BS9', 'Bradford Sentence Management Team 9', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55BSA', 'Bradford Sentence Management Team 10', 'N55BRAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55CIM', 'Calderdale Community Integration Team 1', 'N55CAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55CM1', 'Calderdale Sentence Management Team 1', 'N55CAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55CM2', 'Calderdale Sentence Management Team 2', 'N55CAL');
INSERT INTO team (code, name, ldu_code) VALUES('N55CM3', 'Calderdale Sentence Management Team 3', 'N55CAL');

INSERT INTO team (code, name, ldu_code) VALUES('N55DS6', 'Doncaster Community Integration Team', 'N55DONL');
INSERT INTO team (code, name, ldu_code) VALUES('N55DS1', 'Doncaster Sentence Management Team 1', 'N55DONL');
INSERT INTO team (code, name, ldu_code) VALUES('N55DS2', 'Doncaster Sentence Management Team 2', 'N55DONL');
INSERT INTO team (code, name, ldu_code) VALUES('N55DS3', 'Doncaster Sentence Management Team 3', 'N55DONL');
INSERT INTO team (code, name, ldu_code) VALUES('N55DS4', 'Doncaster Sentence Management Team 4', 'N55DONL');
INSERT INTO team (code, name, ldu_code) VALUES('N55DS5', 'Doncaster Sentence Management Team 5', 'N55DONL');
INSERT INTO team (code, name, ldu_code) VALUES('N55AA4', 'Awaiting Allocation Doncaster', 'N55NDR');

INSERT INTO team (code, name, ldu_code) VALUES('N55KEA', 'Awaiting Allocation East Yorkshire', 'N55NHEY');
INSERT INTO team (code, name, ldu_code) VALUES('N55HCA', 'Awaiting Allocation Hull', 'N55NHEY');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS7', 'Beverley Sentence Management Team 7', 'N55EYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS8', 'Bridlington Sentence Management Team 8', 'N55EYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55ECI', 'East Riding Community Integration Team', 'N55EYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS9', 'Goole Sentence Management Team 9', 'N55EYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HC1', 'Hull Community Integration Team 1', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HC2', 'Hull Community Integration Team 2', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HC3', 'Hull Community Integration Team 3', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HC4', 'Hull Community Integration Team 4', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS1', 'Hull Sentence Management Team 1', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS2', 'Hull Sentence Management Team 2', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS3', 'Hull Sentence Management Team 3', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS4', 'Hull Sentence Management Team 4', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS5', 'Hull Sentence Management Team 5', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55HS6', 'Hull Sentence Management Team 6', 'N55HUL');
INSERT INTO team (code, name, ldu_code) VALUES('N55N55', 'Hull Sentence Management Team 10', 'N55HUL');

INSERT INTO team (code, name, ldu_code) VALUES('N55AAK', 'Awaiting Allocation Kirklees', 'N55NKS');
INSERT INTO team (code, name, ldu_code) VALUES('N55KS5', 'Kirklees Community Integration Team', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KS1', 'Kirklees Sentence Management Team 1', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KS2', 'Kirklees Sentence Management Team 2', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KS3', 'Kirklees Sentence Management Team 3', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KS4', 'Kirklees Sentence Management Team 4', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KUW', 'UPW - Kirklees Sentence Management Team 5', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KR6', 'Kirklees Sentence Management Team 6', 'N55KIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N55KS7', 'Kirklees Sentence Management Team 7', 'N55KIRL');

INSERT INTO team (code, name, ldu_code) VALUES('N55AA8', 'Awaiting Allocation Leeds', 'N55NLE');
INSERT INTO team (code, name, ldu_code) VALUES('N55LC1', 'Leeds Community Integration Team 1 (LSM7)', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LC2', 'Leeds Community Integration Team 2(LSM8)', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55L16', 'Leeds Community Integration Team 3 (LSM16)', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS1', 'Leeds Sentence Management Team 1', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS2', 'Leeds Sentence Management Team 2', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS3', 'Leeds Sentence Management Team 3', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS4', 'Leeds Sentence Management Team 4', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS5', 'Leeds Sentence Management Team 5', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS6', 'Leeds Sentence Management Team 6', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LS9', 'Leeds Sentence Management Team 9', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LSA', 'Leeds Sentence Management Team 10', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LSB', 'Leeds Sentence Management Team 11', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LSC', 'Leeds Sentence Management Team 12', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LSD', 'Leeds Sentence Management Team 13', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LSE', 'Leeds Sentence Management Team 14', 'N55LEEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55LSF', 'Leeds Sentence Management Team 15', 'N55LEEL');

INSERT INTO team (code, name, ldu_code) VALUES('N55GCA', 'Awaiting Allocation Grimsby', 'N55NNEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SEA', 'Awaiting Allocation Scunthorpe', 'N55NNEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NE5', 'Grimsby Community Integration Team', 'N55NELL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NE1', 'Grimsby Sentence Management Team 1', 'N55NELL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NE2', 'Grimsby Sentence Management Team 2', 'N55NELL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NE3', 'Grimsby Sentence Management Team 3', 'N55NELL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NE4', 'Grimsby Sentence Management Team 4', 'N55NELL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NL3', 'Scunthorpe Community Integration Team', 'N55NOL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NL1', 'Scunthorpe Sentence Management Team 1', 'N55NOL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NL2', 'Scunthorpe Sentence Management Team 2', 'N55NOL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SM3', 'Scunthorpe Sentence Management Team 3', 'N55NOL');

INSERT INTO team (code, name, ldu_code) VALUES('N55A13', 'Awaiting Allocation North Yorkshire', 'N55NYNY');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYH', 'Harrogate - NY Sentence Management Team 2', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYN', 'Northallerton - NY Sentence Management Team 3', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YNA', 'NY Community Integration Team East', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YNC', 'NY Community Integration Team Selby', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYB', 'NY Community Integration Team West', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYP', 'NY PQiP Sentence Management 7', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYL', 'Selby - NY Sentence Management Team 5', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYK', 'Skipton - NY Sentence Management Team 4', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YNU', 'UPW - NY Sentence Management Team 6', 'N55NYL');
INSERT INTO team (code, name, ldu_code) VALUES('N55NYS', 'Scarborough - NY Sentence Management Team 1', 'N55NYL');

INSERT INTO team (code, name, ldu_code) VALUES('N55SHF', 'Awaiting Allocation Sheffield', 'N55NSF');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS7', 'Sheffield Community Integration Team', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS1', 'Sheffield Sentence Management Team 1', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS2', 'Sheffield Sentence Management Team 2', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS3', 'Sheffield Sentence Management Team 3', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS4', 'Sheffield Sentence Management Team 4', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS5', 'Sheffield Sentence Management Team 5', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SS6', 'Sheffield Sentence Management Team 6', 'N55SHEL');
INSERT INTO team (code, name, ldu_code) VALUES('N55SH7', 'Sheffield Sentence Management Team 7', 'N55SHEL');

INSERT INTO team (code, name, ldu_code) VALUES('N55A12', 'Awaiting Allocation Wakefield', 'N55NWK');
INSERT INTO team (code, name, ldu_code) VALUES('N55WCI', 'Wakefield Community Integration Team', 'N55WAKL');
INSERT INTO team (code, name, ldu_code) VALUES('N55WS1', 'Wakefield Sentence Management Team 1', 'N55WAKL');
INSERT INTO team (code, name, ldu_code) VALUES('N55WS2', 'Wakefield Sentence Management Team 2', 'N55WAKL');
INSERT INTO team (code, name, ldu_code) VALUES('N55WS3', 'Wakefield Sentence Management Team 3', 'N55WAKL');
INSERT INTO team (code, name, ldu_code) VALUES('N55WS4', 'Wakefield Sentence Management Team 4', 'N55WAKL');
INSERT INTO team (code, name, ldu_code) VALUES('N55WS5', 'Wakefield Sentence Management Team 5', 'N55WAKL');

INSERT INTO team (code, name, ldu_code) VALUES('N55AAY', 'Awaiting Allocation York', 'N55NOYK');
INSERT INTO team (code, name, ldu_code) VALUES('N55YS5', 'York Community Integration Team', 'N55YORL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YS1', 'York Sentence Management Team 1', 'N55YORL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YS2', 'York Sentence Management Team 2', 'N55YORL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YS3', 'York Sentence Management Team 3', 'N55YORL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YS4', 'York Sentence Management Team 4', 'N55YORL');
INSERT INTO team (code, name, ldu_code) VALUES('N55YO5', 'York Sentence Management Team 5', 'N55YORL');