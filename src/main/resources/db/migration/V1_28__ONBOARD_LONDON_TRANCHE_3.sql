INSERT INTO pdu (code, name, region_code) VALUES ('LDNBDN', 'Barking and Dagenham and Havering', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNBDN', 'Barking Dagenham Havering LDU', 'LDNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07BAH', 'Awaiting Allocation Barking Dagenham Havering', 'LDNNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07501', 'BDH 1', 'LDNNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07502', 'BDH 2', 'LDNNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07DH3', 'BDH 3', 'LDNNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBL', 'BDH 4', 'LDNNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBN', 'BDH 5', 'LDNNBDN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBX', 'BDH PQiP', 'LDNNBDN');

INSERT INTO pdu (code, name, region_code) VALUES ('N07BRNT', 'Brent', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNBRE', 'Brent LDU', 'N07BRNT');
INSERT INTO team (code, name, ldu_code) VALUES ('N07BNT', 'Awaiting Allocation Brent', 'LDNNBRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U01', 'BRE 1', 'LDNNBRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U02', 'BRE 2', 'LDNNBRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBK', 'BRE 3', 'LDNNBRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBM', 'BRE 4', 'LDNNBRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V02', 'BRE PQiP', 'LDNNBRE');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNNCAI', 'Camden, Islington', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNCAI', 'Camden & Islington LDU', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07CAU', 'Awaiting Allocation Camden', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07ISU', 'Awaiting Allocation Islington', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07523', 'CAI 1', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07524', 'CAI 2', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07525', 'CAI 3', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07526', 'CAI 4 PQiP', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBT', 'CAI 5', 'LDNNCAI');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBU', 'CAI 6', 'LDNNCAI');

INSERT INTO pdu (code, name, region_code) VALUES ('N07CROY', 'Croydon', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNCRO', 'Croydon LDU', 'N07CROY');
INSERT INTO team (code, name, ldu_code) VALUES ('N07CRU', 'Awaiting Allocation Croydon', 'LDNNCRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07530', 'CRO 1', 'LDNNCRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07531', 'CRO 2', 'LDNNCRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07532', 'CRO 3', 'LDNNCRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07601', 'CRO 4', 'LDNNCRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBR', 'CRO 5', 'LDNNCRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V04', 'CRO PQiP', 'LDNNCRO');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNEHH', 'Ealing and Hillingdon', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNEAL', 'Ealing LDU', 'LDNEHH');
INSERT INTO team (code, name, ldu_code) VALUES ('N07EAL', 'Awaiting Allocation Ealing', 'LDNNEAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07358', 'EAH PQiP', 'LDNNEAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07537', 'EAL 1', 'LDNNEAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07538', 'EAL 2', 'LDNNEAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07609', 'EAL 3', 'LDNNEAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCF', 'EAL 4', 'LDNNEAL');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNHIL', 'HILLINGDON LDU', 'LDNEHH');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HLG', 'Awaiting Allocation HILLINGDON', 'LDNNHIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07542', 'HIL 1', 'LDNNHIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HIL', 'HIL 2', 'LDNNHIL');

