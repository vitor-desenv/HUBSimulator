CREATE TABLE department (
    department_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    active BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    enterprise_id BIGINT,

    CONSTRAINT fk_department_enterprise
        FOREIGN KEY (enterprise_id)
            REFERENCES enterprise(company_id)
            ON DELETE CASCADE
);
