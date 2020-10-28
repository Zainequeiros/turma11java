#Para chamar o banco de dados em que a tabela está
use db_estoque;

#Para selecionar todos os itens da tabela produto, atrelados aos itens da tabela marcas
select * from tb_produtos
	inner join tb_marcas on tb_marcas.id = tb_produtos.marca_id;
    
#Para trazer colunas específicas da tabela produtos e marcasfuncionariosfuncionarios
select tb_produtos.nome, tb_produtos.preco, tb_marcas.nome
	from tb_produtos
inner join tb_marcas on tb_marcas.id = tb_produtos.marca_id
where tb_marcas.nome like "%Farm%"
and tb_produtos.preco < 50.00;