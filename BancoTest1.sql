-- ============================================================
-- BANCO DE DADOS - LOJA DE JOGOS
-- ============================================================

-- Apaga o banco anterior, caso exista
DROP DATABASE IF EXISTS loja_jogos;

-- Cria o banco novamente
CREATE DATABASE loja_jogos
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

-- Seleciona o banco
USE loja_jogos;


-- ============================================================
-- TABELA 1 - USUÁRIOS
-- Usada para o login do sistema
-- ============================================================

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL
);


-- ============================================================
-- TABELA 2 - JOGOS
-- Armazena os jogos disponíveis na loja
-- ============================================================

CREATE TABLE jogos (
    id_jogo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    plataforma VARCHAR(50) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    estoque INT NOT NULL,
    descricao VARCHAR(500)
);


-- ============================================================
-- TABELA 3 - CLIENTES
-- Armazena os clientes da loja
-- ============================================================

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    telefone VARCHAR(20),
    email VARCHAR(100) UNIQUE
);


-- ============================================================
-- TABELA 4 - VENDAS
-- Registra as vendas realizadas
-- ============================================================

CREATE TABLE vendas (
    id_venda INT AUTO_INCREMENT PRIMARY KEY,

    id_cliente INT NOT NULL,

    id_jogo INT NOT NULL,

    quantidade INT NOT NULL,

    preco_unitario DECIMAL(10,2) NOT NULL,

    data_venda DATETIME DEFAULT CURRENT_TIMESTAMP,

    -- Relacionamento com a tabela clientes
    FOREIGN KEY (id_cliente)
        REFERENCES clientes(id_cliente),

    -- Relacionamento com a tabela jogos
    FOREIGN KEY (id_jogo)
        REFERENCES jogos(id_jogo)
);


-- ============================================================
-- INSERINDO USUÁRIOS DE TESTE
-- ============================================================

INSERT INTO usuarios
(nome, cpf, email, senha)
VALUES
('Administrador', '11111111111', 'admin@gmail.com', '123456'),
('Kaua', '22222222222', 'kaua@gmail.com', '123456');


-- ============================================================
-- INSERINDO JOGOS DE TESTE
-- ============================================================

INSERT INTO jogos
(nome, genero, plataforma, preco, estoque, descricao)
VALUES
('GTA V', 'Acao', 'PC', 99.90, 10, 'Jogo de mundo aberto'),

('Minecraft', 'Aventura', 'PC', 89.90, 15, 'Jogo de construcao e sobrevivencia'),

('EA FC 26', 'Esporte', 'PC', 299.90, 8, 'Jogo de futebol'),

('God of War Ragnarok', 'Acao', 'PlayStation', 249.90, 5, 'Jogo de acao e aventura');


-- ============================================================
-- INSERINDO CLIENTES DE TESTE
-- ============================================================

INSERT INTO clientes
(nome, cpf, telefone, email)
VALUES
('Joao Silva', '33333333333', '49999999999', 'joao@gmail.com'),

('Pedro Souza', '44444444444', '48888888888', 'pedro@gmail.com');


-- ============================================================
-- INSERINDO VENDAS DE TESTE
-- ============================================================

INSERT INTO vendas
(id_cliente, id_jogo, quantidade, preco_unitario)
VALUES
(1, 1, 1, 99.90),

(2, 2, 2, 89.90);


-- ============================================================
-- CONSULTA 1 - VER USUÁRIOS
-- ============================================================

SELECT * FROM usuarios;


-- ============================================================
-- CONSULTA 2 - VER JOGOS
-- ============================================================

SELECT * FROM jogos;


-- ============================================================
-- CONSULTA 3 - VER CLIENTES
-- ============================================================

SELECT * FROM clientes;


-- ============================================================
-- CONSULTA 4 - VER VENDAS
-- ============================================================

SELECT * FROM vendas;


-- ============================================================
-- CONSULTA 5 - VER VENDAS COM OS NOMES
-- ============================================================

SELECT
    vendas.id_venda,
    clientes.nome AS cliente,
    jogos.nome AS jogo,
    vendas.quantidade,
    vendas.preco_unitario,
    vendas.data_venda
FROM vendas
INNER JOIN clientes
    ON vendas.id_cliente = clientes.id_cliente
INNER JOIN jogos
    ON vendas.id_jogo = jogos.id_jogo;