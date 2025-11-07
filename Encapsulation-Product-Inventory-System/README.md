# Product Inventory System

## Description
This project demonstrates **Encapsulation** in Java and simulates a simple e-commerce product inventory management system. 
It tracks product details like ID, name, price, and quantity, and allows operations like purchasing and restocking while keeping fields private.

---

## Features
- Create product records with ID, name, price, and quantity.
- **Encapsulation**: Private fields with getters and setters.
- Validate **price** (must be > 0) and **quantity** (cannot be negative).
- Purchase products (reduces available quantity, cannot go below 0).
- Restock products (increases available quantity).
- Display product details.

---

## Validation
- Price must be positive.
- Quantity cannot be negative.
- Purchase quantity cannot exceed current stock.
- Restock quantity must be positive.

---

## Usage
1. Compile the Java program:
   ```bash
   javac ProductInventorySystem.java
