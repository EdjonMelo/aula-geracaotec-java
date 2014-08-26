-- Antes de tudo:
DROP DATABASE testes;
CREATE DATABASE testes;
USE testes;

CREATE TABLE autores (
    id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(240),
    pais VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE editoras (
    id INT AUTO_INCREMENT NOT NULL,
    nome  VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE livros (
    id          INT AUTO_INCREMENT NOT NULL,
    editora_id  INT NOT NULL,
    titulo   VARCHAR(100),
    descricao TEXT,
    tipo ENUM('romance','poesia','drama'), 
    ano_publicacao VARCHAR(4),
    isbn VARCHAR(20),
    PRIMARY KEY (id),
    FOREIGN KEY (editora_id) REFERENCES editoras(id)
);

CREATE TABLE autores_livros (
	autor_id INT NOT NULL,
	livro_id INT NOT NULL,
	PRIMARY KEY (autor_id, livro_id),
	FOREIGN KEY (autor_id) REFERENCES autores(id),
    FOREIGN KEY (livro_id) REFERENCES livros(id)
);

CREATE TABLE bibliotecas (
    id       INT AUTO_INCREMENT NOT NULL,
    nome     VARCHAR(200),
    endereco VARCHAR(200),
    PRIMARY KEY (id)
 );
 
 CREATE TABLE bibliotecas_livros (
    biblioteca_id INT NOT NULL,
    livro_id INT NOT NULL,
    exemplares INT DEFAULT 1,
    PRIMARY KEY (biblioteca_id, livro_id),
    FOREIGN KEY (biblioteca_id) REFERENCES bibliotecas(id),
    FOREIGN KEY (livro_id) REFERENCES livros(id)
 );

-- EXERCÍCIO: INSERIR 8 autores, 4 editoras, 10 livros (5 com mais de um autor), 3 bibliotecas
-- Faça 20 distribuições de livros dentro das bibliotecas.

 INSERT INTO autores(nome, pais) VALUES("J. R. R. Tolkien", "Africa do Sul");
 
 INSERT INTO editoras(nome) VALUES("George Allen & Unwin");
 INSERT INTO editoras(nome) VALUES("Livraria Civilização");
 
 INSERT INTO livros(titulo, ano_publicacao, isbn, editora_id) 
 	VALUES("The Hobbit", 1937, "000711835-X", 1);	
 INSERT INTO livros(titulo, ano_publicacao, editora_id) 
 	VALUES("O Hobbit", 1962, 2);
 	
 INSERT INTO autores_livros VALUES(1,1);
 INSERT INTO autores_livros VALUES(1,2);
 
 INSERT INTO bibliotecas(nome) VALUES("Biblioteca GeraçãoTEC");
 INSERT INTO bibliotecas(nome) VALUES("Biblioteca Pública de Florianópolis");
 
 INSERT INTO bibliotecas_livros(biblioteca_id, livro_id) VALUES(1,1);
 INSERT INTO bibliotecas_livros(biblioteca_id, livro_id) VALUES(2,1);
 INSERT INTO bibliotecas_livros VALUES(1, 2, 10);
 
-----------------------------------------------------------------------------------
-- Busca em cima de relacionamentos (JOIN)

-- A palavra JOIN significa “unir”, portanto há na linguagem de 
-- banco de dados SQL uma instrução com este comando para unir duas 
-- ou mais tabelas.

 SELECT * FROM livros l JOIN bibliotecas b;
 SELECT * FROM livros l JOIN bibliotecas b JOIN bibliotecas_livros bl;
 SELECT * FROM livros l JOIN bibliotecas b JOIN bibliotecas_livros bl 
 	ON (l.id = bl.livro_id AND b.id = bl.biblioteca_id);
 
	 SELECT * FROM livros l JOIN bibliotecas b JOIN bibliotecas_livros bl 
	 	ON (l.id = bl.livro_id AND b.id = bl.biblioteca_id)
	 	WHERE l.titulo = "O Hobbit";

 SELECT * FROM autores a, livros l;
 SELECT * FROM autores a, livros l, autores_livros al;
 SELECT * FROM autores a, livros l, autores_livros al 
 	WHERE a.id = al.livro_id ORDER BY l.titulo;
 	
 SELECT * FROM livros l JOIN bibliotecas b JOIN bibliotecas_livros bl JOIN autores a JOIN autores_livros al ON (l.id = bl.livro_id AND b.id = bl.biblioteca_id AND a.id = al.livro_id)  WHERE a.nome = "J. R. R. Tolkien" AND b.nome = "Biblioteca Pública de Florianópolis";
-- EXERCÍCIO: CRIE 15 CONSULTAS interelacionando os dados que foram criados, criando 
-- comentários sobre o que cada uma está fazendo ou procurando. (enviar por email, 
-- junto com as inserções!)