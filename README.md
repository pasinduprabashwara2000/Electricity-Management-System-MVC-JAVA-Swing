# ⚡ Electricity Billing System

An **Electricity Billing Management System** that automates the process of managing customer information, meter readings, billing, tariffs, and payments. This project aims to simplify the workflow of utility companies by providing a structured data model and logical use cases for efficient operation.

---

## 🧩 ER Diagram Overview

The ER diagram represents the core entities and their relationships within the system:

* **Customer** → Owns one or more electricity meters.
* **Meter** → Records power consumption data and is linked to a customer.
* **Meter Reading** → Captures periodic consumption readings by employees.
* **Employee** → Responsible for recording readings and maintaining records.
* **Tariff** → Defines billing rules and charges with slabs.
* **Tariff Slab** → Contains per-unit rate details for defined usage ranges.
* **Invoice** → Summarizes consumption, total amount, and billing periods.
* **Payment** → Records payments made by customers for invoices.

### 🏗️ Key Relationships

* A **Customer** has **one or more Meters**.
* A **Meter** has **many Meter Readings**.
* Each **Reading** is recorded by an **Employee**.
* Each **Invoice** is linked to a **Meter** and a **Customer**.
* Each **Invoice** may have one or more **Payments**.
* Each **Tariff** has multiple **Tariff Slabs** that define pricing tiers.

---

## 📋 Use Case Diagram Summary

**Actors:**

* 🧑‍💼 **Admin** – Manage employees, tariffs, and customer data.
* 👨‍🔧 **Employee** – Record meter readings.
* 🧍‍♂️ **Customer** – View bills and make payments.

**Main Use Cases:**

1. **Add / Manage Customer** – Register and update customer information.
2. **Assign Meter** – Link a new meter to a customer.
3. **Record Meter Reading** – Employees input the latest readings.
4. **Generate Invoice** – System calculates charges based on readings and tariffs.
5. **Process Payment** – Customers pay invoices.
6. **Manage Tariffs** – Admin sets or updates rate structures.
7. **View Reports** – Admin reviews summaries of usage and revenue.

---

## 🧠 System Logic Summary

| Entity            | Description                                            |
| ----------------- | ------------------------------------------------------ |
| **Customer**      | Stores name, address, contact, and email info.         |
| **Meter**         | Tracks consumption data linked to customers.           |
| **Meter Reading** | Captures reading date, value, and associated employee. |
| **Employee**      | System user responsible for field operations.          |
| **Tariff**        | Base charges and validity period.                      |
| **Tariff Slab**   | Defines price per unit for consumption ranges.         |
| **Invoice**       | Stores billing summary, consumption, and total.        |
| **Payment**       | Records customer payments and method.                  |


## 🛠️ Technologies

* **Database:** MySQL
* **Backend:** Java
* **Frontend:** JavaFX
* **Modeling:** Draw.io
