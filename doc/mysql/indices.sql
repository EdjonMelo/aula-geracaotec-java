--O uso de índices traz grandes melhorias para o desempenho do banco de dados.
--
--O banco de dados se utiliza de dois métodos para acesso seus dados:
--* Exame de tabela: examina todas as páginas de dados da tabela
--* Exame em índice: percorre uma estrutura de árvore para localizar os registros 
--utilizando comparações, retornando os registros que satisfazem os critérios

-- Já aprendemos dois índices, sem saber que eram índices:
-- PRIMARY KEY
SHOW INDEXES FROM autores;
-- FOREIGN KEY
SHOW INDEXES FROM livros;

-- Mas podemos adicionar ainda mais índices em cara uma de nossas tabelas

-- Criando um índice
CREATE INDEX <nome_indice> ON <nome_tabela> (<coluna>);
-- Exemplo
CREATE INDEX idx_autores_nome ON autores (nome);
SHOW INDEXES FROM autores;

-- Criando índices durante a criação da tabela
CREATE TABLE leitores (
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(240) NOT NULL,
    idade INT UNSIGNED,
    PRIMARY KEY (id),
    INDEX (nome),
    INDEX (idade)
);
SHOW INDEXES FROM leitores;

----------------------------------

-- Exercício:
-- 1. Utilizando o exemplo do busca.sql, adicionar índices em todas as possíveis buscas
-- textuais
-- 2. Crie 2 tabelas utilizando que utilizem índices que não sejam nem chave primária
-- ou estangeira. 

----------------------------------