INSERT INTO pdu (code, name, region_code) VALUES ('N07ENFH', 'Enfield and Haringey', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNENF', 'Enfield LDU', 'N07ENFH');
INSERT INTO team (code, name, ldu_code) VALUES ('N07BRT', 'Awaiting Allocation Enfield', 'LDNNENF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07EHP', 'ENF & HAR PQiP', 'LDNNENF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U03', 'ENF 1', 'LDNNENF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U04', 'ENF 2', 'LDNNENF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCP', 'ENF 3', 'LDNNENF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V05', 'ENF PQiP', 'LDNNENF');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNHAR', 'Haringey LDU', 'N07ENFH');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HRU', 'Awaiting Allocation Haringey', 'LDNNHAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07563', 'HAR 1', 'LDNNHAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07564', 'HAR 2', 'LDNNHAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HAR', 'HAR 3', 'LDNNHAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCO', 'HAR 4', 'LDNNHAR');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNBBG', 'Greenwich and Bexley', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNBEX', 'Bexley LDU', 'LDNBBG');
INSERT INTO team (code, name, ldu_code) VALUES ('N07BRU', 'Awaiting Allocation Bexley', 'LDNNBEX');
INSERT INTO team (code, name, ldu_code) VALUES ('N07515', 'BEX 1', 'LDNNBEX');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBQ', 'BEX 2', 'LDNNBEX');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V07', 'BEX PQiP', 'LDNNBEX');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNGRE', 'Greenwich LDU', 'LDNBBG');
INSERT INTO team (code, name, ldu_code) VALUES ('N07GRU', 'Awaiting Allocation Greenwich', 'LDNNGRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07518', 'GRE 1', 'LDNNGRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07519', 'GRE 2', 'LDNNGRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCI', 'GRE 3', 'LDNNGRE');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V08', 'GRE PQiP', 'LDNNGRE')

INSERT INTO pdu (code, name, region_code) VALUES ('LDNNHTH', 'Hackney and City', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNHAC', 'Hackney LDU', 'LDNNHTH');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HAU', 'Awaiting Allocation Hackney', 'LDNNHAC');
INSERT INTO team (code, name, ldu_code) VALUES ('N07547', 'HAC 1', 'LDNNHAC');
INSERT INTO team (code, name, ldu_code) VALUES ('N07548', 'HAC 2', 'LDNNHAC');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCM', 'HAC 3', 'LDNNHAC');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCN', 'HAC 4', 'LDNNHAC');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V09', 'HAC PQiP', 'LDNNHAC');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNBEB', 'Harrow and Barnet', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNBAR', 'Barnet LDU', 'LDNBEB');
INSERT INTO team (code, name, ldu_code) VALUES ('N07BBR', 'Awaiting Allocation Barnet', 'LDNNBAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U05', 'BAR 1', 'LDNNBAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBO', 'BAR 2', 'LDNNBAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V11', 'BAR PQiP', 'LDNNBAR');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNHRW', 'Harrow LDU', 'LDNBEB');
INSERT INTO team (code, name, ldu_code) VALUES ('N07GRU', 'Awaiting Allocation Greenwich', 'LDNNHRW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07540', 'HRW 1', 'LDNNHRW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCH', 'HRW 2', 'LDNNHRW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V12', 'HRW PQiP', 'LDNNHRW');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNHKR', 'Kingston Richmond and Hounslow', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNHOU', 'Hounslow LDU', 'LDNHKR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HOU', 'Awaiting Allocation Hounslow', 'LDNNHOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07572', 'HOU 1', 'LDNNHOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCL', 'HOU 2', 'LDNNHOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V13', 'HOU PQiP', 'LDNNHOU');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNKAR', 'Kingston and Richmond LDU', 'LDNHKR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07KRU', 'Awaiting Allocation Kingston & Richmond', 'LDNNKAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07574', 'KAR 1', 'LDNNKAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V14', 'KAR PQiP', 'LDNNKAR');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNLAW', 'Lambeth', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNLAM', 'Lambeth LDU', 'LDNLAW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LAU', 'Awaiting Allocation Lambeth', 'LDNNLAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07578', 'LAM 1', 'LDNNLAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LCL', 'LAM 2', 'LDNNLAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V13', 'LAM 3', 'LDNNLAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07HOU', 'LAM 4', 'LDNNLAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07572', 'LAM 5', 'LDNNLAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V15', 'LAM PQiP', 'LDNNLAM');

