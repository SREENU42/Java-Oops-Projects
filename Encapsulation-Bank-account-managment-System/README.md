# Bank Account Management System

## Description
This project demonstrates **Encapsulation** in Java. 
It simulates a simple bank account management system where account details are kept private and accessed or modified through getters and setters. 
The project also includes deposit and withdrawal operations with proper validation.

---

## Features
- Create bank accounts with account number, holder name, and balance.
- **Encapsulation**: Private fields with getters and setters.
- Deposit money (only positive amounts allowed).
- Withdraw money (cannot exceed current balance and must be positive).
- Update account holder name safely.
- Display account details.

---

## Validation
- **Balance cannot be negative** when creating an account.
- **Deposit amount** must be positive.
- **Withdrawal amount** must be positive and cannot exceed the available balance.

---

## Usage
1. Compile the Java program:
   ```bash
   javac BankAccountManagement.java
