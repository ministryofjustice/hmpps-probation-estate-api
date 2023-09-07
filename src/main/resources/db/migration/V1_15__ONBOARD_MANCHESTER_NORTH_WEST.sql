INSERT INTO region (code, name) VALUES('N50', 'Greater Manchester');
INSERT INTO pdu (code, name, region_code) VALUES ('N50BOLT', 'Bolton', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50BOL', 'Bolton', 'N50BOLT');

INSERT INTO pdu (code, name, region_code) VALUES ('N50ROBO', 'Bury and Rochdale', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50BUR', 'Bury', 'N50ROBO');
INSERT INTO team (code, name, ldu_code) VALUES ('N50BUR', 'GM BR Bury 1', 'N50BUR');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N50ROC', 'Rochdale', 'N50ROBO');
INSERT INTO team (code, name, ldu_code) VALUES ('N50RO2', 'GM BR Rochdale 1', 'N50ROC');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAI', 'GM BR Rochdale 2', 'N50ROC');

INSERT INTO pdu (code, name, region_code) VALUES ('N50MANC', 'Manchester North', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50MCN', 'Manchester North', 'N50MANC');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAC', 'GM Manchester N1', 'N50MCN');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAW', 'GM Manchester N2', 'N50MCN');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CHE', 'GM Manchester N3', 'N50MCN');
INSERT INTO team (code, name, ldu_code) VALUES ('N50MPL', 'GM Manchester N4', 'N50MCN');

INSERT INTO pdu (code, name, region_code) VALUES ('N50GMS', 'Manchester South', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50MCS', 'Manchester South', 'N50GMS');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAD', 'GM Manchester S1', 'N50MCS');
INSERT INTO team (code, name, ldu_code) VALUES ('N50LON', 'GM Manchester S2', 'N50MCS');
INSERT INTO team (code, name, ldu_code) VALUES ('N50MOS', 'GM Manchester S3', 'N50MCS');
INSERT INTO team (code, name, ldu_code) VALUES ('N50WYT', 'GM Manchester S4', 'N50MCS');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAX', 'GM Manchester S5', 'N50MCS');

INSERT INTO pdu (code, name, region_code) VALUES ('N50OLD', 'Oldham', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50OLD', 'Oldham', 'N50OLD');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAG', 'GM Oldham 1', 'N50OLD');
INSERT INTO team (code, name, ldu_code) VALUES ('N50OLD', 'GM Oldham 2', 'N50OLD');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAH', 'GM Oldham 3', 'N50OLD');
INSERT INTO team (code, name, ldu_code) VALUES ('N50RRO', 'GM Oldham 4', 'N50OLD');

INSERT INTO pdu (code, name, region_code) VALUES ('N50SATR', 'Salford', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50SAL', 'Salford', 'N50SATR');
INSERT INTO team (code, name, ldu_code) VALUES ('N50SA1', 'GM Salford 1', 'N50SAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N50SA2', 'GM Salford 2', 'N50SAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAE', 'GM Salford 3', 'N50SAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N50SAD', 'GM Salford 4', 'N50SAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N50842', 'GM Salford 5', 'N50SAL');

INSERT INTO pdu (code, name, region_code) VALUES ('N50STTR', 'Stockport and Trafford', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50STO', 'Stockport', 'N50STTR');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAK', 'GM ST Stockport 1', 'N50STO');
INSERT INTO team (code, name, ldu_code) VALUES ('N50ST3', 'GM ST Stockport 2', 'N50STO');
INSERT INTO team (code, name, ldu_code) VALUES ('N50ST4', 'GM ST Stockport 3', 'N50STO');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N50TRA', 'Trafford', 'N50STTR');
INSERT INTO team (code, name, ldu_code) VALUES ('N50TRA', 'GM ST Trafford 1', 'N50TRA');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAF', 'GM ST Trafford 2', 'N50TRA');

INSERT INTO pdu (code, name, region_code) VALUES ('N50TAST', 'Tameside', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50TAM', 'Tameside', 'N50TAST');
INSERT INTO team (code, name, ldu_code) VALUES ('N50TA2', 'GM Tameside 1', 'N50TAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N50TA1', 'GM Tameside 2', 'N50TAM');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAL', 'GM Tameside 3', 'N50TAM');

INSERT INTO pdu (code, name, region_code) VALUES ('N50WIBO', 'Wigan', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50WIG', 'Wigan', 'N50WIBO');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAO', 'GM Wigan 1', 'N50WIG');
INSERT INTO team (code, name, ldu_code) VALUES ('N50WI2', 'GM Wigan 2', 'N50WIG');
INSERT INTO team (code, name, ldu_code) VALUES ('N50CAR', 'GM Wigan 3', 'N50WIG');
INSERT INTO team (code, name, ldu_code) VALUES ('N50WI4', 'GM Wigan 4', 'N50WIG');
INSERT INTO team (code, name, ldu_code) VALUES ('N50WI5', 'GM Wigan 5', 'N50WIG');

INSERT INTO pdu (code, name, region_code) VALUES ('N50PPC', 'Public Protection Community', 'N50');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N50MMAP', 'MAPPA', 'N50PPC');
INSERT INTO team (code, name, ldu_code) VALUES ('N50MTR', 'MAPPT-MAPPA and Public Protection Team', 'N50MMAP');


INSERT INTO region (code, name) VALUES('N50', 'North West');
INSERT INTO pdu (code, name, region_code) VALUES ('N51BLDA', 'Blackburn and Darwen', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51BDRV', 'Blackburn and Darwen', 'N51BLDA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BL1', 'Blackburn 1', 'N51BDRV');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BL2', 'Blackburn 2', 'N51BDRV');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAE', 'Blackburn 3', 'N51BDRV');

INSERT INTO pdu (code, name, region_code) VALUES ('N51CTRL', 'Central Lancashire', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51CHLY', 'Chorley', 'N51CTRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CHO', 'Chorley 1', 'N51CHLY');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51CELA', 'Preston', 'N51CTRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N51PR1', 'Preston 1', 'N51CELA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51PR2', 'Preston 2', 'N51CELA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51PR3', 'Preston 3', 'N51CELA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CBI', 'Preston 4', 'N51CELA');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51SKEL', 'Skelmersdale', 'N51CTRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SKE', 'Skelmersdale 1', 'N51SKEL');

INSERT INTO pdu (code, name, region_code) VALUES ('N51CHES', 'Cheshire East', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51EACH', 'Crewe', 'N51CHES');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CRE', 'Crewe 1', 'N51EACH');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51MACC', 'Macclesfield', 'N51CHES');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MAC', 'Macclesfield 1', 'N51MACC');

INSERT INTO pdu (code, name, region_code) VALUES ('N51WCHE', 'Cheshire West', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51CST', 'Chester', 'N51WCHE');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CHE', 'Chester 1', 'N51CST');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CCD', 'Chester 2', 'N51CST');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51NWH', 'Northwich', 'N51WCHE');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WIN', 'Northwich 1', 'N51NWH');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CCB', 'Northwich 2', 'N51NWH');

