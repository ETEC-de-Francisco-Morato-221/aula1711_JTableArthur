-- Apaga o BD se ele já existe
 DROP DATABASE IF EXISTS Supermercado;

-- Criação do BD
CREATE DATABASE Supermercado;

-- Usando o BD Supermercado;
USE Supermercado;

-- Criando da tabela Produto
CREATE TABLE Produto (
    Codigo INT NOT NULL PRIMARY KEY,
    Descricao VARCHAR(50) NOT NULL,
    Quantidade INT,
    Preco DOUBLE 
)
