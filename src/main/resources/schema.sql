--DROP TABLE IF EXISTS item_catalog;  
create table item_catalog (item_name varchar(20) primary key, item_price number(8) not null, item_discount number(8,2));