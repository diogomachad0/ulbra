--View que lista os clientes que possuem algum empréstimo em atraso
 CREATE VIEW clientes_em_atraso as
    select clientes.nome as nome_cliente
    emprestimo.data_devolucao as data_devolucao_emprestimo
    emprestimo.data_emprestimo as data_emprestimo_emprestimo
    from clientes 
    inner join emprestimos on clientes.id = emprestimo.cliente_id
    where data_devolucao_emprestimo is null
-----------------------------------------------------------------------------------------------------

--View de categorias e quantidade de livros em cada uma
  CREATE VIEW categorias_livros AS 
  categoria.nome as nome_categoria,
  count(livro.id) as quantidade_livros
  from categorias 
  left join livros on livros.categorias_id = categorias.id
  group by categoria.id

--left join pois é possível que uma categoria ainda não tenha nenhum livro cadastrado
--goup by na coluna id para que a contagem de livros seja feita de forma agregada para cada categoria

-------------------------------------------------------------------------------------------------------

--view para mostrar o total de emprestimos feitos por cada cliente

CREATE VIEW total_emprestimos_clientes AS
  cliente.nome as nome_cliente,
  count(emprestimos.id) as total_emprestimos
  from clientes
  inner join emprestimos on clientes.is = emprestimos.cliente_id
  group by cliente.id


--agrupar as informações por cliente, de forma que fosse possível mostrar o total de empréstimos feitos por cada um