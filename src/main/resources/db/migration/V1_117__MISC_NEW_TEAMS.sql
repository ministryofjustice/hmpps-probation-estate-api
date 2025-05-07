--wfp-3101
INSERT INTO team (code, name, ldu_code) VALUES('N56RPD', 'BDS-Resettlement POD', 'N56BEDL');
INSERT INTO team (code, name, ldu_code) VALUES('N03GWT', 'Final Third Team – GWT', 'WPTGWT');
INSERT INTO team (code, name, ldu_code) VALUES('N52RHB', 'BCF Reset Hub', 'N52BIRL');
INSERT INTO team (code, name, ldu_code) VALUES('N52WRH', 'Worcestershire Reactive Hub', 'N52WORL');
--wfp-3102
INSERT INTO ldu (code, name, pdu_code) VALUES('N59ACT', 'Unpaid Work', 'N59UPAC');
UPDATE team set name = 'UPW SC - Bucks',ldu_code = 'N59ACT' where code = 'N59TAY';
INSERT INTO team (code, name, ldu_code) VALUES('N59TOX', 'UPW SC - Oxon', 'N59ACT');
INSERT INTO team (code, name, ldu_code) VALUES('N59WBI', 'West Berkshire Impact', 'N59WESB');

