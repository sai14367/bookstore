# 📘 Secure Bookstore API  
---

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.3.2-brightgreen)
![JWT](https://img.shields.io/badge/JWT-Authentication-orange)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## 🚀 Overview

A secure and production-ready RESTful **Bookstore API** built using **Spring Boot 3**, implementing:

- 🔐 JWT Authentication  
- 🛡 Spring Security (Stateless)  
- 📚 Book CRUD Operations  
- 📖 Swagger API Documentation  
- 🧩 DTO Pattern  
- ⚠ Global Exception Handling  
- ✅ Validation  

Designed following real-world backend architecture standards.

---

## 🏗 Architecture

```
Controller → Service → Repository → Database
             ↓
           DTO Layer
             ↓
     Global Exception Handler
             ↓
         JWT Security Filter
```

---

## 🛠 Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Spring Boot | 3.3.2 |
| Spring Security | 6 |
| JWT (JJWT) | 0.11.5 |
| Spring Data JPA | Latest |
| MySQL / H2 | Supported |
| Swagger (OpenAPI) | 2.6.0 |
| Maven | 3+ |

---

## 🔐 Authentication Flow

```
1️⃣ Register User
2️⃣ Login → Receive JWT Token
3️⃣ Send Token in Header
4️⃣ JwtFilter Validates Token
5️⃣ Access Protected Endpoints
```

Authorization Header Format:

```
Authorization: Bearer <your_token>
```

---

## 📂 Project Structure

```
src/main/java/com/bookstore/bookstore/

├── config/        → Security configuration
├── controller/    → REST controllers
├── dto/           → Data Transfer Objects
├── entity/        → JPA entities
├── exception/     → Global exception handling
├── repository/    → Database layer
├── security/      → JWT utilities & filter
├── service/       → Business logic
└── BookstoreApplication.java
```

---

## 📚 Features

### 🔐 Security
- JWT-based authentication
- Stateless session management
- BCrypt password encryption
- Protected endpoints

### 📖 Book Management
- ➕ Add Book  
- 📋 Get All Books  
- 🔎 Get Book by ID  
- ✏ Update Book  
- ❌ Delete Book  
- 🔍 Search by Title  
- 🔍 Search by Author  
- 🔍 Search by Genre  
- 🔃 Sorting Support  

### 🧩 Backend Design
- DTO Pattern
- Validation using `@Valid`
- Custom Exception Handling
- Layered Architecture

---

## 📌 API Endpoints

### 🔑 Authentication

| Method | Endpoint | Description |
|--------|----------|------------|
| POST | `/api/register` | Register new user |
| POST | `/api/login` | Login & receive JWT |

---

### 📚 Books

| Method | Endpoint |
|--------|----------|
| GET | `/api/books` |
| GET | `/api/books/{id}` |
| POST | `/api/books` |
| PUT | `/api/books/{id}` |
| DELETE | `/api/books/{id}` |
| GET | `/api/books/search/title` |
| GET | `/api/books/search/author` |
| GET | `/api/books/search/genre` |
| GET | `/api/books/sort` |

---

## 📖 Swagger Documentation

Access Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ⚙ Running Locally

### 1️⃣ Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/secure-bookstore-api.git
cd secure-bookstore-api
```

### 2️⃣ Build Project

```bash
mvn clean install
```

### 3️⃣ Run Application

```bash
mvn spring-boot:run
```

Server runs on:

```
http://localhost:8080
```

---

## 🗄 Database Configuration

### 🔹 H2 (Default - Development)

```
http://localhost:8080/h2-console
```

JDBC URL:
```
jdbc:h2:mem:testdb
```

---

### 🔹 MySQL (Production)

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

## 🧠 Key Concepts Demonstrated

- Spring Security Filter Chain
- JWT Token Generation & Validation
- Stateless Authentication
- DTO Separation
- Exception Handling Strategy
- REST API Best Practices
- Validation Framework

---

## 👨‍💻 Author

**Venkata Sai Kumar**  
Information Technology Student  
Backend Development Enthusiast  
