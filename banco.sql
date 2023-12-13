create database produtos_estoque;

use produtos_estoque;
 
 create table clientes(
id_cliente int auto_increment primary key not null,
nome varchar(700) not null,
cpf bigint not null,
email varchar(30) not null, 
telefone bigint not null
);

create table produtos(
id_produto int auto_increment primary key not null,
nome_produto varchar(50) not null,
quantidade_estoque int not null,
valor double not null,
fornecedor varchar(30) not null
);

create table compras (
    id_compra int auto_increment primary key not null,
    id_cliente int not null,
    id_produto int not null,
    quantidade_comprada int not null,
    data_compra date not null,
    
    foreign key (id_cliente) references clientes (id_cliente),
    foreign key (id_produto) references produtos (id_produto)
);

insert into clientes (id_cliente, nome, cpf, email, telefone) values 
(0, "Julia", 12345, "fonseca@gmail.com", 12345 ),
(0, "joao", 54321, "joao@gmail.com", 54321),
(0, "Raica", 56789, "raica@gmail.com", 56789),
(0, "Luiz", 98765, "luiz@gmail.com", 98765),
(0, "ana", 55555, "ana@gmail.com", 55555);

insert into produtos (nome_produto, quantidade_estoque, valor, fornecedor) values 
("HD", 50, 199.99, "Seagate"),
("SSD", 30, 149.99, "Samsung"),
("Tela", 20, 299.99, "AOC"),
("Teclado", 100, 29.99, "Logitech"),
("mouse", 50, 79.99, "Corsair");

