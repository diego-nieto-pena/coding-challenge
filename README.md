# API Design Coding Challenge

## Project Overview

Welcome to the API Design coding challenge! This project is a partially completed Spring Boot application for a simple e-commerce backend. We have already set up the following components:

- **Domain Models:** `Product` and `Order` JPA entities.
- **Repositories:** Spring Data JPA repositories (`ProductRepository`, `OrderRepository`).
- **Build System:** A working Gradle setup (`build.gradle.kts`).
- **Containerization:** A `docker-compose.yml` file to run the application and a PostgreSQL database.

The core business logic (`Service` layer) and the API exposure (`Controller` layer) are intentionally missing.

---

## Your Goal

Your task is to design and implement a clean, consistent, and RESTful HTTP API for managing products and orders. You will need to create the `Service` and `Controller` layers to make the application functional.

---

## Getting Started

### Prerequisites
- Docker
- JDK 17
- An IDE

### Running the Application
1.  **Build the Application:**
    The project is configured to build automatically when you run `docker-compose`.

2.  **Run with Docker Compose:**
    From the project root, run the following command. This will build the application, create a Docker image, and start the application and database containers.

    ```bash
    docker-compose up --build
    ```

    The application will be available at `http://localhost:8080`.

---

## Tasks

Your primary focus should be on the design of the API endpoints, the structure of the request/response payloads, and the correct use of HTTP verbs and status codes.

### Task 1: Implement the Product API (CRUD)

Create the necessary `Service` and `Controller` classes to expose a full CRUD (Create, Read, Update, Delete) API for `Product` entities.

**Requirements:**
1.  **Create a `ProductService`:** This service will handle the business logic for interacting with the `ProductRepository`.
2.  **Create a `ProductController`:** This controller will expose the following RESTful endpoints:
    - `POST /products`: Creates a new product.
    - `GET /products`: Retrieves a list of all products.
    - `GET /products/{id}`: Retrieves a single product by its ID.
    - `PUT /products/{id}`: Updates an existing product's details.
    - `DELETE /products/{id}`: Deletes a product by its ID.

3.  **Use Data Transfer Objects (DTOs):**
    - Do **not** expose the JPA entities (`Product`) directly in the API.
    - Create DTOs (e.g., `ProductRequest`, `ProductResponse`) for handling request and response payloads. This is crucial for decoupling your API from your internal data model.

4.  **Use Correct HTTP Status Codes:**
    - `201 Created` for successful creation.
    - `200 OK` for successful retrievals and updates.
    - `204 No Content` for successful deletion.
    - `404 Not Found` if a product with a given ID does not exist.

### Task 2: Implement the Order API

Create the `Service` and `Controller` to manage `Order` entities.

**Requirements:**
1.  **Create an `OrderService`:** This service will handle the logic for creating and retrieving orders.
2.  **Create an `OrderController`:** This controller will expose the following endpoints:
    - `POST /orders`: Creates a new order. The request body should specify which products are being ordered. Think about what a clean request payload for this would look like (e.g., a list of product IDs and quantities).
    - `GET /orders/{id}`: Retrieves an existing order, including details of the products it contains.

3.  **Handle Relationships:**
    - When creating an order, the `OrderService` should look up the `Product` entities based on the IDs provided in the request.
    - If a requested product ID does not exist, the API should return an appropriate error response (e.g., `400 Bad Request`).

---

## Evaluation Criteria

We will be evaluating your submission based on the following criteria:

- **API Design:** Is the API RESTful, intuitive, and consistent? Is the choice of endpoints, HTTP verbs, and status codes appropriate?
- **Code Quality:** Is the code clean, well-structured, and easy to understand? Does it follow standard Kotlin and Spring Boot conventions?
- **Data Modeling:** Have you used DTOs effectively to create a clear separation between the API and the domain model?
- **Error Handling:** How gracefully does the API handle invalid input or edge cases (e.g., requesting a non-existent resource)?
- **Correctness:** Does the implementation work as expected?

---

## Bonus Tasks (Optional)

If you have extra time, consider tackling one of the following:

1.  **Input Validation:** Add validation to your request DTOs using `jakarta.validation` annotations (e.g., `@NotBlank`, `@Positive`).
2.  **Pagination:** Implement pagination for the `GET /products` endpoint to handle large numbers of products efficiently.
3.  **Testing:** Write unit or integration tests for one of your controllers to demonstrate your testing skills.

---

## Submission

Please commit all your changes to the repository. Once you are finished, let the interviewer know. Good luck!
