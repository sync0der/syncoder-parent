create schema if not exists catalogue;

create table catalogue.t_products
(
    id      serial primary key,
    c_title varchar not null check (length(trim(c_title)) >= 3),
    c_details varchar (1000)
);