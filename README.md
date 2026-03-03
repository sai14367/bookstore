📘 Secure Bookstore API

A production-ready RESTful Bookstore API built using Spring Boot 3 with JWT Authentication, Spring Security, Swagger, and layered architecture.

🚀 Overview

This project demonstrates a secure backend system implementing:

JWT-based authentication

Stateless session management

Layered architecture (Controller → Service → Repository)

DTO pattern

Global exception handling

Input validation

Swagger documentation

H2 / MySQL database support

This project is designed to reflect real-world backend engineering practices.

🛠 Tech Stack
Technology	Version
Java	17
Spring Boot	3.3.2
Spring Security	6
JWT (JJWT)	0.11.5
Spring Data JPA	Latest
MySQL / H2	Supported
Swagger (OpenAPI)	2.6.0
Maven	3+
🔐 Authentication Flow (JWT)

User registers via /api/register

User logs in via /api/login

Server generates JWT token

Client sends token in header:

Authorization: Bearer <your_token>

JwtFilter validates token on every request

Protected endpoints require authentication

📂 Project Structure
src/main/java/com/bookstore/bookstore/
│
├── config/         → Security configuration
├── controller/     → REST controllers
├── dto/            → Data Transfer Objects
├── entity/         → JPA entities
├── exception/      → Global exception handling
├── repository/     → JPA repositories
├── security/       → JWT utilities & filter
├── service/        → Business logic
└── BookstoreApplication.java
📌 Features
🔐 Security

JWT Authentication

Stateless session

Password encryption (BCrypt)

Secure endpoints

📚 Book Management

Add book

Get all books

Get book by ID

Update book

Delete book

Search by title

Search by author

Search by genre

Sorting support

⚙ Backend Architecture

DTO pattern

Custom exception handling

Validation using @Valid

Clean layered architecture

📖 API Endpoints
🔑 Authentication
Method	Endpoint	Description
POST	/api/register	Register new user
POST	/api/login	Login and receive JWT
📚 Books
Method	Endpoint	Description
GET	/api/books	Get all books
GET	/api/books/{id}	Get book by ID
POST	/api/books	Add book
PUT	/api/books/{id}	Update book
DELETE	/api/books/{id}	Delete book
GET	/api/books/search/title	Search by title
GET	/api/books/search/author	Search by author
GET	/api/books/search/genre	Search by genre
GET	/api/books/sort	Sort books
📖 Swagger Documentation

Access Swagger UI:

http://localhost:8080/swagger-ui/index.html
⚙️ Running Locally
1️⃣ Clone repository
git clone https://github.com/YOUR_USERNAME/secure-bookstore-api.git
cd secure-bookstore-api
2️⃣ Build project
mvn clean install
3️⃣ Run application
mvn spring-boot:run

Server runs on:

http://localhost:8080
🗄 Database Configuration
Using H2 (Development)

Default in-memory DB:

http://localhost:8080/h2-console

JDBC URL:

jdbc:h2:mem:testdb
Using MySQL

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=root
spring.datasource.password=yourpassword
🧠 Concepts Demonstrated

Spring Security Filter Chain

JWT Token Generation & Validation

Stateless Authentication

REST API best practices

DTO usage

Exception handling strategy

Validation framework

Clean code structure

👨‍💻 Author

Venkata Sai Kumar
Information Technology Student
Backend Development Enthusiast
