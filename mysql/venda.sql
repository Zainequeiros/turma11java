CREATE TABLE tb_venda (
    idVenda SMALLINT PRIMARY KEY AUTO_INCREMENT,
    produto VARCHAR(255) NOT NULL,
    preco DECIMAL(10.2) unsigned,
    horarioVenda DATETIME DEFAULT CURRENT_TIMESTAMP,
    data_Entrega DATE,
    hora_Entrega TIME
);
insert into tb_venda (produto, preco, data_Entrega, hora_Entrega) values
("Ecosport", 70.000, "2020-12-03", "13:40:00");

select * from tb_venda;

#Data type - tipo de dado no português
#Upper case maiusculo, lower case minusculo - chora por tudo
#Primary key é uma chave primária, auto increment aumenta automaticamente
#default padrãoptimize
#current_timestamp - horário atual