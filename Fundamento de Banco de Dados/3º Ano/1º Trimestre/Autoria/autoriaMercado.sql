CREATE TABLE Mercado (
  id_mercado_pk SERIAL,
  nome_mercado VARCHAR (30) NOT NULL,
  cpf_cliente_fk VARCHAR (11) NOT NULL,
  cpf_funcionario_fk VARCHAR (11) NOT NULL,
  id_produto_fk SERIAL,
  PRIMARY KEY (id_mercado_pk),
  FOREIGN KEY (cpf_cliente_fk) REFERENCES Cliente (cpf_cliente_pk),
  FOREIGN KEY (cpf_funcionario_fk) REFERENCES Funcionario (cpf_funcionario_pk),
  FOREIGN KEY (id_produto_fk) references Produto (id_produto_pk)
  )
  
CREATE table Produto (
  id_produto_pk SERIAL,
  nome_produto VARCHAR (50) NOT NULL,
  PRIMARY KEY (id_produto_pk)
  )
  
CREATE TABLE Cliente(
  cpf_cliente_pk VARCHAR (11) NOT NULL,
  nome_cliente VARCHAR (100) NOT NULL,
  PRIMARY KEY (cpf_cliente_pk)
  )

CREATE TABLE Funcionario (
  cpf_funcionario_pk VARCHAR (11) NOT NULL,
  nome_funcionario VARCHAR (100) NOT NULL,
  turno VARCHAR (20) NOT NULL,
  carga_horaria INT NOT NULL,
  PRIMARY KEY (cpf_funcionario_pk)
  )
  
  ALTER TABLE produto add id_mercado_fk SERIAL
  
  Alter table funcionario add id_mercado_fk SERIAL
  
  ALTER TABLE produto ADD FOREIGN KEY (id_mercado_fk) REFERENCES mercado (id_mercado_pk)
  
  ALTER TABLE funcionario ADD FOREIGN KEY (id_mercado_fk) REFERENCES mercado (id_mercado_pk)

  Alter table cliente add id_mercado_fk SERIAL
  
  ALTER TABLE cliente ADD FOREIGN KEY (id_mercado_fk) REFERENCES mercado (id_mercado_pk)