INSERT INTO pdu (code, name, region_code) VALUES ('N07LEBR', 'Lewisham and Bromley', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNBRO', 'Bromley LDU', 'N07LEBR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07BMY', 'Awaiting Allocation Bromley', 'LDNNBRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07517', 'BRO 1', 'LDNNBRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LBP', 'BRO 2', 'LDNNBRO');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V16', 'BRO PQiP', 'LDNNBRO');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNLEW', 'Lewisham LDU', 'N07LEBR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LHM', 'Awaiting Allocation Lewisham', 'LDNNLEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07585', 'LEW 1', 'LDNNLEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07586', 'LEW 2', 'LDNNLEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LDE', 'LEW 3', 'LDNNLEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LDG', 'LEW 4', 'LDNNLEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V17', 'LAM 5', 'LDNNLEW');

INSERT INTO pdu (code, name, region_code) VALUES ('N07NEWM', 'Newham', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNNEW', 'Newham LDU', 'N07NEWM');
INSERT INTO team (code, name, ldu_code) VALUES ('N07NEH', 'Awaiting Allocation Newham', 'LDNNNEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07503', 'NEW 1', 'LDNNNEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07504', 'NEW 2', 'LDNNNEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07NWM', 'NEW 3', 'LDNNNEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LDK', 'NEW 4', 'LDNNNEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LDL', 'NEW 5', 'LDNNNEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V18', 'NEW PQiP', 'LDNNNEW');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNHRWF', 'Redbridge and Waltham Forest', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNRWF', 'Redbridge LDU', 'LDNHRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07REU', 'Awaiting Allocation Redbridge', 'LDNNRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07568', 'RWF 3', 'LDNNRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07610', 'RWF 4', 'LDNNRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U06', 'RWF 5', 'LDNNRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07U07', 'RWF 6', 'LDNNRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V19', 'RWF PQiP', 'LDNNRWF');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N07WALF', 'Waltham Forest LDU', 'LDNHRWF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07WFU', 'Awaiting Allocation Waltham Forest', 'N07WALF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07566', 'RWF 1', 'N07WALF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07567', 'RWF 2', 'N07WALF');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNNLAS', 'Southwark', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNSOU', 'Southwark LDU', 'LDNNLAS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07STH', 'Awaiting Allocation Southwark', 'LDNNSOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07588', 'SOU 1', 'LDNNSOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07589', 'SOU 2', 'LDNNSOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07611', 'SOU 3 PQiP', 'LDNNSOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LEB', 'SOU 4', 'LDNNSOU');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LEC', 'SOU 5', 'LDNNSOU');

INSERT INTO pdu (code, name, region_code) VALUES ('N07TOWH', 'Tower Hamlets', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNTWR', 'Tower Hamlets LDU', 'N07TOWH');
INSERT INTO team (code, name, ldu_code) VALUES ('N07550', 'TWR 1', 'LDNNTWR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07588', 'TWR 2', 'LDNNTWR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07589', 'TWR 3', 'LDNNTWR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07611', 'TWR 4', 'LDNNTWR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V20', 'TWR 5 PQiP', 'LDNNTWR');
INSERT INTO team (code, name, ldu_code) VALUES ('N07TH6', 'TWR 6', 'LDNNTWR');

INSERT INTO pdu (code, name, region_code) VALUES ('LDNCMS', 'Wandsworth, Merton and Sutton', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNMAS', 'Merton & Sutton LDU', 'LDNCMS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07MEU', 'Awaiting Allocation Merton & Sutton', 'LDNNMAS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07534', 'MAS 1', 'LDNNMAS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LDB', 'MAS 2', 'LDNNMAS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LDC', 'MAS 3', 'LDNNMAS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V21', 'MAS PQiP', 'LDNNMAS');

INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNWAN', 'Wandsworth LDU', 'LDNCMS');
INSERT INTO team (code, name, ldu_code) VALUES ('N07WAU', 'Awaiting Allocation Wandsworth', 'LDNNWAN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07581', 'WAN 1', 'LDNNWAN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07N78', 'WAN 2', 'LDNNWAN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07LEM', 'WAN 3', 'LDNNWAN');
INSERT INTO team (code, name, ldu_code) VALUES ('N07599', 'WAN PQiP', 'LDNNWAN');
