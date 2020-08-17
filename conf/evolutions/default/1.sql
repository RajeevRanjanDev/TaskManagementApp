# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                            serial not null,
  title                         varchar(255),
  price                         integer,
  author                        varchar(255),
  constraint pk_book primary key (id)
);

create table task (
  id                            serial not null,
  name                          varchar(255),
  description                   varchar(255),
  tags                          varchar(255),
  status                        varchar(255),
  created_at                    timestamp,
  constraint pk_task primary key (id)
);


# --- !Downs

drop table if exists book cascade;

drop table if exists task cascade;

