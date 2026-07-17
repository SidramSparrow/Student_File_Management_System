# Student File Management System

## Overview

The **Student File Management System** is a console-based Java application that performs CRUD (Create, Read, Update, Delete) operations on student records using text file storage. This project follows a layered architecture to separate business logic from data access, providing a clean and maintainable code structure.

Instead of using a database, student information is stored in a text file (`Student.txt`), making it an excellent project for understanding Java File Handling concepts.

## Features

* Add a new student
* View all student records
* Search a student by ID
* Update existing student details
* Delete a student record
* Persistent file-based data storage

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Collections Framework (`ArrayList`)
* File Handling (`FileReader`, `FileWriter`, `BufferedReader`)
* Exception Handling
* Git & GitHub

## Project Structure

```text
Student_File_Management_System
│
├── src
│   ├── Main.java
│   ├── Student.java
│   ├── StudentFileDAO.java
│   └── StudentService.java
│
├── Student.txt
└── README.md
```

## Architecture

The project follows a simple layered architecture:

* **Main** – Handles user interaction through a console menu.
* **StudentService** – Contains business logic and validations.
* **StudentFileDAO** – Performs file operations for storing and retrieving student data.
* **Student** – Represents the student entity.

## Concepts Implemented

* Object-Oriented Programming
* Constructors
* Encapsulation
* Collections Framework
* File Handling
* Exception Handling
* DAO (Data Access Object) Pattern
* Service Layer Design
* CRUD Operations

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or any Java IDE.
3. Compile and run `Main.java`.
4. Use the console menu to manage student records.

## Future Enhancements

* Input validation
* Logging support
* File encryption
* CSV/Excel export
* Database integration using JDBC
* Spring Boot REST API migration

## Author

**Sidram S B**

GitHub: https://github.com/SidramSparrow
