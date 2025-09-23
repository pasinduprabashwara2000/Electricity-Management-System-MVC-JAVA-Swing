CREATE DATABASE electricity;

USE electricity;

CREATE TABLE customer(
    customer_id VARCHAR(25) PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    customer_address VARCHAR(50) NOT NULL,
    customer_contact INT NOT NULL,
    customer_email VARCHAR(50) NOT NULL
);

CREATE TABLE meter(
    meter_id VARCHAR(25) PRIMARY KEY,
    meter_type VARCHAR(25) NOT NULL,
    date DATE NOT NULL,
    status_type VARCHAR(25) NOT NULL,
    location VARCHAR(25) NOT NULL,
    customer_id VARCHAR(25) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

CREATE TABLE employee(
    emp_id VARCHAR(25) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    contact_no INT NOT NULL
);

CREATE TABLE manage_meter(
    reading_id VARCHAR(25) PRIMARY KEY,
    meter_id VARCHAR(25) NOT NULL,
    reading_value INT NOT NULL,
    reading_date DATE NOT NULL,
    recorded_by VARCHAR(25) NOT NULL,
    FOREIGN KEY (meter_id) REFERENCES meter(meter_id),
    FOREIGN KEY (recorded_by) REFERENCES employee(emp_id)
);

CREATE TABLE tariff(
    id VARCHAR(25) PRIMARY KEY,
    name VARCHAR(25) NOT NULL,
    elective_from DATE NOT NULL,
    elective_to DATE NOT NULL,
    fixed_charge DOUBLE NOT NULL
);

CREATE TABLE tariff_slab(
    id VARCHAR(25) PRIMARY KEY,
    tariff_id VARCHAR(25) NOT NULL,
    from_unit INT,
    to_unit INT,
    rate_per_unit DOUBLE NOT NULL,
    FOREIGN KEY (tariff_id) REFERENCES tariff(id)
);

CREATE TABLE invoice(
    id VARCHAR(25) PRIMARY KEY,
    customer_id VARCHAR(25) NOT NULL,
    meter_id VARCHAR(25) NOT NULL,
    period_start DATE NOT NULL,
    period_end DATE NOT NULL,
    consumption_unit INT NOT NULL,
    total_amount DOUBLE NOT NULL,
    status VARCHAR(25) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (meter_id) REFERENCES meter(meter_id)
);

CREATE TABLE payment(
    id VARCHAR(25) PRIMARY KEY,
    invoice_id VARCHAR(25) NOT NULL,
    paid_amount Double NOT NULL,
    payment_date DATE NOT NULL,
    method VARCHAR(25) NOT NULL,
    FOREIGN KEY (invoice_id) REFERENCES invoice(id)
);

