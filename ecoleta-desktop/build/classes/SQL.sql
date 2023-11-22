CREATE TABLE ponto_de_coleta (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) UNIQUE,
    email VARCHAR(100),
    cidade VARCHAR(100),
    tipo VARCHAR(100),
    latitude DOUBLE PRECISION,
    longitude DOUBLE PRECISION
);