🍕 DeliveryApp
🚀 Spring Boot & Angular-based Food Delivery System

📝 Opis projektu

DeliveryApp to aplikacja do zamawiania jedzenia online, której backend jest zbudowany w Java Spring Boot, a frontend w Angular. Projekt zarządza restauracjami, produktami oraz kategoriami żywności, a także umożliwia filtrowanie produktów na podstawie takich cech jak "Gluten Free" czy "Lactose Free".
🌟 Funkcjonalności

    CRUD dla produktów: Dodawanie, usuwanie, edytowanie oraz wyświetlanie produktów z menu restauracji.
    Zarządzanie restauracjami: Każdy produkt jest przypisany do konkretnej restauracji.
    Filtrowanie produktów: Możliwość filtrowania produktów na podstawie kategorii (np. Vegan, Gluten Free).
    Obsługa relacji Many-to-One: Relacja między restauracjami a produktami.

💻 Technologia

    Backend: Spring Boot (REST API, Hibernate, Flyway)
    Baza danych: PostgreSQL (wersja 15.x)
    Frontend: Angular 16
    Migracje bazy danych: Flyway

📦 Struktura projektu

css

DeliveryApp/
├── Backend/
│   ├── src/
│   └── pom.xml
├── Frontend/
│   └── src/
└── README.md

📂 Backend (Spring Boot)

    JPA do zarządzania encjami (Product, Restaurant).
    Flyway do migracji bazy danych (tworzenie tabel, aktualizacje schematów).

📂 Frontend (Angular)

    Komponenty Angular do wyświetlania restauracji, produktów oraz filtrów.
    Obsługa zapytań HTTP do API backendu.

⚙️ Wymagania systemowe

    Java 17+
    Maven 3+
    PostgreSQL 15.x
    Node.js + npm (do frontendu)
    Angular CLI (opcjonalnie, do zarządzania projektem frontendowym)

🛠️ Instalacja
Backend

    Sklonuj repozytorium:

    bash

git clone https://github.com/TwojNazwaUzytkownika/DeliveryApp.git

Przejdź do folderu backendu i zbuduj projekt:

bash

cd Backend
mvn clean install

Uruchom aplikację:

bash

    mvn spring-boot:run

Frontend

    Przejdź do folderu frontendu:

    bash

cd Frontend

Zainstaluj zależności:

bash

npm install

Uruchom aplikację:

bash

    ng serve

🔧 Konfiguracja

Skonfiguruj połączenie z bazą danych w pliku application.properties:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

🧪 Testy

Aby uruchomić testy jednostkowe dla backendu:

bash

mvn test

📚 Przykład zapytania do API
Dodawanie produktu (POST /api/products)

json

{
  "name": "Pizza Margherita",
  "description": "Delicious pizza with mozzarella and tomatoes",
  "price": 29.99,
  "restaurantId": 1,
  "categories": ["VEGETARIAN", "GLUTEN_FREE"]
}
