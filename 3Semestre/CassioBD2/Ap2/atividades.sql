--3. Alterar a tabela de Produtos e incluir o tempo de validade.

ALTER TABLE Produtos
ADD COLUMN tempoValidade INT;

--4. Gerar os scripts de inserção para os registros. 

INSERT INTO categoria (id auto_increment, nome) VALUES
  ('Bolos'),
  ('Pães'),
  ('Doces'),
  ('Salgados');

INSERT INTO producoes (id auto_increment, dataProducao, qtdProduzida)
  ('10/05/2023', 9),
  ('09/05/2023', 100),
  ('08/05/2023', 12),
  ('07/05/2023', 22);

INSERT INTO produtos (id auto_increment, nome, id_categoria, id_producoes) VALUES 
  ('Bolo de Chocolate', 1, 1),
  ('Pão Francês', 2, 2),
  ('Cookies', 3, 3),
  ('Pastel', 4, 4);

INSERT INTO ingrediente (id auto_increment, nome, qtdEstoque) VALUES  
  ('Ovo', 300),
  ('Chocolate em pó', 90),
  ('Manteiga', 50),
  ('Farinha de Trigo', 300),
  ('Açucar', 250),
  ('Sal', 220),
  ('Fermento', 120),
  ('Chocolate', 200),
  ('Azeite', 100),
  ('Carne', 1000),
  ('Pastelina', 500);

INSERT INTO receita (id auto_increment, qtdUtilizada, id_ingrediente) VALUES --Bolo de chcolate
  (3, 1),
  (1, 2),
  (1, 3),
  (2, 4),
  (1, 5),
  (1, 6),
  (1, 7),
  (3, 8),
  (2, 9);

INSERT INTO receita (id auto_increment, qtdUtilizada, id_ingrediente) VALUES --Pães
  (1, 3),
  (2, 6),
  (3, 7),
  (2, 9);

INSERT INTO receita (id auto_increment, qtdUtilizada, id_ingrediente) VALUES --Cookies
  (2, 1),
  (1, 2),
  (2, 5),
  (1, 8);

INSERT INTO receita (id auto_increment, qtdUtilizada, id_ingrediente) VALUES --Pastel
  (1, 9),
  (15, 10),
  (1, 15);

--5. Gerar os scripts de consulta que respondam às seguintes questões: 
--Exibir quantos produtos há para cada categoria; 

SELECT categoria.nome AS nome_categoria 
count(produto.id) AS quantidades_produtos
FROM categoria 
INNER JOIN produto ON categoria.id = produto.id_categora
GROUP BY categoria.nome

--Exibir todos os produtos, quais ingredientes e em que quantidade são  utilizados para produzi-lo; 

SELECT produto.nome AS nome_produto,
ingrediente.nome AS nome_ingrediente
receita.qtdUtilizada AS qtdUtilizada_receita
from produtos 
INNER JOIN receitas ON produto.id = receitas.id_produto
INNER JOIN receitaIngrediente ON receita.id  = receitaIngrediente.id_receita
INNER JOIN ingrediente ON receitaIngrediente.id_ingrediente = ingrediente.id

--Exibir qual a quantidade produzida de cada produto dos últimos 30 dias; 

SELECT sum(producoes.qtdProduzida) AS quantidade_produzida
from produto 
INNER JOIN producoes ON produto.id = producoes.id_produto
WHERE producoes.dataProducao>= curdate() - interval 30 DAY;

--Se for dobrada a produção para o próximo mês, quanto de ingrediente será  necessário. 

SELECT ingrediente.nome AS nome_ingrediente
SUM(receita.qtdUtilizada)*2 AS quantidade_dobrada
from receita 
INNER JOIN ingrediente ON receita.id_ingrediente = ingrediente.id
GROUP BY ingrediente.nome 


--Mostrar os ingredientes que nunca foram utilizados; 
SELECT nome
FROM ingredientes
WHERE id NOT IN(
    SELECT * FROM receitaIngrediente
    WHERE receitaIngrediente.id_ingrediente = ingrediente.id
);



--Crie uma trigger para garantir o controle de estoque dos produtos fabricados.
-- Quanto um produto for fabricado deve dar saída dos estoque dos 
---ingredientes utilizados. Caso ocorra o estorno da fabricação, manter o estoque dos ingredientes atualizado também;

DELIMITER$$

CREATE TRIGGER controle_estoque_produto_fabricado AFTER INSERT ON producoes
FOR EACH ROW
BEGIN
    IF NEW.qtdProduzida > 0 THEN
        UPDATE ingrediente 
        JOIN receitaIngrediente ON receitaIngrediente.id_ingrediente = ingrediente.id
        SET ingrediente.qtdEstoque = ingrediente.qtdEstoque - (receitaIngrediente.qtdUtilizada * NEW.qtdProduzida)
        WHERE receitaIngrediente.id_receita = (
            SELECT id_produtos
            FROM produtos
            WHERE id = NEW.id_producoes
        );
    END IF;
END

DELIMITER ;

--Utilizando controle de transações, atualize as receitas para reduzir em 10% a  quantidade de fermento utilizada; 
START TRANSACTION;

 UPDATE receitaIngrediente SET qtdUtilizada = (qtdUtilizada*0.9)
 WHERE id_ingrediente = 2; --2 é o id do fermento

COMMIT

--Confirme a transação do exercício anterior; 
COMMIT 

--Utilizando controle de transações, exclua todos os registros de produção do  último mês; 
START TRANSACTION;

  DELETE FROM Producoes
  WHERE dataProducao >= CURDATE() - INTERVAL 1 MONTH;

COMMIT;

--Desfaça a transação realizada no exercício anterior;
ROLLBACK


/*
Esse acionamento atualiza diretamente a quantidade em estoque de cada ingrediente utilizado na fabricação do produto. 
Ela é acionada após cada inserção na tabela producoes, verificando se a quantidade produzida é maior que zero. Em seguida, 
ela faz um join com a tabela receitaIngredientepara deduzir a quantidade utilizada de cada ingrediente do caldo, 
multiplicando pela quantidade produzida.
*/