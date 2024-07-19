CREATE TABLE Clientes (
    Id SERIAL PRIMARY KEY,
    Nome VARCHAR NOT NULL,
    CPF VARCHAR NOT NULL,
    Telefone VARCHAR,
    DataCadastro TIMESTAMP NOT NULL
);
CREATE TABLE Produtos (
  Id SERIAL PRIMARY KEY,
  Descricao VARCHAR NOT NULL,
  Valor DECIMAL NOT NULL,
  DataCadastro TIMESTAMP NOT NULL

);

CREATE TABLE Pedidos (
     Id SERIAL PRIMARY KEY,
     Id_Cliente SERIAL NOT NULL,
     Desconto DECIMAL,
     Valor DECIMAL NOT NULL,
     FormaPagamento VARCHAR NOT NULL,
     DataVenda TIMESTAMP NOT NULL,
     FOREIGN KEY (Id_Cliente) REFERENCES Clientes(Id)
);


CREATE TABLE ItensPedido (
    Id SERIAL PRIMARY KEY,
    Id_Produto SERIAL NOT NULL,
    Id_Pedido SERIAL NOT NULL ,
    Quantidade INT NOT NULL,
    Valor DECIMAL NOT NULL,
    FOREIGN KEY (Id_Produto) REFERENCES Produtos(Id),
    FOREIGN KEY(Id_Pedido) REFERENCES Pedidos(Id)
);

