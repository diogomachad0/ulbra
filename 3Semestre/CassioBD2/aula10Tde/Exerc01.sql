/*
1)
 Faça um trigger para alterar o estoque de um produto quando ocorrer quaisquer alterações na tabela orçamentos_produtos. 
 Também irá alterar o estoque, quando um ítem na tabela orçamentos_Produtos for cancelado. 
 Isso ocorre quando o campo Orp_Status recebe o valor 2.
*/

create trigger alterar_estoque
after update on orcamentos_produtos
for each row
begin
    if new.orp_Status = 2 then
        update produtos
        set pro_qtde = pro_qtde - old.orp_qtde
        where pro_id = old.orp_pro_id;
    else
        update produtos
        set pro_qtde = pro_qtde - (new.orp_qtde - old.orp_qtde)
        where pro_id = new.orp_pro_id;
    end if;
end;

/*
2)
 Faça um trigger para armazenar em uma tabela chamada produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada, prd_valor)
 quando ocorrer quaisquer alterações nos atributos da tabela produtos. No entanto,
 caso a alteração atribua o valor zero para o atributo prd_qtd_estoque, a tabela produtos_em_falta deverá ser 
 alimentada com as mesmas informações da tabela produto, exceto o atributo prd_valor. Além disso, o atributo prd_status do produto atualizado deve
 ser modificado para NULL e o atributo orp_status de todos os orcamentos_produtos desse produto deverá ser modificado também para NULL. 
*/

create trigger atualizar_produtos
after update on produtos
for each row
begin

end;
