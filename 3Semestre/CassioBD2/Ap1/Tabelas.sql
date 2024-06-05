CREATE TABLE categoria(
  id int auto_increment primary key,
  nome varchar(50) not null
)

CREATE TABLE livros(
    id int auto_increment primary key,
    titulo vatchar(50) not null,
    ano_publicacao int,
    num_paginas int,
    num_disponiveis int,
    id_categoria int,
    CONSTRAINT livros_fk_categoria
    FOREIGN KEY(id_categoria) REFERENCES categoria(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)

CREATE TABLE autores(
     id int auto_increment primary key,
     nome varchar(50) not null
)

CREATE TABLE autores_livros(
    id_livros int, 
    CONSTRAINT autores_livros_fk_livros
    FOREIGN KEY(id_livros) REFERENCES livros(id)
    id autores int,
    CONSTRAINT autores_livros_fk_autores
    FOREIGN KEY(id_autores) REFERENCES autores(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
)

CREATE TABLE emprestimos(
 id int auto_increment primary key,
 data_emprestimo date not null,
 data_devolucao date not null
)

CREATE TABLE emprestimos_livros(
    id emprestimos int,
    CONSTRAINT emprestimos_livros_fk_emprestimos
    FOREIGN KEY(id_emprestimos) REFERENCES emprestimos(id)
    id_livros int,
    CONSTRAINT emprestimos_livros_fk_livros
    FOREIGN KEY(id_livros) REFERENCES livros(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT

)

CREATE TABLE clientes(
    id int auto_increment primary key,
    nome varchar(50) not null
    cpf char(11) not null
)

