<h1>💼 Projeto E-commerce com Spring Boot, JPA e Hibernate</h1>

Este projeto é um sistema de web services RESTful para um e-commerce simples, desenvolvido com Java 17, Spring Boot, JPA/Hibernate e banco de dados PostgreSQL (produção) e H2 (teste).

<h2>📌 Objetivos</h2>

Criar um projeto backend em Java com Spring Boot

Modelar o domínio de um sistema de pedidos e produtos

Implementar as camadas resource, service e repository

Realizar operações CRUD

Configurar perfis de execução (test, dev, prod)

Tratar exceções com retorno customizado

Realizar o deploy da aplicação na nuvem

<h2>🧱 Tecnologias e Dependências</h2>

Java 17

Spring Boot 3.x

Web

Data JPA

H2 Database (teste)

PostgreSQL (produção)

Maven


<h2>📂 Estrutura de Camadas</h2>
Entities (Modelo de Domínio): User, Order, Product, Category, OrderItem, Payment

Repositories: interfaces JPA para acesso ao banco

Services: lógica de negócio

Resources (Controllers): endpoints RESTful

Exceptions: tratamento customizado de erros



<h2>🔀 Principais Funcionalidades</h2>
📋 CRUD de usuários

🛍️ Cadastro e relacionamento de pedidos, produtos e categorias

💳 Associação de pagamento com pedido

📦 Controle de itens de pedido com quantidade e preço

📅 Datas em formato ISO 8601

🔒 Tratamento global de exceções

🔐 Segurança com JWT

Configuração de jwt.secret e jwt.expiration

Uso futuro para autenticação/autorizacão via tokens
