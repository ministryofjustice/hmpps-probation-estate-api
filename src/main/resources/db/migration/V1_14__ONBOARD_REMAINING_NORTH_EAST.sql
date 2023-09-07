INSERT INTO pdu (code, name, region_code) VALUES ('N54DUR', 'County Durham and Darlington', 'N54');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NOR', 'Durham', 'N54DUR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PQ1', 'County Durham and Darlington PQIP Team', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DUC', 'North Durham 1', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DAG', 'North Durham 2', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54ND3', 'North Durham 3', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PET', 'Peterlee 1', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NOR', 'Peterlee 2', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DUW', 'South Durham 1', 'N54NOR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DAI', 'Durham & Darlington IOM', 'N54NOR');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54DUR', 'Darlington', 'N54DUR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DAR', 'Darlington 1', 'N54DUR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DA2', 'Darlington 2', 'N54DUR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NEA', 'South Durham 2', 'N54DUR');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NOD', 'Non OM County Durham and Darlington', 'N54DUR');
INSERT INTO team (code, name, ldu_code) VALUES ('N54AA5', 'Awaiting allocation County Durham Darlington', 'N54NOD');

INSERT INTO pdu (code, name, region_code) VALUES ('N54NUTY', 'Newcastle Upon Tyne', 'N54');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NEW', 'Newcastle Upon Tyne', 'N54NUTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NAD', 'Newcastle 1', 'N54NEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NE2', 'Newcastle 2', 'N54NEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NE3', 'Newcastle 3', 'N54NEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NE4', 'Newcastle 4', 'N54NEW');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PQ3', 'Newcastle Upon Tyne PQIP Team', 'N54NEW');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54ONUT', 'Non Om Newcastle Upon Tyne', 'N54NUTY');
INSERT INTO team (code, name, ldu_code) VALUES ('N54A12', 'Awaiting allocation Newcastle Upon Tyne', 'N54ONUT');

INSERT INTO pdu (code, name, region_code) VALUES ('N54NOT', 'North Tyneside and Northumberland', 'N54');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NTS', 'North Tyneside', 'N54NOT');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NTS', 'North Tyneside', 'N54NTS');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PQ4', 'North Tyneside and Northumberland PQIP Team', 'N54NTS');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NIO', 'Northumbria IOM', 'N54NTS');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NUL', 'Northumberland', 'N54NOT');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NAJ', 'Northumberland 1', 'N54NUL');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NHL', 'Northumberland 2', 'N54NUL');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NNT', 'Non OM North Tyneside and Northumberland', 'N54NOT');
INSERT INTO team (code, name, ldu_code) VALUES ('N54A10', 'Awaiting allocation N Tyneside Northumberland', 'N54NNT');

INSERT INTO pdu (code, name, region_code) VALUES ('N54CLE', 'Redcar, Cleveland and Middlesbrough', 'N54');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N54ROM', 'Redcar Cleveland', 'N54CLE');
INSERT INTO team (code, name, ldu_code) VALUES ('N54RC1', 'Redcar 1', 'N54ROM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54RE2', 'Redcar 2', 'N54ROM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54ISC', 'Intensive Supervision Team Pilot', 'N54ROM');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54MOM', 'Middlesbrough', 'N54CLE');
INSERT INTO team (code, name, ldu_code) VALUES ('N54MI1', 'Middlesbrough 1', 'N54MOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54M02', 'Middlesbrough 2', 'N54MOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54MI3', 'Middlesbrough 3', 'N54MOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PQ5', 'Redcar, Cleveland and Middlesbrough PQIP team', 'N54MOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54IM1', 'Cleveland IOM', 'N54MOM');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NOC', 'Non OM Redcar, Cleveland and Middlesbrough', 'N54CLE');
INSERT INTO team (code, name, ldu_code) VALUES ('N54AA3', 'Awaiting Allocation Redcar Cleveland Middlesbrough', 'N54NOC');

INSERT INTO pdu (code, name, region_code) VALUES ('N54STHA', 'Stockton and Hartlepool', 'N54');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N54HOM', 'Hartlepool', 'N54STHA');
INSERT INTO team (code, name, ldu_code) VALUES ('N54HAR', 'Hartlepool 1', 'N54HOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DAH', 'Hartlepool 2', 'N54HOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PQ6', 'Stockton and Hartlepool PQIP Team', 'N54HOM');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54SOM', 'Stockton', 'N54STHA');
INSERT INTO team (code, name, ldu_code) VALUES ('N54DAP', 'Stockton 1', 'N54SOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54STO', 'Stockton 2', 'N54SOM');
INSERT INTO team (code, name, ldu_code) VALUES ('N54ST3', 'Stockton 3', 'N54SOM');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54STHT', 'Non OM Stockton and Hartlepool', 'N54STHA');
INSERT INTO team (code, name, ldu_code) VALUES ('N54A14', 'Awaiting Allocation Stockton and Hartlepool', 'N54STHT');

INSERT INTO pdu (code, name, region_code) VALUES ('N54SUND', 'Sunderland', 'N54');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N54SDL', 'Sunderland', 'N54SUND');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NSS', 'Sunderland 1', 'N54SDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NNS', 'Sunderland 2', 'N54SDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N54NAG', 'Sunderland 3', 'N54SDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N54PQ7', 'Sunderland PQIP Team', 'N54SDL');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N54NSL', 'Non OM Sunderland', 'N54SUND');
INSERT INTO team (code, name, ldu_code) VALUES ('N54A13', 'Awaiting Allocation Sunderland', 'N54NSL');
