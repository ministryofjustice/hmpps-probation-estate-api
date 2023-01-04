INSERT INTO region (code, name) VALUES('N56', 'East of England');

INSERT INTO pdu (code, name, region_code) VALUES('N56BEDS', 'Bedfordshire', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56BEDL', 'Bedfordshire SM', 'N56BEDS');
INSERT INTO team (code, name, ldu_code) VALUES('N56711', 'BDS-Bedford SM', 'N56BEDL');
INSERT INTO team (code, name, ldu_code) VALUES('N56716', 'BDS-Luton SM', 'N56BEDL');
INSERT INTO team (code, name, ldu_code) VALUES('N56BBO', 'BDS-Resettlement OM', 'N56BEDL');

INSERT INTO pdu (code, name, region_code) VALUES('N56CAMB', 'Cambridgeshire and Peterborough', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56CAML', 'Cambridgeshire and Peterborough SM', 'N56CAMB');
INSERT INTO team (code, name, ldu_code) VALUES('N56342', 'CBS-Cambridge SM', 'N56CAML');
INSERT INTO team (code, name, ldu_code) VALUES('N56354', 'CBS-Huntingdon SM', 'N56CAML');
INSERT INTO team (code, name, ldu_code) VALUES('N56332', 'CBS-Peterborough SM', 'N56CAML');
INSERT INTO team (code, name, ldu_code) VALUES('N56BAR', 'CBS-Wisbech SM', 'N56CAML');

INSERT INTO pdu (code, name, region_code) VALUES('N56ESXN', 'Essex North', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56ESNL', 'Essex North SM', 'N56ESXN');
INSERT INTO team (code, name, ldu_code) VALUES('N56N21', 'EXN-Chelmsford SM', 'N56ESNL');
INSERT INTO team (code, name, ldu_code) VALUES('N56N31', 'EXN-Colchester SM', 'N56ESNL');
INSERT INTO team (code, name, ldu_code) VALUES('N56N51', 'EXN-Harlow SM', 'N56ESNL');

INSERT INTO pdu (code, name, region_code) VALUES('N56ESXS', 'Essex South', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56ESSL', 'Essex South SM', 'N56ESXS');
INSERT INTO team (code, name, ldu_code) VALUES('N56N11', 'EXS-Basildon SM', 'N56ESSL');
INSERT INTO team (code, name, ldu_code) VALUES('N56N62', 'EXS-Southend SM', 'N56ESSL');
INSERT INTO team (code, name, ldu_code) VALUES('N56N41', 'EXS-Thurrock SM', 'N56ESSL');

INSERT INTO pdu (code, name, region_code) VALUES('N56HERT', 'Hertfordshire', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56HERL', 'Hertfordshire SM', 'N56HERT');
INSERT INTO team (code, name, ldu_code) VALUES('N56477', 'HFS-Cheshunt SM', 'N56HERL');
INSERT INTO team (code, name, ldu_code) VALUES('N56480', 'HFS-St Albans SM', 'N56HERL');
INSERT INTO team (code, name, ldu_code) VALUES('N56483', 'HFS-Stevenage SM', 'N56HERL');
INSERT INTO team (code, name, ldu_code) VALUES('N56486', 'HFS-Watford SM', 'N56HERL');

INSERT INTO pdu (code, name, region_code) VALUES('N56NOSU', 'Norfolk', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56NSLD', 'Norfolk SM', 'N56NOSU');
INSERT INTO team (code, name, ldu_code) VALUES('N56NAA', 'NFK-King\'s Lynn SM', 'N56NSLD');
INSERT INTO team (code, name, ldu_code) VALUES('N56210', 'NFK-Norwich SM', 'N56NSLD');

INSERT INTO pdu (code, name, region_code) VALUES('N56NRTH', 'Northamptonshire', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56NTSL', 'Northamptonshire SM', 'N56NRTH');
INSERT INTO team (code, name, ldu_code) VALUES('N56BAX', 'NTH-Kettering SM', 'N56NTSL');
INSERT INTO team (code, name, ldu_code) VALUES('N5603N', 'NTH-Northampton SM', 'N56NTSL');
INSERT INTO team (code, name, ldu_code) VALUES('N5602N', 'NTH-Wellingborough SM', 'N56NTSL');

INSERT INTO pdu (code, name, region_code) VALUES('N56SUFF', 'Suffolk', 'N56');
INSERT INTO ldu (code, name, pdu_code) VALUES('N56SUF', 'Suffolk SM', 'N56SUFF');
INSERT INTO team (code, name, ldu_code) VALUES('N56NAC', 'SFK-Bury St Edmunds SM', 'N56SUF');
INSERT INTO team (code, name, ldu_code) VALUES('N56NAD', 'SFK-Ipswich SM', 'N56SUF');
INSERT INTO team (code, name, ldu_code) VALUES('N56NAE', 'SFK-Lowestoft SM', 'N56SUF');