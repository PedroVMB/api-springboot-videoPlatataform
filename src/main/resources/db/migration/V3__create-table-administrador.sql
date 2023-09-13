create table administradores (
    id bigint not null AUTO_INCREMENT,
    nome varchar(100) not null,
    email varchar(100) not null,
    senha varchar(255) not null,
    ativo tinyint not null,

    primary key(id)
)
