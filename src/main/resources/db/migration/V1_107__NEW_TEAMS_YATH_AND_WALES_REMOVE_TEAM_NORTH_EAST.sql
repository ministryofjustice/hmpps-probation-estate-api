--wfp-2986
INSERT INTO ldu (code, name, pdu_code) VALUES ('N55NOUP', 'Non OM UPW', 'N55UPAC');

INSERT INTO team (code, name, ldu_code) VALUES('N55UA1', 'CP Awaiting Allocation Bradford & Calderdale', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA2', 'CP Awaiting Allocation Barnsley & Rotherham', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA3', 'CP Awaiting Allocation Doncaster', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA4', 'CP Awaiting Allocation Hull & East Riding', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA5', 'CP Awaiting Allocation Kirklees', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA6', 'CP Awaiting Allocation Leeds', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA7', 'CP Awaiting Allocation North & North East Lincs', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA8', 'CP Awaiting Allocation North Yorkshire', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UA9', 'CP Awaiting Allocation Sheffield', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UAA', 'CP Awaiting Allocation Wakefield', 'N55NOUP');
INSERT INTO team (code, name, ldu_code) VALUES('N55UAB', 'CP Awaiting Allocation York', 'N55NOUP');

--wfp-2987
DELETE FROM team WHERE code = 'N54PQ7';

--wfp-2988
INSERT INTO team (code, name, ldu_code) VALUES('N03P07', 'Swansea – Team 7', 'N03SNT');
