#Crie um banco de dados para um serviço de um açougue, o nome do banco deverá ter o seguinte nome db_cidade_das_carnes, onde o sistema trabalhará com as informações dos produtos desta empresa
create database db_cidade_das_carnes;
use db_cidade_das_carnes;

#O sistema trabalhará com 2 tabelas tb_produto e tb_categoria
#Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço desse açougue
create table tb_categoria (
	id_categoria int primary key not null auto_increment,
    tipo_produto enum('comida', 'bebida', 'diversos'),
    marca_produto varchar(20)
);

#Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não esqueça de criar a foreign key de tb_categoria nesta tabela)
create table tb_produto (
	id_categoria int,
    produto varchar(20),
    validade date,
    preco decimal(4,2),
    qualidade enum('A', 'B', 'C'),
    peso decimal (7,2),
    foreign key (id_categoria) references tb_categoria (id_categoria)
);

#Popule a tabela Categoria com até 5 dados
insert into tb_categoria (tipo_produto, marca_produto) values ('comida', 'Sadia');
insert into tb_categoria (tipo_produto, marca_produto) values ('bebida', '51');
insert into tb_categoria (tipo_produto, marca_produto) values ('diversos', 'Brfoods');
insert into tb_categoria (tipo_produto, marca_produto) values ('comida', 'Perdigão');
insert into tb_categoria (tipo_produto, marca_produto) values ('diversos', 'Diferente');

#Popule a tabela Produto com até 8 dados
insert into tb_produto values ('1', 'Picanha', '2020-12-09', '49.90', 'A', '1000.00');
insert into tb_produto values ('2', 'Cachaça', '2021-12-09', '19.90', 'B', '990');
insert into tb_produto values ('3', 'Pão de alho', '2020-11-09', '9.90', 'C', '400.00');
insert into tb_produto values ('4', 'Asa de frango', '2020-12-07', '8.90', 'A', '500.00');
insert into tb_produto values ('5', 'Carvão', '2030-12-09', '25.90', 'B', '15000.00');
insert into tb_produto values ('1', 'Costela suína', '2020-12-19', '29.90', 'C', '1000.00');
insert into tb_produto values ('2', 'Ice', '2022-12-09', '5.90', 'A', '350.00');
insert into tb_produto values ('5', 'Fósforo', '2025-12-09', '3.90', 'B', '50.00');

#Faça um select que retorne os Produtos com o valor maior do que 50 reais
select * from tb_produto where preco > 50;

#Faça um select trazendo  os Produtos com valor entre 3 e 60 reais
select * from tb_produto where preco between 3 and 60;

#Faça um select  utilizando LIKE buscando os Produtos com as letras CO
select * from tb_produto where produto like 'Co%';

#Faça um um select com Inner join entre  tabela categoria e produto
select * from tb_produto
inner join tb_categoria on tb_produto.id_categoria = tb_categoria.id_categoria;

#Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_produto
inner join tb_categoria on tb_produto.id_categoria = tb_categoria.id_categoria where tipo_produto like '%comida%';