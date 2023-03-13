alter table region add column soft_deleted boolean default false;
alter table pdu add column soft_deleted boolean default false;
alter table ldu add column soft_deleted boolean default false;
alter table team add column soft_deleted boolean default false;