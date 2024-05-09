INSERT INTO region (code, name) VALUES('N57', 'Kent Surrey Sussex Region');

INSERT INTO pdu (code, name, region_code) VALUES('N57SUS', 'Brighton and East Sussex', 'N57');
INSERT INTO pdu (code, name, region_code) VALUES('N57EKNT', 'East Kent', 'N57');
INSERT INTO pdu (code, name, region_code) VALUES('N57SUR', 'Surrey', 'N57');
INSERT INTO pdu (code, name, region_code) VALUES('N57UAT', 'Unallocated Level2(N57)', 'N57');
INSERT INTO pdu (code, name, region_code) VALUES('N57KECL', 'West Kent', 'N57');
INSERT INTO pdu (code, name, region_code) VALUES('N57WSUS', 'West Sussex', 'N57');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N57SUSL', 'Brighton and East Sussex OM', 'N51PPC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N57EKNT', 'East Kent OM', 'N51PPC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N57SURL', 'Surrey OM', 'N51PPC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N57UAT', 'Unallocated Level2(N57)', 'N51PPC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N57KTLD', 'West Kent OM', 'N51PPC');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N57WSUS', 'West Sussex OM', 'N51PPC');

INSERT INTO team (code, name, ldu_code) VALUES('N57BRP', 'SXE-Brighton', 'N57SUSL');
INSERT INTO team (code, name, ldu_code) VALUES('N57EAP', 'SXE-Eastbourne', 'N57SUSL');
INSERT INTO team (code, name, ldu_code) VALUES('N57HAP', 'SXE-Hastings', 'N57SUSL');
INSERT INTO team (code, name, ldu_code) VALUES('N57SPQ', 'SXE-PQIP', 'N57SUSL');
INSERT INTO team (code, name, ldu_code) VALUES('N57SS1', 'SXE-Short Term Sentences', 'N57SUSL');
INSERT INTO team (code, name, ldu_code) VALUES('N57CP3', 'SXE-CP Standalone', 'N57SUSL');

INSERT INTO team (code, name, ldu_code) VALUES('N57KAB', 'KTE-Ashford', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57K10', 'KTE-Canterbury', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57EKP', 'KTE-PQIP', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57KBE', 'KTE-Ramsgate', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57KBI', 'KTE-Sittingbourne', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57K12', 'KTE-South East Kent', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57K15', 'KTE-Thanet', 'N57EKNT');
INSERT INTO team (code, name, ldu_code) VALUES('N57CP1', 'KTE-CP Standalone', 'N57EKNT');


INSERT INTO team (code, name, ldu_code) VALUES('N57GUP', 'SRY-Guildford', 'N57SURL');
INSERT INTO team (code, name, ldu_code) VALUES('N57SPP', 'SRY-PQIP', 'N57SURL');
INSERT INTO team (code, name, ldu_code) VALUES('N57REP', 'SRY-Redhill', 'N57SURL');
INSERT INTO team (code, name, ldu_code) VALUES('N57STP', 'SRY-Staines', 'N57SURL');
INSERT INTO team (code, name, ldu_code) VALUES('N57CP5', 'SRY-CP Standalone', 'N57SURL');

INSERT INTO team (code, name, ldu_code) VALUES('N57UAT', 'Unallocated Team(N57)', 'N57UAT');

INSERT INTO team (code, name, ldu_code) VALUES('N57KAG', 'KTW-Chatham', 'N57KTLD');
INSERT INTO team (code, name, ldu_code) VALUES('N57KAS', 'KTW-Gravesend', 'N57KTLD');
INSERT INTO team (code, name, ldu_code) VALUES('N57KBB', 'KTW-Maidstone', 'N57KTLD');
INSERT INTO team (code, name, ldu_code) VALUES('N57K13', 'KTW-Medway', 'N57KTLD');
INSERT INTO team (code, name, ldu_code) VALUES('N57PQP', 'KTW-PQIP', 'N57KTLD');
INSERT INTO team (code, name, ldu_code) VALUES('N57KBM', 'KTW-Tunbridge Wells', 'N57KTLD');
INSERT INTO team (code, name, ldu_code) VALUES('N57CP2', 'KTW-CP Standalone', 'N57KTLD');

INSERT INTO team (code, name, ldu_code) VALUES('N57S09', 'SXW-Crawley', 'N57WSUS');
INSERT INTO team (code, name, ldu_code) VALUES('N57S08', 'SXW-Littlehampton', 'N57WSUS');
INSERT INTO team (code, name, ldu_code) VALUES('N57XWP', 'SXW-PQIP', 'N57WSUS');
INSERT INTO team (code, name, ldu_code) VALUES('N57S29', 'SXW-Worthing', 'N57WSUS');
INSERT INTO team (code, name, ldu_code) VALUES('N57CP4', 'SXW-CP Standalone', 'N57WSUS');



