--2 new pdus for Staffordshire and Stoke
INSERT INTO pdu (code, name, region_code) VALUES ('N52STF', 'Staffordshire North', 'N52');
INSERT INTO pdu (code, name, region_code) VALUES ('N52STFS', 'Staffordshire South', 'N52');

--2 new ldus for Staffordshire and Stoke

INSERT INTO ldu (code, name, pdu_code) VALUES ('N52STO', 'Stoke', 'N52STF');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52STAF', 'Staffordshire', 'N52STFS');

--stoke allocations
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52STS';
--stoke team 1
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52ST1';
--stoke team 2
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52ST2';
--stoke team 3
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52ST3';
--stoke team 4
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52SAT';
--OMIC stoke  -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52OSA', 'OMIC Stoke Allocations', 'N52STO');
--OMIC IOM NORTH -- doesn't exist
INSERT INTO team (code, name, ldu_code) values('N52LRH', 'OMIC IOM North (Longton)', 'N52STO');
--pqips north staffs
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52PSK';
--IOM Staff north
UPDATE team set name = 'IOM Staffordshire North', ldu_code = 'N52STO' where code = 'N52SAS';
--the two following teams may need removing at a later date
--Staffordshire Community Hub
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52SCS';
--Staffordshire short term custody
UPDATE team SET ldu_code = 'N52STO' WHERE code = 'N52STC';
--IOM STAFFORDSHIRE
DELETE FROM team WHERE code = 'N52SAS';


--burton
UPDATE team SET ldu_code = 'N52STAF' WHERE code = 'N52BPO';
--cannock
UPDATE team SET ldu_code = 'N52STAF' WHERE code = 'N52CAN';
--OMIC burton -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52OBU', 'OMIC Burton', 'N52STAF');
--OMIC cannock -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52OCA', 'OMIC Cannock', 'N52STAF');
--OMIC IOM SOUTH -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52OIS', 'OMIC IOM South (Stafford)', 'N52STAF');
--OMIC Stafford -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52OST', 'OMIC Stafford', 'N52STAF');
--OMIC Tamworth -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52OTA', 'OMIC Tamworth', 'N52STAF');
--IOM STAFFORDSHIRE South -- doesnt exist
INSERT INTO team (code, name, ldu_code) values('N52ISS', 'IOM Staffordshire South', 'N52STAF');
--stafford
UPDATE team SET ldu_code = 'N52STAF' WHERE code = 'N52STA';
--tamworth
UPDATE team SET ldu_code = 'N52STAF' WHERE code = 'N52SAP';
--pqips south staffs
UPDATE team SET ldu_code = 'N52STAF' WHERE code = 'N52PST';
--staffordshire short term custody
DELETE from team where code = 'N52STC';

--remove old ldus
DELETE from ldu where code = 'N52STAL';
DELETE from ldu where code = 'N52STOL';

--remove the old staffordshire and stoke pdus
DELETE from pdu where code = 'N52STST';
