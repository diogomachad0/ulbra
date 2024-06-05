--inner join
select c.nome, count(p.id) as numero_pedidos, sum(ip.quantidade) as total_gasto
from clientes c
inner join pedidos p on c.id = p.cliente_id
inner join itens_pedidos ip  on p.id = ip.pedido_id
where p.data_pedido >= dateadd(day, -30, getdate())
group by c.nome
having count(p.id) > 0

--left join

-- eu tenho uma modelagem assim:

um cliente tem muitas vendas 
uma venda tem muitos produtos
um produto pode esyar em mujitas vendas

vendas pode ter muitas formas de pagamento
forma de pagamento pode estar em muitas vendas

cliente(id, nome)
produtos(id, nome)
vendas(id, data, id_cliente)
vendas_produtos(id_vendas, id_produto, quant, valor_unit)
formas_pgto(id, nome)
vendas_formas_pgtos(id_venda, id_forma_pgto, valor, quantas_vezes)


id      produto      qtd_vendida     valor_total
100     coca cola       1000            2500
101     mouse           20              450
102     pasta           100             200

