CREATE TABLE Aniversariante (
  idade int not null,
  cpf VARCHAR(11) not null
  )
 
CREATE TABLE Festa (
  dia DATE not null
  )
  
 CREATE TABLE Convidado (
   idade int not null,
   cpf VARCHAR not null
   )
 
 CREATE TABLE Localizacao(
   area_metros DECIMAL not null,
   descricao VARCHAR(100) not NULL
   )
  alter TABLE aniversariante
  add nome_pk VARCHAR(50) Not null;
  
  ALTER TABLE aniversariante add PRIMARY KEY (nome_pk)
  
  ALTER table convidado 
  add nome_pk VARCHAR(50) not null

  ALTER TABLE convidado add PRIMARY KEY (nome_pk)
  
  alter TABLE localizacao 
  add cep_pk VARCHAR(9) not null
  
  ALTER TABLE localizacao add PRIMARY KEY (cep_pk)
  
  alter table festa add id_pk int not null
  
  alter table festa add PRIMARY KEY (id_pk)
  
  alter table festa add cep_fk VARCHAR (9) not null
  alter table festa add nome_aniversariante_fk VARCHAR (50) not null;
  
  alter table festa add FOREIGN KEY(cep_fk) REFERENCES localizacao (cep_pk)
  alter table festa add FOREIGN KEY(nome_aniversariante_fk) REFERENCES aniversariante (nome_pk)