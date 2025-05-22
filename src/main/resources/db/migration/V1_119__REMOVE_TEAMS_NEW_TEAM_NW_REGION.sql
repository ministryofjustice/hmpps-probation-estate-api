--wfp-3134
DELETE FROM team where code = 'N51KN1';
DELETE FROM team where code = 'N51KN2';
DELETE FROM team where code = 'N51KN3';
DELETE FROM team where code = 'N51KN4';
DELETE FROM team where code = 'N51SH1';
DELETE FROM team where code = 'N51SH2';

--wfp-3137
INSERT INTO team (code, name, ldu_code) values('N51REH', 'Carlisle 2', 'N51CARL');