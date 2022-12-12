drop table if exists ldu;

CREATE TABLE ldu(
    code VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL,
    created_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT timezone('utc', now()),
    pdu_code VARCHAR NOT NULL references pdu(code)
);

INSERT INTO ldu (code, name, pdu_code) VALUES('WPTNWS', 'North Wales', 'WPTNWS');

INSERT INTO ldu (code, name, pdu_code) VALUES('N54STS', 'South Tyneside', 'N54SOT');
INSERT INTO ldu (code, name, pdu_code) VALUES('N54NST', 'Non OM Gateshead and South Tyneside', 'N54SOT');
INSERT INTO ldu (code, name, pdu_code) VALUES('N54GHD', 'Gateshead', 'N54SOT');

alter table team add column ldu_code varchar;

update team set ldu_code = 'WPTNWS' where code in ('N03C01', 'N03D01', 'N03E01', 'N03B01', 'N03F01', 'N03A01', 'N03CDD');

update team set ldu_code = 'N54STS' where code in ('N54NST', 'N54NAT');

update team set ldu_code = 'N54GHD' where code in ('N54NGH', 'N54NG2', 'N54NAF', 'N54PQ2');

ALTER TABLE team ADD CONSTRAINT team_ldu_code_fkey FOREIGN KEY (ldu_code) REFERENCES ldu (code);

alter table team alter column ldu_code SET NOT NULL;