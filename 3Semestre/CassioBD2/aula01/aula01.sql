--1
create table cidade(
    id_cidade int auto_increment primary key,
    nome varchar(50) not null,
    uf char(2) not null
);

create table filial(
    id_filial int auto_increment primary key,
    nome varchar(50) not null,
    endereco varchar(50),
    id_cidade int
    constraint filial_fk_cidade
    foreign key (id_cidade) references cidade(id)
);

create table empregado(
    id_empregado int auto_increment primary key,
    nome varchar(100) not null,
    endereco varchar(50),
    contato char(13) not null,
    rg char(7) not null,
    cpf char(14) not null,
    salario decimal (10,2)
    id_cidade int
    constraint empregado_fk_cidade
    foreign key (id_cidade) references cidade(id)
    id_filial int
    constraint empregado_fk_filial
    foreign key (id_filial) references filial(id)
);

create table produto(
    id_produto int auto_increment primary key,
    descricao varchar(100) not null,
    preco decimal (10,2) not null,
    nome_categoria varchar(100),
    descricao_categoria varchar(100)
);


create table vende(
    id_vende int auto_increment primary key,
    id_produto int
    constraint vende_fk_produto
    foreign key(id_produto) references produto(id)
    id_filial int
    constraint vende_fk_filial
    foreign key(id_filial) references filial(id)
);

--2

--3
--a
create table filial(
    id_filial int auto_increment primary key,
    nome varchar(50) not null,
    endereco varchar(50),
    id_cidade int
    constraint filial_fk_cidade
    foreign key (id_cidade) references cidade(id)
);

create table vende(
    id_vende int auto_increment primary key,
    id_produto int
    constraint vende_fk_produto
    foreign key(id_produto) references produto(id)
    id_filial int
    constraint vende_fk_filial
    foreign key(id_filial) references filial(id)
);

--b
select max(valor) maior valor
from produto

--c
select avg(valor) media dos valores
from produto

--d 
select produto.descricao
from produtos p join vende on p.id_produto = vende.id_produto
join filial f on f.id_filial = f.id_filial
where filial.nome = 'f3'

--e 
select funcionario.nome funcionario.rg
from funcionario join cidade on funcionario.id_funcionario = cidade.id_funcionario
where cidade = 'rs' and funcionario.salario>500

--4
create table categoria(
    id_cat int auto_increment primary key,
    nome varchar(50) not null,
    descricao varchar(100)
);

create table livro(
    id_livro int auto_increment primary key,
    titulo varchar(100) not null,
    num_folha int,
    editora varchar(100) not null,
    valor decimal(10,2),
    id autor int
    constraint livro_fk_autor
    foreign key (id_autor) references autor(id),
    on update restrict
    on delete cascade
);

--5
--a
select count (total) total_de_vendas
from venda 

--b
select livro.titulo, livro.valor, categoria.nome
from livro join categoria on livro.id_cat = cat.id
where categoria.nome = 'banco de dados'

--c
select titulo.livro, nome.autor, 
from livro join autor on  livro.id_autor = autor.id
where livro.valor > 300

--d

--e

--f

--g

select nome.cliente
from venda join cliente on cliente.id_cliente = venda.id_cliente 
join livro on livro.id_livro = venda.id_livro
where titulo.livro = 'banco de dados powerful'


