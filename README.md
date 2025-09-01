# spring_boot
My journey to becoming a spring boot backend developer. For the sake of micro services and high level banking applications.

---

# From Node.js to Spring Boot: A Full-Stack Developer's Journey

## 🚀 About This Repository

This repository documents my journey of learning Java and the Spring Boot framework, guided by the mentorship of a senior developer. As a full-stack developer with 3+ years of experience in the Node.js ecosystem (React, NestJS, Express), my goal is to add a powerful, enterprise-grade toolset to my backend arsenal.

This is a living document and a collection of all the projects and code written during this learning process. It follows a structured, project-based roadmap, culminating in a full-stack virtual credit card application.

*   **The Mentee:** A Full-Stack Developer proficient in JavaScript/TypeScript.
*   **The Mentor:** A Senior Full-Stack Developer with 10+ years of experience, including 7+ years with Spring Boot.

---

## 🛠️ Tech Stack

This journey will cover the following technologies:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![React Native](https://img.shields.io/badge/react_native-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB)
![Postgres](https://img.shields.io/badge/postgresql-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)

---

## 🗺️ The Roadmap

This roadmap is divided into distinct phases, each with clear objectives and practical projects.

### Phase 0: The Foundation - Core Java (Weeks 1-2)
*   [ ] **Week 1:** Java Syntax & OOP Fundamentals
*   [ ] **Week 2:** Essential APIs (Collections, Streams, Lambdas) & Tooling (Maven)
*   **Project:** `bank-account-cli` (A simple command-line banking application).

### Phase 1: Entering the Spring Ecosystem (Weeks 3-4)
*   [ ] **Week 3:** Inversion of Control (IoC) & Dependency Injection (DI)
*   [ ] **Week 4:** Understanding Spring MVC
*   **Project 1:** `di-message-service` (A non-web app demonstrating pure Spring DI).
*   **Project 2:** `manual-spring-mvc` (A minimal web app to appreciate Spring Boot's magic).

### Phase 2: Spring Boot - Rapid Application Development (Weeks 5-8)
*   [ ] **Weeks 5-6:** Building a REST API with Spring Boot & Spring Data JPA (with H2)
*   [ ] **Weeks 7-8:** Securing the API with Spring Security (JWT) & Connecting to PostgreSQL
*   **Project:** `todo-api` (A full CRUD REST API for a To-Do list application with user authentication).

### Phase 3: Polishing the Arsenal - Advanced Concepts (Weeks 9-11)
*   [ ] **Week 9:** Advanced JPA (Relationships) & Transactions (`@Transactional`)
*   [ ] **Week 10:** Unit & Integration Testing (JUnit 5, Mockito, MockMvc)
*   [ ] **Week 11:** Production Topics (Profiles, DTO Mapping, Caching, Dockerizing)
*   **Project:** Evolve and refactor the `todo-api` with advanced features and tests.

### Phase 4: The Capstone - Full-Stack Application (Weeks 12-16)
*   [ ] **Weeks 12-14:** Backend Development for the Credit Card App
*   [ ] **Weeks 15-16:** Frontend (React Native) & Full-Stack Integration
*   **Project:** `virtual-credit-card-app` (A complete full-stack application simulating a virtual credit card service).

---

## 📁 Project Structure

This repository is organized into folders, with each folder representing a distinct project from the roadmap. This structure will be updated as we progress.

```
/
├── 00-java-fundamentals/
│   └── bank-account-cli/
│       ├── src/
│       └── pom.xml
│
├── 01-spring-core/
│   └── di-message-service/
│       ├── src/
│       └── pom.xml
│
├── 02-spring-boot-basics/
│   └── todo-api/
│       ├── src/
│       └── pom.xml
│
├── 03-full-stack-capstone/
│   ├── backend-credit-card-api/
│   │   ├── src/
│   │   └── pom.xml
│   ├── frontend-credit-card-app/
│   │   ├── src/
│   │   └── package.json
│
└── README.md
```

---

## 🏃 Getting Started

### Prerequisites

*   **Java JDK 17** (or newer, we will use 17 as it's the latest LTS version)
*   **Apache Maven**
*   **PostgreSQL** Database Server
*   An IDE like **IntelliJ IDEA Community Edition** (highly recommended)

### Running a Project

Each backend project is a standard Maven project. To run any of them:

1.  Navigate to the specific project's root directory:
    ```bash
    cd <project-folder>/<project-name>
    # Example: cd 02-spring-boot-basics/todo-api
    ```
2.  Run the application using the Spring Boot Maven plugin:
    ```bash
    mvn spring-boot:run
    ```
3.  The application will start on the configured port (usually `8080`).

> **Note:** Each project folder may contain its own `README.md` with more specific instructions for setup and API endpoints.

---

## 📝 Learning Journal

This section will be my personal log to jot down key takeaways, challenges, and "aha!" moments during each phase.

### Phase 0: Key Learnings
*   *(...Your thoughts here on static vs. dynamic typing, the JVM, Maven vs. npm, etc...)*

### Phase 1: Key Learnings
*   *(...Your thoughts here on Dependency Injection, comparing it to NestJS, etc...)*

### Phase 2: Key Learnings
*   *(...Your thoughts here on Spring Boot's auto-configuration, the power of Spring Data JPA, etc...)*

### Phase 3: Key Learnings
*   *(...Your thoughts here on transactional integrity, the testing pyramid in a Spring context, etc...)*

### Phase 4: Key Learnings
*   *(...Your thoughts here on integrating a Java backend with a mobile frontend, challenges faced, etc...)*