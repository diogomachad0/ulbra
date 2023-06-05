--1)
CREATE PROCEDURE quantidade_livros_escritos (IN cpf_autor VARCHAR(14), OUT quantidade INT)
BEGIN
    SELECT COUNT(*) INTO quantidade
    FROM livros
    WHERE cpf_autor = cpf_autor;
END

--2)
CREATE PROCEDURE atualizar_data_lancamento (IN id_livro INT, IN atualizar_data_lancamento DATE)
BEGIN
    UPDATE livros
    SET data_lancamento = data_lancamento
    WHERE id = id_livro;
END

--3)
--a
CREATE PROCEDURE inserirLivro
    @titulo VARCHAR(30),
    @autor VARCHAR(50),
    @anoPublicacao INT,
    preco DECIMAL(8,2)
AS
BEGIN
    INSERT INT livros(titulo, autor, anoPublicacao, preco)
    VALUES (@titulo, @autor, @anoPublicacao, @preco)
END 


--b

CREATE PROCEDURE excluirLivro
   @Livro INT
AS
BEGIN
    DELETE FROM livros WHERE livroId = @livroId
END

--c
CREATE PROCEDURE atualizarLivro
    @LivroId INT,
    @titulo VARCHAR(30)= NULL,
    autor VARCHAR(50) = NULL,
    @anoPublicao INT = NULL,
    preco DECIMAL (8,2) = NULL
AS
BEGIN
    UPDATE livros seguintes
        titulo = isnull(@titulo, titulo),
        autor = isnull(@autor, autor),
        anoPublicacao = isnull(@anoPublicacao, anoPublicacao),
        preco = isnull(@preco, preco)
    WHERE livroId = @LivroId
END

--4)
CREATE PROCEDURE alteracao_preco_editora (IN editora VARCHAR(100), IN valor FLOAT, IN percentual BOOLEAN)
BEGIN
    IF percentual = TRUE THEN
        UPDATE livros
        SET preco = preco *(1 + (valor/100))
        WHERE editora = editora;
    ELSE
        UPDATE livros
   +69     SET preco = preco + valor
        WHERE editora = editora;
    END IF;
END

