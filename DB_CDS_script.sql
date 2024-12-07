
CREATE DATABASE DB_CDS;
GO

USE DB_CDS;
GO

CREATE TABLE Artista (
    Cod_Art INT NOT NULL PRIMARY KEY,
    Nome_Art VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Gravadora (
    Cod_Grav INT NOT NULL PRIMARY KEY,
    Nome_Grav VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Categoria (
    Cod_Cat INT NOT NULL PRIMARY KEY,
    Nome_Cat VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Estado (
    Sigla_Est CHAR(2) NOT NULL PRIMARY KEY,
    Nome_Est CHAR(50) NOT NULL UNIQUE
);

CREATE TABLE Cidade (
    Cod_Cid INT NOT NULL PRIMARY KEY,
    Sigla_Est CHAR(2) NOT NULL REFERENCES Estado(Sigla_Est),
    Nome_Cid VARCHAR(100) NOT NULL
);

CREATE TABLE Cliente (
    Cod_Cli INT NOT NULL PRIMARY KEY,
    Cod_Cid INT NOT NULL REFERENCES Cidade(Cod_Cid),
    Nome_Cli VARCHAR(100) NOT NULL,
    End_Cli VARCHAR(200) NOT NULL,
    Renda_Cli DECIMAL(10,2) NOT NULL DEFAULT 0 CHECK (Renda_Cli >= 0),
    Sexo_Cli CHAR(1) NOT NULL DEFAULT 'F' CHECK (Sexo_Cli IN ('F', 'M'))
);

CREATE TABLE Conjuge (
    Cod_Cli INT NOT NULL PRIMARY KEY REFERENCES Cliente(Cod_Cli),
    Nome_Conj VARCHAR(100) NOT NULL,
    Renda_Conj DECIMAL(10,2) NOT NULL DEFAULT 0 CHECK (Renda_Conj >= 0),
    Sexo_Conj CHAR(1) NOT NULL DEFAULT 'M' CHECK (Sexo_Conj IN ('F', 'M'))
);

CREATE TABLE Funcionário (
    Cod_Func INT NOT NULL PRIMARY KEY,
    Nome_Func VARCHAR(100) NOT NULL,
    End_Func VARCHAR(200) NOT NULL,
    Sal_Func DECIMAL(10,2) NOT NULL DEFAULT 0 CHECK (Sal_Func >= 0),
    Sexo_Func CHAR(1) NOT NULL DEFAULT 'M' CHECK (Sexo_Func IN ('F', 'M'))
);

CREATE TABLE Dependente (
    Cod_Dep INT NOT NULL PRIMARY KEY,
    Cod_Func INT NOT NULL REFERENCES Funcionário(Cod_Func),
    Nome_Dep VARCHAR(100) NOT NULL,
    Sexo_Dep CHAR(1) NOT NULL DEFAULT 'M' CHECK (Sexo_Dep IN ('F', 'M'))
);

CREATE TABLE Título (
    Cod_Tit INT NOT NULL PRIMARY KEY,
    Cod_Cat INT NOT NULL REFERENCES Categoria(Cod_Cat),
    Cod_Grav INT NOT NULL REFERENCES Gravadora(Cod_Grav),
    Nome_CD VARCHAR(100) NOT NULL UNIQUE,
    Val_CD DECIMAL(10,2) NOT NULL CHECK (Val_CD > 0),
    Qtd_Estq INT NOT NULL CHECK (Qtd_Estq >= 0)
);

CREATE TABLE Pedido (
    Num_Ped INT NOT NULL PRIMARY KEY,
    Cod_Cli INT NOT NULL REFERENCES Cliente(Cod_Cli),
    Cod_Func INT NOT NULL REFERENCES Funcionário(Cod_Func),
    Data_Ped SMALLDATETIME NOT NULL,
    Val_Ped DECIMAL(10,2) NOT NULL DEFAULT 0 CHECK (Val_Ped >= 0)
);

CREATE TABLE Título_Pedido (
    Num_Ped INT NOT NULL REFERENCES Pedido(Num_Ped),
    Cod_Tit INT NOT NULL REFERENCES Título(Cod_Tit),
    Qtd_CD INT NOT NULL CHECK (Qtd_CD >= 1),
    Val_CD DECIMAL(10,2) NOT NULL CHECK (Val_CD > 0),
    PRIMARY KEY (Num_Ped, Cod_Tit)
);

CREATE TABLE Título_Artista (
    Cod_Tit INT NOT NULL REFERENCES Título(Cod_Tit),
    Cod_Art INT NOT NULL REFERENCES Artista(Cod_Art),
    PRIMARY KEY (Cod_Tit, Cod_Art)
);
