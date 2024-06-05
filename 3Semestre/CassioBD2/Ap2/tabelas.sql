CREATE TABLE categoria(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
)

CREATE TABLE producoes(
    id INT auto_increment PRIMARY KEY,
    dataProducao DATE,
    qtdProduzida INT
)

CREATE TABLE produtos(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id)
    id_producoes
    FOREIGN KEY (id_producoes) REFERENCES producoes(id)

)

CREATE TABLE ingrediente(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    qtdEstoque INT
)

CREATE TABLE receita(
    id INT auto_increment PRIMARY KEY,
    qtdUtilizada INT,
    id_ingrediente INT,
    FOREIGN KEY (id_ingrediente) REFERENCES ingrediente(id)
)

CREATE TABLE receitaIngrediente(
    id_receita INT,
    id_ingrediente INT,
    FOREIGN KEY (id_receita) REFERENCES Receita(id),
    FOREIGN KEY (id_ingrediente) REFERENCES Ingrediente(id)
)

