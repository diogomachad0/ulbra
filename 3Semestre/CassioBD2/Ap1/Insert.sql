INSERT INTO clientes (id, nome, cpf) VALUES
( 50,'Scheila' , 12987536701),
(51, 'Diogo' ,92759146824),
( 52,'Rafael' , 82716345926),
(53, 'Pedro' , 3926573819),
( 54,'Lucas' , 09623789182),
(55, 'João', 075622347819)

INSERT INTO autores ( nome ) VALUES
(31, "Machado de Assis"),
(32, "William P. Young"),
(33, "Stephen King"),
(34, "paulo vieira"),
( 35, "Clarice Lispector")

INSERT INTO categorias (id, nome) VALUES
( 1, "Romance"),
( 2, "Terror"),
( 3, "Acao"),
( 4, "suspense"),
(5, "drama")

INSERT INTO livros (id, titulo, ano_publicacao, numPaginas, numDisponiveis, categorias_id ) VALUES
( 10,"A hora da estrela", 2010, 50, 5, 1),
( 11, "A coisa",2012, 90, 10, 2),
(12, "O poder da ação", 2002, 60, 5, 3),
(13, "A cabana ", 201, 59, 8, 4),
(14, "A arca",2007, 30, 8, 3 )
(15, "A travessia", 2003, 50, 7, 5 )
(16,"A estranha",2009, 60, 5, 2)

INSERT INTO livros_autores (autores_id, livros_id) VALUES
(32, 13),
(35, 10),
(33,11 ),
(34, 12),
(34, 14)
(31,15)
INSERT INTO emprestimos (id,data_emprestimo, data_devolucao, id_cliente) VALUES
(41, '2023-02-01','null', 50),
(42, '2023-01-09','2023-02-09',51),
(43, '2023-01-07', 'null', 52),
(44, '2023-03-01','2023-04-10', 53),
(45, '2023-01-02', 'null', 54),
(46, '2034-01-05', 'null', 55),
(47, '2023-03-04','2023-04-12', 51)

INSERT INTO emprestimos_livros(id_livros, id_emprestimos)
(10, 41),
(11, 42),
(12, 43),
(13, 44),
(14, 45),
(15,46),
(16, 47)




