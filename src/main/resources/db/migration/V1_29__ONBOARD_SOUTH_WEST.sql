INSERT INTO region (code, name) VALUES('N58', 'South west');
INSERT INTO pdu (code, name, region_code) VALUES ('N58BNS', 'Bath and North Somerset', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58BNEL', 'Bath and North Somerset', 'N58BNS');
INSERT INTO team (code, name, ldu_code) VALUES ('N58BAN', 'BNS Sent Mgmt - Bath', 'N58BNEL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58NSO', 'BNS Sent Mgmt - Weston', 'N58BNEL');

INSERT INTO pdu (code, name, region_code) VALUES ('N58BSG', 'Bristol and South Gloucestershire', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58BRL', 'Bristol and South Gloucestershire', 'N58BSG');
INSERT INTO team (code, name, ldu_code) VALUES ('N58BR1', 'BSG Sent Mgmt - Bristol', 'N58BRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58BIO', 'BSG Sent Mgmt - Bristol IOM', 'N58BRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58U25', 'BSG Sent Mgmnt - Bristol Under 25', 'N58BRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58BSW', 'BSG Sent Mgmnt - Bristol Women', 'N58BRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58SGL', 'BSG Sent Mgmnt -  South Gloucestershire', 'N58BRL');

INSERT INTO pdu (code, name, region_code) VALUES ('N58CIOS', 'Cornwall and Isles of Scilly', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58CIOS', 'Cornwall and Isles of Scilly', 'N58CIOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N58MWE', 'CIOS Sent Mgmt - Camborne & Truro', 'N58CIOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N58MEA', 'CIOS Sent Mgmt - St Austell', 'N58CIOS');

INSERT INTO pdu (code, name, region_code) VALUES ('N58DEV', 'Devon and Torbay', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58DETO', 'Devon and Torbay', 'N58DEV');
INSERT INTO team (code, name, ldu_code) VALUES ('N58DTN', 'DEV Sent Mgmt - Barnstaple', 'N58DETO');
INSERT INTO team (code, name, ldu_code) VALUES ('N58DTE', 'DEV Sent Mgmt - Exeter', 'N58DETO');
INSERT INTO team (code, name, ldu_code) VALUES ('N58DTT', 'DEV Sent Mgmt - Torbay', 'N58DETO');

INSERT INTO pdu (code, name, region_code) VALUES ('N58DORS', 'Dorset', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58DORS', 'Dorset', 'N58DORS');
INSERT INTO team (code, name, ldu_code) VALUES ('N58BOA', 'DOR Sent Mgmt - Bournemouth', 'N58DORS');
INSERT INTO team (code, name, ldu_code) VALUES ('N58WWP', 'DOR Sent Mgmt - Dorchester & Weymouth', 'N58DORS');
INSERT INTO team (code, name, ldu_code) VALUES ('N58DAS', 'DOR Sent Mgmt - Poole', 'N58DORS');

INSERT INTO pdu (code, name, region_code) VALUES ('N58GLW', 'Gloucestershire', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58GLOL', 'Gloucestershire', 'N58GLW');
INSERT INTO team (code, name, ldu_code) VALUES ('N58GCT', 'GCS Sent Mgmt - Cheltenham & Tewkesbury', 'N58GLOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58GGF', 'GCS Sent Mgmt - Gloucester & Coleford', 'N58GLOL');

INSERT INTO pdu (code, name, region_code) VALUES ('N58PLCO', 'Plymouth', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58PLCI', 'Plymouth', 'N58PLCO');
INSERT INTO team (code, name, ldu_code) VALUES ('N58MPL', 'PLY Sent Mgmt - Plymouth 1', 'N58PLCI');
INSERT INTO team (code, name, ldu_code) VALUES ('N58DAL', 'PLY Sent Mgmt - Plymouth 2', 'N58PLCI');

INSERT INTO pdu (code, name, region_code) VALUES ('N58SOM', 'Somerset', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58SOL', 'Somerset', 'N58SOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N58BRI', 'SOM Sent Mgmt - Bridgwater', 'N58SOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58TAU', 'SOM Sent Mgmt - Taunton', 'N58SOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N58YEO', 'SOM Sent Mgmt - Yeovil', 'N58SOL');

INSERT INTO pdu (code, name, region_code) VALUES ('N58SWWI', 'Swindon and Wiltshire', 'N58');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N58SWWI', 'Swindon and Wiltshire', 'N58SWWI');
INSERT INTO team (code, name, ldu_code) VALUES ('N58WCH', 'WTS Sent Mgmt - Chippenham', 'N58SWWI');
INSERT INTO team (code, name, ldu_code) VALUES ('N58WSA', 'WTS Sent Mgmt - Salisbury', 'N58SWWI');
INSERT INTO team (code, name, ldu_code) VALUES ('N58WS1', 'WTS Sent Mgmt - Swindon 1', 'N58SWWI');
