drop table if exists region;

CREATE TABLE region(
    code VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL,
    created_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT timezone('utc', now())
);

drop table if exists pdu;

CREATE TABLE pdu(
    code VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL,
    created_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT timezone('utc', now()),
    region_code VARCHAR NOT NULL references region(code)
);

drop table if exists team;

CREATE TABLE team(
    code VARCHAR PRIMARY KEY,
    name VARCHAR NOT NULL,
    created_date TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT timezone('utc', now()),
    pdu_code VARCHAR NOT NULL references pdu(code)
);