🍕 DeliveryApp
🚀 Spring Boot & Angular-based Food Delivery System

📝 Project Description

DeliveryApp is an online food ordering application, with the backend built in Java Spring Boot and the frontend in Angular. The project manages restaurants, products, and food categories, and allows filtering of products based on characteristics such as "Gluten Free" or "Lactose Free".

🌟 Features

    CRUD for products: Add, remove, edit, and display restaurant menu products.
    Restaurant management: Each product is assigned to a specific restaurant.
    Product filtering: Ability to filter products based on categories (e.g., Vegan, Gluten Free).
    Many-to-One relationship support: Relationship between restaurants and products.

💻 Technology Stack

    Backend: Spring Boot (REST API, Hibernate, Flyway)
    Database: PostgreSQL (version 15.x)
    Frontend: Angular 16
    Database migrations: Flyway

📂 Backend (Spring Boot)

    JPA for managing entities (Product, Restaurant).
    Flyway for database migrations (table creation, schema updates).

📂 Frontend (Angular)

    Angular components for displaying restaurants, products, and filters.
    Handling HTTP requests to the backend API.

⚙️ System Requirements

    Java 17+
    Maven 3+
    PostgreSQL 15.x
    Node.js + npm (for the frontend)
    Angular CLI (optional, for managing the frontend project)

🛠️ Installation
Backend

    Clone the repository:

    bash

git clone https://github.com/YourUsername/DeliveryApp.git

Navigate to the backend folder and build the project:

bash

cd Backend
mvn clean install

Run the application:

bash

    mvn spring-boot:run

Frontend

    Navigate to the frontend folder:

    bash

cd Frontend

Install dependencies:

bash

npm install

Run the application:

bash

    ng serve

🔧 Configuration

Configure the database connection in the application.properties file:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

🧪 Testing

To run unit tests for the backend:

bash

mvn test

📚 API Request Example
Adding a product (POST /api/products)

json

{
  "name": "Pizza Margherita",
  "description": "Delicious pizza with mozzarella and tomatoes",
  "price": 29.99,
  "restaurantId": 1,
  "categories": ["VEGETARIAN", "GLUTEN_FREE"]
}
