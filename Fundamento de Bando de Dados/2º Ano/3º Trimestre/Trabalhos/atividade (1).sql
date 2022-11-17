CREATE TABLE CLIENTE(
  Nome VARCHAR(50) NOT null,
  CPF VARCHAR (15) NOT null,
  ProdutosConsumidos INT NOT null,
  WhatsApp VARCHAR(25) NOT null,
  PRIMARY KEY (CPF)
  );
CREATE TABLE VENDEDOR(
  Nome VARCHAR (50) NOT null,
  Salario INT NOT null,
  Vendas INT not null,
  Telefone VARCHAR (25) NOT null,
  CPF VARCHAR (15) NOT null,
  PRIMARY KEY (CPF)
  );
CREATE TABLE PRODUTO(
  Nome VARCHAR (50) NOT null,
  Ingredientes VARCHAR (25) NOT null,
  Preço INT NOT null,
  Tipo INT NOT null,
  identificador VARCHAR(20) NOt null,
  CPFcliente VARCHAR(15) NOT null,
  CPFvendedor VARCHAR(15) NOT null,
  PRIMARY KEY (identificador),
  FOREIGN key (CPFcliente)
  REFERENCES CLIENTE (CPF),
  FOREIGN KEY (CPFvendedor)
  REFERENCES VENDEDOR (CPF)
  );