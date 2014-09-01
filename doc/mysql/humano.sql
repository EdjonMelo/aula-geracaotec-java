-- Humano para db.dao.HumanoDAOMySQL
DROP TABLE IF EXISTS humanos;
CREATE TABLE humanos (
    id INT AUTO_INCREMENT NOT NULL,
    nome       VARCHAR(255),
    altura     FLOAT,
    peso       FLOAT,
    morto      BOOLEAN,
    nascimento DATE,
    PRIMARY KEY (id)
);