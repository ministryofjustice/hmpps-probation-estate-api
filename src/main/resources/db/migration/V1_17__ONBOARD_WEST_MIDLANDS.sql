INSERT INTO region (code, name) VALUES('N52', 'West Midlands Region');
INSERT INTO pdu (code, name, region_code) VALUES ('N52BCCF', 'Birmingham Courts and Centralised Functions', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52BIRL', 'Birmingham', 'N52BCCF');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WSB', 'Womens Team South Birmingham', 'N52BIRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WCB', 'Womens Team Central Birmingham', 'N52BIRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52ICS', 'IOM Birmingham Central and South', 'N52BIRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52INE', 'IOM Birmingham North,East', 'N52BIRL');

INSERT INTO pdu (code, name, region_code) VALUES ('N52BIRM', 'Birmingham Central and South', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52BLDU', 'Birmingham Central and South', 'N52BIRM');
INSERT INTO team (code, name, ldu_code) VALUES ('N52TRF', 'Birmingham CTT', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CB4', 'Central Birmingham 1', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CB5', 'Central Birmingham 2', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CB6', 'Central Birmingham 3', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CB7', 'Central Birmingham 4', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CB8', 'Central Birmingham 5', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CPQ', 'Central Birmingham PQIP', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SB4', 'South Birmingham 1', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SB5', 'South Birmingham 2', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SB6', 'South Birmingham 3', 'N52BLDU');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SPQ', 'South Birmingham PQIP', 'N52BLDU');

INSERT INTO pdu (code, name, region_code) VALUES ('N52BNES', 'Birmingham North, East and Solihull', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52NOEA', 'Birmingham North and East', 'N52BNES');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52SOLL', 'Solihull', 'N52BNES');
INSERT INTO team (code, name, ldu_code) VALUES ('N52EST', 'Birmingham East Short Term Custody', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NST', 'Birmingham North Short Term Custody', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52EBP', 'East Birmingham & Solihull PQIP', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52EB1', 'East Birmingham  1', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52EB2', 'East Birmingham  2', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52EB3', 'East Birmingham  3', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NB4', 'North Birmingham 1', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NB5', 'North Birmingham 2', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NB6', 'North Birmingham 3', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NBP', 'North Birmingham PQIP', 'N52NOEA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SHA', 'Solihull A', 'N52SOLL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SHB', 'Solihull B', 'N52SOLL');

INSERT INTO pdu (code, name, region_code) VALUES ('N52CSW', 'Coventry', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52COVL', 'Coventry', 'N52CSW');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CPT', 'Coventry PQIP', 'N52COVL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52TM1', 'Coventry Team 1', 'N52COVL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CV2', 'Coventry Team 2', 'N52COVL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CT2', 'Coventry Team 3', 'N52COVL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CV4', 'Coventry Team 4', 'N52COVL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CT5', 'Coventry Team 5', 'N52COVL');

INSERT INTO pdu (code, name, region_code) VALUES ('N52DUSA', 'Dudley and Sandwell', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52DUDL', 'Dudley', 'N52DUSA');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52SANL', 'Sandwell', 'N52DUSA');
INSERT INTO team (code, name, ldu_code) VALUES ('N52DU1', 'Dudley Team 1', 'N52DUDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52DU2', 'Dudley Team 2', 'N52DUDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SBC', 'Dudley Team 3', 'N52DUDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52DPQ', 'Dudley Team 4 PQIP', 'N52DUDL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SA1', 'Sandwell Team 1', 'N52SANL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SA2', 'Sandwell Team 2', 'N52SANL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SA3', 'Sandwell Team 3', 'N52SANL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52S4P', 'Sandwell Team 4 PQIP', 'N52SANL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SBK', 'Sandwell Team 5', 'N52SANL');


INSERT INTO pdu (code, name, region_code) VALUES ('N52WEME', 'Herefordshire, Shropshire and Telford', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52HERL', 'Herefordshire', 'N52WEME');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52SHRL', 'Shropshire', 'N52WEME');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52TELL', 'Telford', 'N52WEME');
INSERT INTO team (code, name, ldu_code) VALUES ('N52HER', 'Hereford', 'N52HERL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52DPQ', 'Hereford PQIP', 'N52HERL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SHR', 'Shrewsbury', 'N52SHRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SPP', 'Shrewsbury PQIP', 'N52SHRL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52TEL', 'Telford', 'N52TELL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52TPQ', 'Telford PQIP', 'N52TELL');


INSERT INTO pdu (code, name, region_code) VALUES ('N52STST', 'Staffordshire and Stoke', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52STAL', 'Staffordshire', 'N52STST');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52STOL', 'Stoke', 'N52STST');
INSERT INTO team (code, name, ldu_code) VALUES ('N52BPO', 'Burton', 'N52STAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52CAN', 'Cannock', 'N52STAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52PST', 'PQIPs South Staffordshire', 'N52STAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52STA', 'Stafford', 'N52STAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52STC', 'Staffordshire Short Term Custody', 'N52STAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SAP', 'Tamworth', 'N52STAL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SAS', 'IOM Staffordshire', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52PSK', 'PQIPs North Staffordshire', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SCS', 'Staffordshire Community Hub', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52STS', 'Stoke Allocations', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52ST1', 'Stoke Team 1', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52ST2', 'Stoke Team 2', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52ST3', 'Stoke Team 3', 'N52STOL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SAT', 'Stoke Team 4', 'N52STOL');

INSERT INTO pdu (code, name, region_code) VALUES ('N52BLCO', 'Walsall and Wolverhampton', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52WALL', 'Walsall', 'N52BLCO');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52WOLL', 'Wolverhampton', 'N52BLCO');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WA1', 'Walsall Team 1', 'N52WALL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WA2', 'Walsall Team 2', 'N52WALL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SBV', 'Walsall Team 3', 'N52WALL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SAM', 'Walsall and Wolverhampton Womens Team', 'N52WOLL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SCU', 'Wolverhampton and Walsall  Team 5 PQuiP', 'N52WOLL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WO1', 'Wolverhampton Team 1', 'N52WOLL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WO2', 'Wolverhampton Team 2', 'N52WOLL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52SBW', 'Wolverhampton Team 3', 'N52WOLL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WT4', 'Wolverhampton Team 4', 'N52WOLL');

INSERT INTO pdu (code, name, region_code) VALUES ('N52WARW', 'Warwickshire', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52WARL', 'Warwickshire', 'N52WARW');
INSERT INTO team (code, name, ldu_code) VALUES ('N52LPQ', 'Leamington PQIP Team', 'N52WARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52LEA', 'Leamington Team 1 ', 'N52WARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WAT', 'Leamington Team 2', 'N52WARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NPQ', 'Nuneaton and Rugby PQIP Team', 'N52WARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NUR', 'Nuneaton and Rugby Team 1', 'N52WARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WAD', 'Nuneaton and Rugby Team 2', 'N52WARL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52NR3', 'Nuneaton and Rugby Team 3', 'N52WARL');

INSERT INTO pdu (code, name, region_code) VALUES ('N52WORC', 'Worcestershire', 'N52');
INSERT INTO ldu (code, name, pdu_code) VALUES ('N52WORL', 'Worcestershire', 'N52WORC');
INSERT INTO team (code, name, ldu_code) VALUES ('N52KID', 'Kidderminster', 'N52WORL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52KPQ', 'Kidderminster PQIPs', 'N52WORL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52RED', 'Redditch', 'N52WORL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52RPQ', 'Redditch PQIPs', 'N52WORL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WOR', 'Worcester', 'N52WORL');
INSERT INTO team (code, name, ldu_code) VALUES ('N52WPQ', 'Worcester PQIPs', 'N52WORL');
