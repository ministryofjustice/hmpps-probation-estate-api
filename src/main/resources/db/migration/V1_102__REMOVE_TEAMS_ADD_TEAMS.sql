--wfp-2955 remove pdu, lau and team from KSS
DELETE FROM team WHERE code = 'N57UAT';
DELETE FROM ldu WHERE code = 'N57UAT';
DELETE FROM pdu WHERE code = 'N57UAT';

--wfp-2953 add new teams to North East region

INSERT INTO team (code, name, ldu_code) VALUES('N54NTR', 'NNT Resolution Team', 'N54NTS');
INSERT INTO team (code, name, ldu_code) VALUES('N54NLR', 'NCL Resolution Team', 'N54NEW');