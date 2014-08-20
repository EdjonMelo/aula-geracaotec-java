USE testes;
CREATE TABLE editoras (
    nome  VARCHAR(50)
);
DESC editoras;

# Alterando formato da tabela:

# Adicionando uma coluna
ALTER TABLE editoras ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY FIRST;
ALTER TABLE editoras ADD COLUMN criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP();
DESC editoras;

# Alterando uma coluna
ALTER TABLE editoras CHANGE COLUMN nome nome VARCHAR(255) NOT NULL;
DESC editoras;

# Removendo uma coluna
ALTER TABLE editoras ADD COLUMN ano_publicacao VARCHAR(50);
ALTER TABLE editoras DROP COLUMN ano_publicacao;
DESC editoras;

# Alterando dados já existentes
# Inserindo dados de teste
INSERT INTO editoras(nome) VALUES("Sextante"); 
INSERT INTO editoras(nome) VALUES("Casa do Código");
SELECT * FROM editoras;

# Alterando dados
UPDATE editoras SET nome="Atlas" WHERE nome="Sextante";
UPDATE editoras SET criado_em=CURRENT_TIMESTAMP() WHERE nome="Atlas";
UPDATE editoras SET nome="Bookman", criado_em=CURRENT_TIMESTAMP() WHERE id=1;
UPDATE editoras SET nome="Bookman", criado_em=CURRENT_TIMESTAMP() WHERE id=1 OR id=9;

# Removendo dados
DELETE FROM editoras WHERE id=1;
# DELETE FROM editoras; # NÃO FAÇAM ISTO NO TRABALHO AMIGUINHOS!!!!

# Exercícios

# Inserir 10 novas editoras
# Alterar 30 vezes os dados cadastrados entre livros, autores e editoras

# -----------------------------

# Removendo base de dados e tabelas;

CREATE DATABASE mimimi;         # criando base de dados
USE mimimi;
CREATE TABLE manamana(id INT);  # criando tabela;
DROP TABLE manamana;            # removendo tabela
DROP DATABASE mimimi;           # removendo base de dados
USE testes;

 
