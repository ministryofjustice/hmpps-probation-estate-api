INSERT INTO region (code, name) VALUES('N53', 'East Midlands Region');
INSERT INTO pdu (code, name, region_code) VALUES ('N53DRBY', 'Derby City', 'N53');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N53DCTY', 'Derby City', 'N53DRBY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DEC', 'Derby City', 'N53DCTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DAH', 'Derby City 2', 'N53DCTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DAI', 'Derby City 3', 'N53DCTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DC4', 'Derby City 4', 'N53DCTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DA5', 'Derby City Allocations', 'N53DCTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PQ5', 'Derby City PQIP', 'N53DCTY');

INSERT INTO pdu (code, name, region_code) VALUES ('N53DERS', 'Derbyshire', 'N53');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N53DBSL', 'Derbyshire', 'N53DERS');
INSERT INTO team (code, name, ldu_code) VALUES ('N53BUX', 'Buxton', 'N53DBSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53CHE', 'Chesterfield', 'N53DBSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53ILK', 'Derbyshire County East', 'N53DBSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DCK', 'Derbyshire County South', 'N53DBSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PQ4', 'Derbyshire PQIP', 'N53DBSL');

INSERT INTO pdu (code, name, region_code) VALUES ('N53LEIS', 'Leicester, Leicestershire and Rutland', 'N53');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N53LEIL', 'Leicester', 'N53LEIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LC1', 'Leicester City 1', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LC2', 'Leicester City 2', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LC3', 'Leicester City 3', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DBB', 'Leicester City 4', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DBC', 'Leicester City 5', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LC6', 'Leicester City 6', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LC7', 'Leicester City 7', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LC8', 'Leicester City 8', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LCA', 'Leicester City Allocations', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LCP', 'Leicester City PQIP', 'N53LEIL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LWT', 'Leicester Womens', 'N53LEIL');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N53LCSL', 'Leicestershire and Rutland', 'N53LEIS');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LIO', 'Leicestershire Priority IOM', 'N53LCSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53CLM', 'Leics County North East', 'N53LCSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53CSW', 'Leics County South West', 'N53LCSL');

INSERT INTO pdu (code, name, region_code) VALUES ('N53EWL', 'Lincolnshire East and West', 'N53');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N53EAL', 'Lincolnshire East', 'N53EWL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PP3', 'Boston', 'N53EAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LPP', 'Skegness', 'N53EAL');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N53WEL', 'Lincolnshire West', 'N53EWL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PPP', 'Grantham', 'N53WEL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PP2', 'Lincoln 1', 'N53WEL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LAH', 'Lincoln 2', 'N53WEL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LI3', 'Lincoln 3', 'N53WEL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53LIA', 'Lincoln City Allocations', 'N53WEL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PQ3', 'Lincolnshire PQIP', 'N53WEL');

INSERT INTO pdu (code, name, region_code) VALUES ('N53NOCY', 'Nottingham City', 'N53');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N53NOTL', 'Nottingham', 'N53NOCY');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NC1', 'Nottingham City 1', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NC2', 'Nottingham City 2', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NC3', 'Nottingham City 3', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NC4', 'Nottingham City 4', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NC5', 'Nottingham City 5', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NC6', 'Nottingham City 6', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NCA', 'Nottingham City Allocations', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53DBP', 'Nottingham City IOM-SU', 'N53NOTL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PQ2', 'Nottingham City PQIP', 'N53NOTL');

INSERT INTO pdu (code, name, region_code) VALUES ('N53NOTS', 'Nottinghamshire', 'N53');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N53NTSL', 'Nottinghamshire ', 'N53NOTS');
INSERT INTO team (code, name, ldu_code) VALUES ('N53MAS', 'Mansfield and Ashfield', 'N53NTSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NNT', 'North Nottinghamshire', 'N53NTSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53PQ1', 'Nottinghamshire PQIP', 'N53NTSL');
INSERT INTO team (code, name, ldu_code) VALUES ('N53NOS', 'Nottinghamshire South', 'N53NTSL');


