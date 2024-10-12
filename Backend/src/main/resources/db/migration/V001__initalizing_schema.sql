-- CREATING TABLE RESTAURANT
CREATE TABLE restaurants (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(15),
    email VARCHAR(100),
    open_time TIME,
    close_time TIME,
    order_open_time TIME,
    order_close_time TIME,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- CREATING TABLE PRODUCT CATEGORIES
CREATE TABLE product_categories (
    product_id BIGINT NOT NULL,
    category VARCHAR(50) NOT NULL,
    PRIMARY KEY (product_id, category),
    FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE CASCADE
);

-- CREATING TABLE PRODUCT
CREATE TABLE products (
    product_id AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    description VARCHAR(500)
);
