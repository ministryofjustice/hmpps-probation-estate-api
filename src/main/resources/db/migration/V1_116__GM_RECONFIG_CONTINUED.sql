--wfp-3079 reconfig greater manchester pdu's

UPDATE team SET name = 'GM Stockport 1' where code = 'N50CAK';
UPDATE team SET name = 'GM Stockport 2' where code = 'N50ST3';
UPDATE team SET name = 'GM Stockport 3' where code = 'N50ST4';
UPDATE team SET name = 'GM Stockport 4' where code = 'N50ST5';

UPDATE team SET name = 'GM Trafford 1' where code = 'N50TRA';
UPDATE team SET name = 'GM Trafford 2' where code = 'N50CAF';

DELETE FROM team where code = 'N50842';
