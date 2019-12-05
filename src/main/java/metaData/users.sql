create table users
(
    id serial not null
        constraint users_pk
            primary key,
    email text,
    password text
);

alter table users owner to postgres;

