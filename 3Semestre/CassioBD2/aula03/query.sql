/*1 Escreva uma consulta que retorne o nome do cliente, a soma do valor total das compras e o número total de pedidos feitos por cada cliente,
apenas para aqueles que fizeram pelo menos três pedidos. Use um inner join entre as tabelas "clientes" e "pedidos" e
agrupe os resultados pelo nome do cliente.
*/
SELECT cliente.nome AS nome_cliente, SUM(pedidos.valor_total) AS valor_total_compras,
COUNT(pedidos.id) AS total_pedidos
FROM clientes
INNER JOIN pedidos ON clientes.id = pedidos.id_cliente
GROUP BY clientes.nome
HAVING COUNT(pedidos.id) >=3;

/*2 Escreva uma consulta que retorne o nome do produto, a média do preço de venda e a soma total de unidades vendidas por categoria de produto.
Use um left join entre as tabelas "produtos" e "vendas" e agrupe os resultados pela categoria do produto.
*/
SELECT produto.nome AS nome_produto, produto.categoria AS AVG(venda.preco_venda) AS preco_venda SUM(vendas.valor_total_un) AS valor_total_vendidas
FROM produtos
LEFT JOIN vendas
ON produto.id = vendas.id_produto
GROUP BY produto.nome, produto.categoria

/*3 Escreva uma consulta que retorne o nome do fornecedor, o nome do produto e o número total de unidades compradas por fornecedor e por produto,
apenas para aqueles com mais de 100 unidades compradas. Use um inner join entre as tabelas "fornecedores", "produtos" e "compras" e
agrupe os resultados pelo nome do fornecedor e pelo nome do produto.
*/
SELECT fornecedor.nome AS nome_fornecedor, produto.nome AS nome_produto, SUM(compras.valor_total_un) AS valor_total_un,
FROM fornecedor
INNER JOIN compras
ON fornecedor.id = compras.id_fornecedor
INNER JOIN produto
ON compras.id_produto = produto.id
GROUP BY fornecedor.nome, produto.nome
HAVING compras.valor_total_un > 100

/*4 Escreva uma consulta que retorne o nome do departamento, o nome do funcionário e a média do salário dos funcionários em cada departamento,
apenas para aqueles com uma média de salário superior a R$ 5000. Use um left join entre as tabelas "funcionarios" e "departamentos" e
agrupe os resultados pelo nome do departamento e pelo nome do funcionário.
*/
SELECT departamento.nome AS nome_departamento, funcionario.nome AS nome_funcionario AVG(funcionario.media_salario) AS media_salario
FROM departamento
LEFT JOIN funcionario
ON departamento.id = funcionario.id_departamento
GROUP BY departamento.nome, funcionario.nome
HAVING funcionario.media_salario > 5000

/*5 Escreva uma consulta que retorne o nome do cliente, o nome do produto e a soma do valor total das compras feitas por cada cliente para
cada produto. Use um right join entre as tabelas "clientes" e "compras" e um inner join entre as tabelas "produtos" e "compras" e
agrupe os resultados pelo nome do cliente e pelo nome do produto.
duvida!!*/
SELECT cliente.nome AS nome_cliente, produto.nome AS nome_produto SUM(compras.valor_total) AS valor_total
FROM cliente
RIGHT JOIN compras
ON cliente.id = compras.id_cliente
GROUP BY cliente.nome, produto.nome_funcionario
