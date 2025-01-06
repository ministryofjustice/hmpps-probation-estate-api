--WFP-2905 remove omic teams

DELETE FROM team WHERE code = 'N52OSA';
DELETE FROM team WHERE code = 'N52LRH';
DELETE FROM team WHERE code = 'N52OBU';
DELETE FROM team WHERE code = 'N52OCA';
DELETE FROM team WHERE code = 'N52OIS';

--WFP-2904 add womens team for east birmingham
INSERT INTO team (code, name, ldu_code) VALUES('N52WEB', 'Women''s Team East Birmingham', 'N52BIRL');