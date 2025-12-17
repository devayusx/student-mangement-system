# Student Management System

A Java console application for managing student records with MySQL database.

## Features
- Add new students
- View all students  
- MySQL database connectivity
- Console-based interface

## Technologies
- Java
- MySQL
- JDBC
- XAMPP

## Setup
1. Install Java and XAMPP
2. Create database: `studentdb`
3. Create table: `students`
4. Download MySQL Connector/J 8.0.33
5. Compile: `javac -cp "mysql-connector-j-8.0.33.jar" *.java`
6. Run: `java -cp "mysql-connector-j-8.0.33.jar;." MainApp`

## Files
- `DBConnection.java` - Database connection
- `MainApp.java` - Main application
- `Student.java` - Student model class
- `StudentDAO.java` - Database operations

---
Project by Ayush Singh | BCA Student
