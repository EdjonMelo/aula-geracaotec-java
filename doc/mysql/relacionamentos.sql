# Bora limpar tudo!

DROP DATABASE testes;
CREATE DATABASE testes;
USE testes;

CREATE TABLE autores (
    id INT AUTO_INCREMENT NOT NULL,
    primeiro_nome  VARCHAR(50),
    ultimo_nome VARCHAR(50),
    pais       VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE editoras (
    id INT AUTO_INCREMENT NOT NULL,
    nome  VARCHAR(100),
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
    PRIMARY KEY (id)
);

CREATE TABLE livros (
    id          INT AUTO_INCREMENT NOT NULL,
    autor_id    INT NOT NULL,
    editora_id  INT NOT NULL,
    titulo   VARCHAR(100),
    descricao TEXT,
    tipo ENUM('romance','poesia','drama'), 
    ano_publicacao VARCHAR(4),
    isbn VARCHAR(20),
    PRIMARY KEY (id),
    FOREIGN KEY (autor_id) REFERENCES autores(id)
);

# Adicionando FK depois da tabela ter sido criada
ALTER TABLE livros ADD FOREIGN KEY (editora_id) REFERENCES editoras(id);

# INSIRA A INFORMAÇÃO DE 5 livros completos, 3 autores e 2 editoras que se relacionam
# dica insira começe a inserir os dados de trás para frente.

# ==============================================
# Mais relacionamentos
CREATE TABLE bibliotecas (
    id       INT AUTO_INCREMENT NOT NULL,
    nome     VARCHAR(200),
    endereco VARCHAR(200),
    PRIMARY KEY (id)
 );
 
 CREATE TABLE bibliotecas_livros (
    biblioteca_id INT NOT NULL,
    livro_id INT NOT NULL,
    PRIMARY KEY (biblioteca_id, livro_id),
    FOREIGN KEY (biblioteca_id) REFERENCES bibliotecas(id),
    FOREIGN KEY (livro_id) REFERENCES livros(id)
 );

--==== EXERCÍCIOS ====
--
--Pretende-se criar uma base de dados que permita gerir uma parte da 
--informação de uma clinica de saúde.
--
--Fundamentalmente a base de dados deverá guardar a informação relativa aos doentes 
--que frequentam a clínica:
--- nome, 
--- morada,
--- telefone,
--- numero de beneficiário, e dos médicos que lá trabalham:
--- nome,
--- morada, 
--- contacto,
--- especialidade.
-- 
--Para além disso o sistema deverá registar as marcações de consultas de cada paciente 
--para um determinado médico sabendo que esse médico só pratica uma determinada 
--especialidade. No entanto, na clinica um paciente pode obviamente consultar diferentes 
--médicos para a mesma ou para diferentes especialidades. 
--
-- -----------------------
--
--Crie e desenvolvova uma base de dados a partir da seguinte 
--descrição do sistema: 
--
--Uma empresa de venda de automóveis retende implementar um sistema para gerir a 
--informação relativa às eparações de oficina efectuadas nos veículos dos seus clientes. 
--
--O sistema de informação deverá permitir manter um registo histórico de todas as 
--reparações efectuadas. 

 -- A empresa pretende manter dos clientes a seguinte informação: 
--- código de identificação, 
--- nome, 
--- endereco,
--- telefone.
-- 
--A empresa pretende também saber os veículos que um dado cliente teve ou tem e as datas
--em que foram adquiridos. 

 -- Dos funcionários da oficina a empresa pretende manter a seguinte
--informação: 
--- código de identificação, 
--- nome, 
--- endereco, 
--- telefone,
--- categoria. 
--
--O custo horário de mão de obra depende da categoria do funcionário e é definido através 
--de uma tabela que é atualizada regularmente. 

--A empresa pretende saber para cada reparação: 
--- qual o veículo, 
--- qual o cliente, 
--- data em que foi efetuada,
--- o custo total da reparação.
-- 
--A empresa pretende também armazenar para cada reparação as peças que foram utilizadas 
--e o seu preço, bem como o tempo de mão de obra gasto por cada funcionário e o
--respectivo custo. A empresa pretende manter para as peças em armazém a seguinte 
--informação: 
--- código de identificação,
--- designação,
--- custo unitário,
--- quantidade em armazém.