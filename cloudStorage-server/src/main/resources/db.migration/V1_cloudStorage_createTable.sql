create schema cloud;
create table cloud.users
(
    title     varchar not null,
    login    varchar not null,
    password varchar not null
        constraint user_pk
        primary key
);

-- alter table cloud_storage."user"
--     owner to postgres;

