# Java-Employee-Management-System
A Java-based Employee Management System demonstrating Object-Oriented Programming concepts including Abstraction, Interfaces, Inheritance, Polymorphism and ArrayLists.The application allows organizations to manage employees, calculate salaries, generate payroll reports and identify top-performing employees.

---

## Project Overview

SecureStaff Employee Management System was developed to demonstrate the practical implementation of Java OOP concepts including:

- Abstraction
- Interfaces
- Inheritance
- Polymorphism
- Encapsulation
- Collections (ArrayList)

The system provides a menu-driven interface where users can manage different employee types and perform payroll-related operations.

---

## Features

### Employee Management
- Add Managers
- Add Developers
- Add Cyber Security Analysts
- View all employees
- Search employees by ID

### Payroll Management
- Calculate employee salaries
- Calculate total company payroll
- Salary grade classification (A, B, C)

### Performance Tracking
- Employee of the Month feature
- Automatic identification of highest-paid employee

### User Interface
- Interactive menu-driven console application
- Professional company branding
- Easy-to-use navigation

---

## System Architecture

### Abstract Class

```java
abstract class Employee
```

The Employee class serves as the blueprint for all employee types and contains:

- Employee Name
- Employee ID
- Abstract method: `displayInfo()`

---

### Interface

```java
interface Payable
```

The Payable interface defines:

```java
calculateSalary()
```

All employee types implement this interface to calculate their salaries.

---

### Inheritance Structure

```text
                Employee
             (Abstract Class)
                   │
        ┌──────────┼──────────┐
        │          │          │
     Manager   Developer   CyberSecurityAnalyst
        │          │          │
        └──────────┼──────────┘
                   │
               Payable
             (Interface)
```

---

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList Collection Framework
- Scanner Class
- Console-Based User Interface

---

## Menu Options

```text
====================================
 SECURESTAFF EMPLOYEE SYSTEM
 Powered by Leigh Tech Consulting
====================================

1. Add Manager
2. Add Developer
3. Add Cyber Security Analyst
4. View All Employees
5. Calculate Total Payroll
6. Search Employee by ID
7. Show Employee of the Month
8. Exit
```

---

## OOP Concepts Demonstrated

| Concept | Implementation |
|----------|---------------|
| Abstraction | Employee Abstract Class |
| Inheritance | Manager, Developer, CyberSecurityAnalyst |
| Interface | Payable |
| Polymorphism | Employee references storing different employee types |
| Encapsulation | Protected and private variables |
| Collections | ArrayList<Employee> |
| Method Overriding | displayInfo() and calculateSalary() |

---

## Example Output

```text
===== DEVELOPER DETAILS =====

Name: John Smith
ID: D001
Programming Language: Java
Salary: R33000
Grade: B
```

---

## Employee Types

### Manager
Attributes:
- Name
- ID
- Department
- Basic Salary
- Bonus

Salary Formula:

```text
Salary = Basic Salary + Bonus
```

---

### Developer
Attributes:
- Name
- ID
- Programming Language
- Basic Salary
- Project Allowance

Salary Formula:

```text
Salary = Basic Salary + Project Allowance
```

---

### Cyber Security Analyst
Attributes:
- Name
- ID
- Security Clearance
- Basic Salary
- Risk Allowance

Salary Formula:

```text
Salary = Basic Salary + Risk Allowance
```

---

## Unique Features

Unlike a standard Employee Management System, SecureStaff includes:

✅ Cyber Security Analyst employee role

✅ Employee of the Month recognition

✅ Salary grading system

✅ Payroll calculations

✅ Employee search functionality

✅ Professional business branding

These enhancements make the project more realistic and demonstrate advanced Java programming concepts.

---

## Learning Outcomes

Through this project, the following skills were demonstrated:

- Designing class hierarchies
- Implementing interfaces
- Using abstract classes
- Applying polymorphism
- Managing collections with ArrayList
- Building menu-driven applications
- Creating reusable and maintainable code

---

## Future Improvements

Potential future enhancements include:

- File storage for employee records
- Database integration
- Graphical User Interface (GUI)
- Employee performance evaluation
- Leave management module
- User authentication and login
- Export payroll reports to PDF

---

## Author

### Lebohang Motloung

Bachelor of Information Technology in Business Systems

Cybersecurity | Software Development | Business Systems

GitHub: https://github.com/motlounglerato7-stack

---

## Project Purpose

This project was developed for academic purposes to demonstrate Java Object-Oriented Programming concepts while building a practical employee management solution.
