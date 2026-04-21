CREATE TABLE products (
    id BIGSERIAL PRIMARY KEY,
    product_sku VARCHAR(255) UNIQUE,
    title VARCHAR(255),
    description TEXT,
    ncm VARCHAR(50),
    stock_on INTEGER,
    warranty_time VARCHAR(100),
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);
