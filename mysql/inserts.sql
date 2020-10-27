use test;
create table funcionarios (
	id int not null auto_increment,
    nome varchar(30) not null,
    nascimento date,
    sexo enum ('M','F'),
    peso decimal(5,2),
    altura decimal(3,2),
    nacionalidade varchar(20) default 'Brasil',
    primary key (id)
    ) engine=InnoDB;
    insert into funcionarios values (default, 'Alex Tenorio da Silva', '2018-02-03', 'M', '68.5', '2.05', default);
    select * from funcionarios;
    insert into funcionarios (nome, nascimento, sexo, peso, altura) 
		values ('Gabriela', '1998-02-03', 'F', '58.5', 1.60),
			   ('João', '1998-02-04', 'M', '68.5', 1.70),
               ('Marcio', '1998-02-05', 'M', '78.5', 1.80);
	select * from funcionarios;
    select * from funcionarios where peso > 67;