INSERT INTO pdu (code, name, region_code) VALUES ('N51CUMB', 'Cumbria', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51BARR', 'Barrow', 'N51CUMB');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BAR', 'Barrow 1', 'N51BARR');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51CARL', 'Carlisle', 'N51CUMB');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAR', 'Carlisle 1', 'N51CARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAQ', 'Carlisle 3', 'N51CARL');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51KEND', 'Kendal', 'N51CUMB');
INSERT INTO team (code, name, ldu_code) VALUES ('N51KEN', 'Kendal 1', 'N51KEND');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51PRTH', 'Penrith', 'N51CUMB');
INSERT INTO team (code, name, ldu_code) VALUES ('N51PEN', 'Penrith 1', 'N51PRTH');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51WKTN', 'Workington', 'N51CUMB');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WOR', 'Workington 1', 'N51WKTN');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CBQ', 'Workington 2', 'N51WKTN');

INSERT INTO pdu (code, name, region_code) VALUES ('N51LSE', 'East Lancashire', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51ACCR', 'Accrington', 'N51LSE');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAC', 'Accrington 1', 'N51ACCR');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAF', 'Accrington 2', 'N51ACCR');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51BURN', 'Burnley', 'N51LSE');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BU1', 'Burnley 1', 'N51BURN');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BU2', 'Burnley 2', 'N51BURN');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAD', 'Burnley 3', 'N51BURN');

INSERT INTO pdu (code, name, region_code) VALUES ('N51HAWA', 'Halton and Warrington', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51HALT', 'Halton', 'N51HAWA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51HAL', 'Halton 1', 'N51HALT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CBZ', 'Halton 2', 'N51HALT');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51WAR', 'Warrington', 'N51HAWA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WAR', 'Warrington 1', 'N51WAR');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CCA', 'Warrington 2', 'N51WAR');

