create database Ford;
drop database Ford;
show databases;
use aula1;
create table funcionarios (
	nome varchar(30),
    idade tinyint,
    sexo char(1),
    peso float,
    altura float,
    nacionalidade varchar(20)
);
insert into funcionarios values ("Juliana", 22, "f", 60, 1.65, "Brasileira");
insert into funcionarios (nome, sexo) values ("Marcio", "m");

#GET
select * from funcionarios;
#POST
insert into funcionarios values
	("Marcela", 22, "f", 60, 1.65, "Brasileira"),
    ("Gabriel", 22, "m", 60, 1.65, "Brasileira"),
    ("Juliana", 22, "f", 60, 1.65, "Brasileira");
    #PUT = update
    update funcionarios set nacionalidade = "Argentino" where nome = "Gabriel";
    
    show tables;
    describe funcionarios;
    select * from funcionarios;