CREATE TABLE enterprise (
    company_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    document VARCHAR(255) UNIQUE,
    contract_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);
