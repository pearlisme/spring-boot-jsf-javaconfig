/*
create table product (
  id INTEGER NOT NULL AUTO_INCREMENT,
--   id identity not null,
  name varchar (255) not null,
  price double not null
);*/
drop table IF EXISTS country;
drop table IF EXISTS product;


CREATE TABLE country (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE product (
--     id INTEGER NOT NULL AUTO_INCREMENT,
    id identity NOT NULL,
    name VARCHAR(128) NOT NULL,
    price double not null
--     ,    PRIMARY KEY (id)
);