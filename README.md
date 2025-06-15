<h1>💼 E-Commerce Project with Spring Boot, JPA & Hibernate</h1>

This project is a RESTful web services system for a simple e-commerce platform, developed with Java 17, Spring Boot, JPA/Hibernate, and PostgreSQL (production) / H2 (testing) databases.

<h2>📌 Objectives</h2>
Create a Java backend project using Spring Boot

Model the domain for an order/product management system

Implement resource, service, and repository layers

Perform CRUD operations

Configure execution profiles (test, dev, prod)

Implement custom exception handling

Deploy the application to cloud

<h2> ## 🚀How to use</h2>

### 1. Clone the repository

```bash
git clone git@github.com:JVMuniz01/workshop-springboot3-jpa.git
```
Verifique se o arquivo `application.properties` está devidamente configurado para o perfil dev:
`spring.profiles.active=dev`

### 2. Check Configuration and run 

```bash
cd workshop-springboot3-jpa
```
Open the `application.properties` or application.yml file and make sure it's set to use a local test environment. 
```bash
./mvnw spring-boot:run
```
Teste o CRUD pelo postman ou pelo Swagger, acessando:
```navegador
http://localhost:8080/swagger-ui/index.html
```

<h2>🧱 Technologies & Dependencies</h2>
Java 17

Spring Boot 3.x

Spring Web

Spring Data JPA

H2 Database (testing)

PostgreSQL (production)

Maven

<h2>📂 Layer Architecture</h2>
Entities (Domain Model): User, Order, Product, Category, OrderItem, Payment

Repositories: JPA interfaces for database access

Services: Business logic

Resources (Controllers): RESTful endpoints

Exceptions: Custom error handling

<h2>🔀 Key Features</h2>
📋 User CRUD operations

🛍️ Order/product/category registration and relationships

💳 Payment-order association

📦 Order item management with quantity and price control

📅 ISO 8601 date formatting

🔒 Global exception handling

🔐 JWT security

JWT secret and expiration configuration

Future implementation for token-based authentication/authorization
