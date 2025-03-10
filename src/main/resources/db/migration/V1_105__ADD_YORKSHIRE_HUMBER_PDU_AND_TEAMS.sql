INSERT INTO pdu (code, name, region_code) VALUES('N55UPAC', 'Unpaid Work and Attendance Centres', 'N55');

INSERT INTO ldu (code, name, pdu_code) VALUES ('N55CPS', 'CP Sentence Management', 'N55UPAC');


INSERT INTO team (code, name, ldu_code) VALUES('N55CP1', 'CP Barnsley and Rotherham SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP2', 'CP Bradford and Calderdale SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP3', 'CP Doncaster SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP4', 'CP Hull and East Riding SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP5', 'CP Kirklees SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP6', 'CP Leeds SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP7', 'CP North and North East Lincs SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP8', 'CP North Yorkshire SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CP9', 'CP Sheffield SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CPA', 'CP Wakefield SM Team', 'N55CPS');
INSERT INTO team (code, name, ldu_code) VALUES('N55CPB', 'CP York SM Team', 'N55CPS');