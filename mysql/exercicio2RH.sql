#Crie um banco de dados para um serviço de RH de uma empresa, o nome do banco deverá ter o seguinte nome db_RH2, onde o sistema trabalhará com as informações dos funcionários desta empresa

create database db_RH2;
use db_RH2;

#Crie uma tabela tb_cargo utilizando a habilidade de abstração e determine 3 atributos relevantes do Cargos para se trabalhar com o serviço deste RH

create table tb_cargo (
	id_cargo int primary key not null auto_increment,
    cargo varchar(50),
    senioridade varchar(10)
);

#Crie uma tabela tb_funcionario e, utilizando a habilidade de abstração, determine 5 atributos relevantes dos funcionários para se trabalhar com o serviço deste RH (não esqueça de criar a foreign key de tb_cargo nesta tabela)

create table tb_funcionario (
	id_cargo int,
    nome varchar(50),
    nascimento date,
    cpf bigint(11),
    sexo enum('M', 'F', 'O'),
    salario decimal(7,2)
);

#Popule a tabela cargos com até 5 dados
insert into tb_cargo (cargo, senioridade) values ('Desenvolvedor Java', 'Junior');
insert into tb_cargo (cargo, senioridade) values ('Desenvolvedor Java', 'Pleno');
insert into tb_cargo (cargo, senioridade) values ('Desenvolvedor Java', 'Sênior');
insert into tb_cargo (cargo, senioridade) values ('Desenvolvedor Javascript', 'Pleno');
insert into tb_cargo (cargo, senioridade) values ('Desenvolvedor Java', 'Sênior');

select * from tb_cargo;

#Popule a tabela funcionarios com até 15 dados

insert into tb_funcionario values ('1', 'Sabrina Giovanna Catarina Duarte', '1966-08-13', '93157081721', 'F', '500.00');
insert into tb_funcionario values ('2', 'Hadassa Andreia Bárbara Gonçalves', '1971-08-09', '54458045342', 'O', '1000.00');
insert into tb_funcionario values ('3', 'Renata Melissa Gonçalves', '1956-05-02', '71141266709', 'F', '1500.00');
insert into tb_funcionario values ('4', 'Leonardo Luiz Ian Nunes', '1994-09-23', '76926194173', 'M', '2000.00');
insert into tb_funcionario values ('5', 'Fernando Kevin Aparício', '1959-05-27', '51437011802', 'M', '2500.00');
insert into tb_funcionario values ('1', 'Tânia Marlene Isabelly Ribeiro', '1945-07-18', '44049259486', 'F', '3000.00');
insert into tb_funcionario values ('2', 'Henry Anthony Guilherme Aparício', '1949-12-10', '29054555785', 'M', '3500.00');
insert into tb_funcionario values ('3', 'Caleb Kaique Victor Almada', '1957-07-18', '89306055676', 'F', '4000.00');
insert into tb_funcionario values ('4', 'Anthony Pedro Carlos Freitas', '1979-04-16', '21534236350', 'M', '4500.00');
insert into tb_funcionario values ('5', 'Marlene Melissa Lavínia Aparício', '1961-12-10', '78685618231', 'F', '5000.00');
insert into tb_funcionario values ('1', 'Milena Heloisa Nunes', '1951-03-01', '28306454219', 'F', '500');
insert into tb_funcionario values ('2', 'Nina Isabela Corte Real', '1988-08-11', '44211153714', 'F', '1000.00');
insert into tb_funcionario values ('3', 'Allana Marli Alves', '1982-01-06', '05363659549', 'F', '1500.00');
insert into tb_funcionario values ('4', 'Pietra Carolina Fabiana Cardoso', '1968-05-16', '62734059134', 'F', '2000.00');
insert into tb_funcionario values ('5', 'Hadassa Luana da Luz', '1952-12-11', '59082728095', 'F', '2500.00');

#Faça um select que retorne os funcionários com o salário maior do que 2000

select * from tb_funcionario inner join tb_cargo on tb_cargo.id_cargo = tb_funcionario.id_cargo where salario > 2000;

#Faça um select trazendo  os funcionários com salário entre 1000 e 2000

select * from tb_funcionario inner join tb_cargo on tb_cargo.id_cargo = tb_funcionario.id_cargo where salario > 2000;

#Faça um select  utilizando LIKE buscando os Funcionários com a letra C

select * from tb_funcionario inner join tb_cargo on tb_cargo.id_cargo = tb_funcionario.id_cargo where nome like 'C%';