INSERT INTO region (code, name) VALUES('N07', 'London');
INSERT INTO pdu (code, name, region_code) VALUES ('LDNNHAK', 'Hammersmith, Fulham, Kensington, Chelsea and Westminster', 'N07');
INSERT INTO ldu (code, name, pdu_code) VALUES ('LDNNHAF', 'Buckinghamshire and M Keynes', 'LDNNHAK');
INSERT INTO team (code, name, ldu_code) VALUES ('N07557', 'HFCKW1', 'LDNNHAF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07556', 'HFCKW2', 'LDNNHAF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07V10', 'HFCKW PQiP', 'LDNNHAF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07KEN', 'Awaiting Allocation HFKCW', 'LDNNHAF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07562', 'HFCKW 3', 'LDNNHAF');
INSERT INTO team (code, name, ldu_code) VALUES ('N07001', 'HFCKW 4', 'LDNNHAF');
