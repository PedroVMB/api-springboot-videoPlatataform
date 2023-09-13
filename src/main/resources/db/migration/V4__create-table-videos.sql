create table videos (
    id bigint not null AUTO_INCREMENT,
    titulo varchar(150) not null,
    url varchar(1000) not null,
    ativo tinyint not null,

    primary key(id)
)