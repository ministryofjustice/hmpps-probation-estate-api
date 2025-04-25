--wfp-3079 reconfig greater manchester pdu's

INSERT INTO pdu (code, name, region_code) VALUES ('N50SFTR', 'Salford and Trafford', 'N50');
INSERT INTO pdu (code, name, region_code) VALUES ('N50STTA', 'Stockport and Tameside', 'N50');

-- lau Salford & Trafford  N50SAL, N50TRA
UPDATE ldu SET pdu_code = 'N50SFTR' WHERE code IN ('N50SAL', 'N50TRA');
UPDATE team SET ldu_code = 'N50SAL' WHERE code IN ('N50SA2', 'N50CAE', 'N50SAD');
UPDATE team SET ldu_code = 'N50TRA' WHERE code = 'N50CAF';

--lau Stockport & Tameside N50STO, N50TAM
UPDATE ldu SET pdu_code = 'N50STTA' WHERE code IN ('N50STO', 'N50TAM');
UPDATE team SET ldu_code = 'N50STO' WHERE code IN ('N50CAK', 'N50ST3', 'N50ST4', 'N50ST5');
UPDATE team SET ldu_code = 'N50TAM' WHERE code IN ('N50TA2', 'N50TA1', 'N50CAL', 'N50TS4');

--clean up pdu's
DELETE FROM pdu WHERE code IN ('N50STTR', 'N50TAST');
