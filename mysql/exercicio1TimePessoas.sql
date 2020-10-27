#Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionários desta empresa
create database db_time_pessoas;

#Crie uma tabela de funcionários e, utilizando a habilidade de abstração, determine 5 atributos relevantes dos funcionários para se trabalhar com o serviço deste RH
create table tb_colaboradores (
	nome varchar(50),
    nascimento date,
    cpf bigint(11),
    sexo enum('M', 'F', 'O'),
    salario decimal(7,2)
);

#Popule esta tabela com até 5 dados

insert into tb_colaboradores values ('Maria de Jesus', '1971-02-03', '12345678909', 'F', 10700.90);
insert into tb_colaboradores values ('João dos Santos', '1982-04-06', '23456789012', 'M', 1090.00);
insert into tb_colaboradores values ('Matheus Mendes', '1994-01-05', '87654321098', 'M', 2050.80);
insert into tb_colaboradores values ('Ariel Souza', '1991-06-07', '87690123456', 'O', 5600.70);
insert into tb_colaboradores values ('Gabriella Queiros', '2000-07-08', '90876543214', 'F', 1500.00);

#Faça um select que retorne os funcionários com o salário maior do que 2000

select * from tb_colaboradores where salario > 2000;

#Faça um select que retorne os funcionários com o salário menor do que 2000

select * from tb_colaboradores where salario < 2000;

#Ao término atualize um dado desta tabela através de uma query de atualização

update tb_colaboradores set nome = 'Alefe Nascimento' where cpf = '23456789012';