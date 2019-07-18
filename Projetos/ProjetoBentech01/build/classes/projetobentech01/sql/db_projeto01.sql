CREATE TABLE tb_cadastro (
  id_tb_cadastro INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(100) NULL,
  sobrenome VARCHAR(100) NULL,
  idade INT NULL,
  data_nascimento DATE NULL,
  sexo CHAR(2) NULL,
  PRIMARY KEY(id_tb_cadastro)
);

CREATE TABLE tb_login (
  id_tb_login INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  usuario VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  PRIMARY KEY(id_tb_login)
);


