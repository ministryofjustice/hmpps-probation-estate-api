INSERT INTO region (code, name) VALUES('N54', 'North East Region');

INSERT INTO pdu (code, name, region_code) VALUES('N54SOT', 'Gateshead and South Tyneside', 'N54');

INSERT INTO team (code, name, pdu_code) VALUES('N54NGH', 'Gateshead 1', 'N54SOT');
INSERT INTO team (code, name, pdu_code) VALUES('N54NG2', 'Gateshead 2', 'N54SOT');
INSERT INTO team (code, name, pdu_code) VALUES('N54NAF', 'Gateshead 3', 'N54SOT');
INSERT INTO team (code, name, pdu_code) VALUES('N54PQ2', 'Gateshead and South Tyneside PQIP Team', 'N54SOT');
INSERT INTO team (code, name, pdu_code) VALUES('N54NST', 'South Tyneside 1', 'N54SOT');
INSERT INTO team (code, name, pdu_code) VALUES('N54NAT', 'South Tyneside 2', 'N54SOT');