INSERT INTO pdu (code, name, region_code) VALUES ('N51KNST', 'Knowsley and St Helens', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51KNOS', 'Knowsley', 'N51KNST');
INSERT INTO team (code, name, ldu_code) VALUES ('N51KN1', 'Knowsley 1', 'N51KNOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51KN2', 'Knowsley 2', 'N51KNOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51KN3', 'Knowsley 3', 'N51KNOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51KN4', 'Knowsley 4', 'N51KNOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51KNU', 'Knowsley Unallocated', 'N51KNOS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MEI', 'Merseyside SO IOM', 'N51KNOS');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51STHS', 'St Helens', 'N51KNST');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SH1', 'St Helens 1', 'N51STHS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SH2', 'St Helens 2', 'N51STHS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SHU', 'St Helens Unallocated', 'N51STHS');

INSERT INTO pdu (code, name, region_code) VALUES ('N51LSF', 'Liverpool North', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51NLIS', 'Liverpool North', 'N51LSF');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NL1', 'Liverpool North 1', 'N51NLIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NL2', 'Liverpool North 2', 'N51NLIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NL3', 'Liverpool North 3', 'N51NLIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NL4', 'Liverpool North 4', 'N51NLIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NLS', 'Liverpool North 5', 'N51NLIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NLI', 'Liverpool North IOM', 'N51NLIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51NLU', 'Liverpool North Unallocated', 'N51NLIS');

INSERT INTO pdu (code, name, region_code) VALUES ('N51LPLS', 'Liverpool South', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51SOLI', 'Liverpool South', 'N51LPLS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SL1', 'Liverpool South 1', 'N51SOLI');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SL2', 'Liverpool South 2', 'N51SOLI');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SL3', 'Liverpool South 3', 'N51SOLI');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SL4', 'Liverpool South 4', 'N51SOLI');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SL5', 'Liverpool South 5', 'N51SOLI');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SLU', 'Liverpool South Unallocated', 'N51SOLI');

INSERT INTO pdu (code, name, region_code) VALUES ('N51LNW', 'North West Lancashire', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51NWLA', 'Blackpool', 'N51LNW');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BLA', 'Blackpool 1', 'N51NWLA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BLB', 'Blackpool 2', 'N51NWLA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BLC', 'Blackpool 3', 'N51NWLA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51BLD', 'Blackpool 4', 'N51NWLA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAL', 'Blackpool 5', 'N51NWLA');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CAM', 'Blackpool 6', 'N51NWLA');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51LANC', 'Lancaster', 'N51LNW');
INSERT INTO team (code, name, ldu_code) VALUES ('N51LAN', 'Lancaster 1', 'N51LANC');
INSERT INTO team (code, name, ldu_code) VALUES ('N51CBE', 'Lancaster 2', 'N51LANC');
INSERT INTO team (code, name, ldu_code) VALUES ('N51LCR', 'Lancaster 3', 'N51LANC');

INSERT INTO pdu (code, name, region_code) VALUES ('N51SEFT', 'Sefton', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51SEFT', 'Sefton', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SE2', 'Sefton 2', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SE3', 'Sefton 3', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SE4', 'Sefton 4', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MAE', 'Sefton 5', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MAH', 'Sefton 6', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SEI', 'Sefton IOM', 'N51SEFT');
INSERT INTO team (code, name, ldu_code) VALUES ('N51SEU', 'Sefton Unallocated', 'N51SEFT');

INSERT INTO pdu (code, name, region_code) VALUES ('N51WSHW', 'Wirral', 'N51');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N51WIRS', 'Wirral', 'N51WSHW');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WI1', 'Wirral 1', 'N51WIRS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WI2', 'Wirral 2', 'N51WIRS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WI3', 'Wirral 3', 'N51WIRS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WI5', 'Wirral 5', 'N51WIRS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WI6', 'Wirral 6', 'N51WIRS');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WIU', 'Wirral Unallocated', 'N51WIRS');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N51WSRV', 'Womens Services', 'N51WSHW');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MBB', 'Women 2', 'N51WSRV');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MAX', 'Women 3', 'N51WSRV');
INSERT INTO team (code, name, ldu_code) VALUES ('N51MAJ', 'Women 4', 'N51WSRV');
INSERT INTO team (code, name, ldu_code) VALUES ('N51WWU', 'Women Unallocated', 'N51WSRV');
