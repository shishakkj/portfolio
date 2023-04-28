CREATE TABLE Usuario (
  nome VARCHAR (50) not NULL,
  login_pk VARCHAR (20) not NULL,
  senha VARCHAR (15) NOT NULL,
  cpf VARCHAR (11) NOT NULL, 
  nome_pet_fk VARCHAR (20) NOT NULL,
  quantidadeDePets int NOT NULL,
  casaOuApartamento BOOLEAN NOT NULL,
  id_rotina_fk SERIAL,
  PRIMARY KEY (login_pk)
  )

CREATE TABLE Pet (
  nome_pk VARCHAR (20) NOT NULL,
  raca VARCHAR (20) NOT NULL,
  especie VARCHAR (20) NOT NULL,
  porte VARCHAR (20),
  idade int NOT NULL,
  materiais_id_fk SERIAL,
  PRIMARY KEY (nome_pk),
  FOREIGN KEY (materiais_id_fk) REFERENCES Materiais (id_pk)
)

CREATE table Materiais (
  id_pk SERIAL,
  comedouro VARCHAR (20) NOT NULL,
  bebedouro VARCHAR (20) NOT NULL,
  racao VARCHAR (40) not NULL,
  viveiro_id_fk SERIAL,
  caixaDeAreia BOOLEAN NOT NULL,
  outros VARCHAR(50) NOT NULL,
  nome_pet_fk VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_pk)
  )

CREATE TABLE Viveiro (
  id_pk SERIAL,
  aquario BOOLEAN NOT NULL,
  gaiola BOOLEAN NOT NULL,
  caixaDeVidro BOOLEAN NOT NULL,
  nome_pet_fk VARCHAR (20) NOT NULL,
  tamanho FLOAT NOT NULL,
  capacidade int NOT NULL,
  PRIMARY KEY (id_pk)
  )

CREATE TABLE Rotina (
  id_pk SERIAL,
  compromisso VARCHAR (100) NOT NULL,
  nome_pet_fk VARCHAR (20) NOT NULL,
  hora VARCHAR (4) NOT NULL,
  dia INT not NULL,
  PRIMARY KEY (id_pk),
  FOREIGN KEY (nome_pet_fk) REFERENCES Pet (nome_pk)
  )
  
ALTER TABLE materiais add FOREIGN KEY (viveiro_id_fk) REFERENCES Viveiro (id_pk)

ALTER TABLE usuario add FOREIGN KEY (nome_pet_fk) REFERENCES Pet (nome_pk)
ALTER TABLE usuario add FOREIGN KEY (id_rotina_fk) REFERENCES Rotina (id_pk)

ALTER TABLE viveiro add FOREIGN KEY (nome_pet_fk) REFERENCES (nome_pk)