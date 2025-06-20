# HirePath
This platform is a robust and scalable web solution for end-to-end recruitment process management, developed with Spring Boot and structured following a layered architecture.
Its primary goal is to effectively connect companies seeking talent with users looking for job opportunities.

Organizations can post job openings, manage candidate applications, and administer their company profiles. Job seekers can explore open positions and apply directly through the platform. Additionally, it includes a powerful administrative panel that allows system administrators to manage categories, users, companies, and other administrators with secure, role-based access.

The platform is built applying modern best practices from the Spring ecosystem, ensuring clean, secure, and production-ready development.

## Features
- Comprehensive User Management: Streamlined registration and authentication workflows for Candidates, Companies, and Administrators with secure, granular role-based access control.

- Candidate Portal: Full profile management, job application submission, tracking, and the ability to withdraw applications.

- Company Portal: Efficient end-to-end job vacancy management, including posting, editing, and reviewing candidate applications.

- Advanced Admin Dashboard: Robust tools for detailed management of categories, users, companies, and administrative roles, ensuring system governance and security.

Engineered to deliver scalable, maintainable, and secure recruitment workflows aligned with enterprise development best practices.

## Technologies
- Maven or Gradle: Build tools used for dependency management, compilation, and packaging.

- IntelliJ IDEA, Visual Studio Code, or Spring Tool Suite: Recommended IDEs for efficient Spring Boot development, offering features like code completion, debugging, and integration with version control systems.

- Java 21: The latest LTS version of Java, offering improved performance, security, and modern language features.

- Spring Boot 3.5: A streamlined framework for building production-ready Java applications with minimal configuration, reducing boilerplate code and enhancing developer productivity.

- Spring Data JPA: Simplifies database interaction and implements JPA-based repositories for efficient data persistence.

- Hibernate ORM: Provides object-relational mapping, automating the mapping of Java objects to database tables, and optimizing database interactions.

- Spring Security: Manages authentication and authorization, offering robust protection against common security threats like CSRF and session hijacking.

- Lombok: Reduces boilerplate code by generating getters, setters, constructors, and other methods automatically, improving code maintainability.

- Spring Web: Core library for building REST APIs and web applications, handling HTTP requests and responses with ease.

- Spring Validation: Ensures data integrity by validating user inputs and application data, integrated seamlessly with Spring Boot.

- OpenAPI & Swagger: For documenting and testing RESTful APIs. Swagger is integrated with OpenAPI specifications, providing a user-friendly interface for exploring API endpoints and ensuring compliance with industry standards for API design and documentation.

- PostgreSQL 16: A powerful, open-source RDBMS known for scalability and support for advanced features like JSONB and full-text search.

## Project Structure
```bash
├── src
│   ├── main
│   │    ├── java                   # Contains the main Java source code (controllers, services, repositories, etc.)
│   │    │    └── com
│   │    │         └── nexora
│   │    │              └── hirepath
│   │    │                   ├── controller     # Handles HTTP requests and response management
│   │    │                   ├── dto            # Data Transfer Objects for API communication
│   │    │                   ├── exception      # Custom exceptions for error handling
│   │    │                   ├── mapper         # Object-to-object mapping logic
│   │    │                   ├── model          # Core data model classes
│   │    │                   ├── repository     # Data access layer interacting with the database
│   │    │                   ├── security       # Security-related classes (authentication & authorization)
│   │    │                   ├── service        # Business logic layer
│   │    │                   └── HirepathApplication.java   # Main entry point to the Spring Boot application
│   │    ├── resources              # Contains configuration and static resources
│   │    │    ├── application.properties  # Application configuration (database, logging, etc.)
│   │    │    ├── static            # Static files (e.g., images, CSS)
│   │    │    ├── templates         # Templates for the UI (if using Thymeleaf or similar)
│   └── test                        # Placeholder for unit and integration tests (currently empty)
├── README.md                       # Project documentation and setup instructions
├── pom.xml                         # Maven configuration file, handling dependencies, plugins, and build settings
└── target                          # Generated artifacts (e.g., .jar or .war files) after Maven build
```

## Prerequisites
Before setting up the Hirepath project, ensure the following software is installed and properly configured:

- JDK: Minimum JDK 17 (Recommended: JDK 20 or later)

- Build Tool: Maven or Gradle (Choose the build system you're most comfortable with)

- Database: PostgreSQL 16 or MySQL 8.0+ (or any compatible relational database)

- Docker (Optional): For containerizing the application.

- IDE: Visual Studio Code, Spring Tool Suite (latest version), or IntelliJ IDEA (with necessary plugins for Java, Spring Boot, Maven/Gradle, Lombok)

## Installation
To set up and run the Hirepath project locally, follow these steps:

1. Clone the repository:
```bash
git clone https://github.com/your-username/hirepath.git
cd hirepath
```

2. Build the project:

Using Maven:
```bash
mvn clean install
```

Or using Gradle (if you're using Gradle):
```bash
gradle build
```

3. Configure the database:

- Ensure your PostgreSQL or MySQL database is running and accessible.

- Update the database connection settings in the src/main/resources/application.properties or application.yml file with your database credentials.

4. Run the application:

Using Maven:
```bash
mvn spring-boot:run
```

Alternatively, run the application from your IDE by executing the HirepathApplication.java class.

## Security
The application leverages Spring Security with JWT for stateless, secure authentication and fine-grained role-based access control:

- Supports login for Administrators, Candidates, and Companies

- Enforces access via roles: ROLE_ADMIN, ROLE_CANDIDATE, and ROLE_COMPANY

- Implements JWT-based authentication for scalable session management

- Uses BCrypt to securely hash passwords

- Applies custom security filters with centralized exception handling

- Protects API endpoints according to user roles

## API Documentation
The project includes OpenAPI and Swagger UI for clear and interactive API documentation:

- Browse and test all endpoints through a web interface

- View request/response schemas, parameters, and status codes

- Facilitates collaboration between frontend and backend teams

- Ensures consistency and transparency across the API surface

Once the application is running, access the documentation at:
```bash
http://localhost:8080/swagger-ui.html
```

> The documentation is auto-generated from annotations in your controller and model classes.

## Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)

- [Java 21 Documentation](https://docs.oracle.com/en/java/javase/21/)

- [PostgreSQL 16 Documentation](https://www.postgresql.org/docs/16/)

- [Spring Security Documentation](https://spring.io/projects/spring-security)

- [Hibernate Documentation](https://hibernate.org/orm/documentation/)

- [Lombok Documentation](https://projectlombok.org/)

- [OpenAPI Specification Documentation](https://swagger.io/specification/)

## License
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
