--procedure para cadastrar um novo livro

CREATE PROCEDURE cadastrar_livro(
    @titulo varchar(100),
    @ano_publicacao int,
    @num_disponiveis int,
    @num_paginas int,
    @id_categoria int

    BEGIN
    INSERT INTO livro(titulo, ano_publicaca, num_disponiveis, num_paginas, id_categoria )
    VALUES(@titulo, @ano_publicaca, @num_disponiveis, @num_paginas, @id_categoria);
END;
)

call cadastrar_livro('The Shack', 2000, 5, 40, 4);

------------------------------------------------------------------------------------------------
--Procedure para  registrar um novo emprestimo

CREATE PROCEDURE registrar_emprestimo
    @id_cliente INT,
    @id_livro INT,
    @data_emprestimo DATE,
    @data_devolucao DATE
AS
BEGIN
    INSERT INTO Emprestimos (id_cliente, id_livro, data_emprestimo, data_devolucao)
    VALUES (@id_cliente, @id_livro, @data_emprestimo, @data_devolucao)
END

call registrar_emprestimo (1,11, '2023-04-19', '2023-05-10')

---------------------------------------------------------------------------------------------------
--procedure para deletar um livro

CREATE PROCEDURE deletar_livro
    @id_livro INT
AS
BEGIN
    DELETE FROM Livros WHERE id_livro = @id_livro
END


call deletar_livro (11);

-------------------------------------------------------------------------------------------------------
--Procedure para buscar um livro pelo autor

CREATE PROCEDURE buscar_livro_por_autor
    @autor VARCHAR(50)
AS
BEGIN
    SELECT * FROM Livros WHERE autor = @autor
END


call buscar_livro_por_autor ('Machado de Assis');









