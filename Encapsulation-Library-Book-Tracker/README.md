# Library Book Tracker

## Description
This project demonstrates **Encapsulation** in Java and simulates a library book management system. 
It allows tracking book copies, borrowing, and returning books while keeping book details private and safe.

---

## Features
- Create book records with title, author, and number of copies.
- **Encapsulation**: Private fields with getters and setters.
- Borrow books (decreases available copies if copies are available).
- Return books (increases available copies).
- Validate number of copies (cannot be negative).
- Display book details.

---

## Validation
- **Copies Available** cannot be negative.
- Borrowing a book is only allowed if copies are available.

---

## Usage
1. Compile the Java program:
   ```bash
   javac LibraryBookTracker.java
