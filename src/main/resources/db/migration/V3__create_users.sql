CREATE TABLE users (
    user_id BIGSERIAL PRIMARY KEY,
    user_name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    is_active BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    department_id BIGINT,

    CONSTRAINT fk_user_department
        FOREIGN KEY (department_id)
            REFERENCES department(department_id)
            ON DELETE SET NULL
);
