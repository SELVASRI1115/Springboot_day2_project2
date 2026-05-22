# School Management System

A console-based Java Maven project developed using Object-Oriented Programming concepts to manage teaching and non-teaching staff in a school.

---

## 🎯 Objective

This project demonstrates:

* Abstract Classes
* Inheritance
* Encapsulation
* Polymorphism
* Method Overriding
* Service Layer Design

---

## 🛠️ Features

* Add different staff members
* Calculate salary dynamically
* Display staff details
* Calculate total salary payout
* Organized project structure

---

## 🧱 Technologies Used

* Java 17
* Maven
* Git
* GitHub
* VS Code

---

## 📂 Project Structure

```text id="k4v8wr"
day3project2
│
├── src
│   └── main
│       └── java
│           └── com
│               └── day3project2
│
│                   ├── model
│                   │   ├── Staff.java
│                   │   ├── Teacher.java
│                   │   ├── Principal.java
│                   │   ├── AdminStaff.java
│                   │   └── Intern.java
│                   │
│                   ├── service
│                   │   └── StaffService.java
│                   │
│                   └── App.java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## 👨‍🏫 Staff Types

### Teacher

* Subject handling
* Base salary
* Incentive

### Principal

* Inherits from Teacher
* Additional allowance

### AdminStaff

* Base salary
* Overtime salary calculation

### Intern

* Fixed stipend
* Zero tax

---

## ⚙️ OOP Concepts Used

### Abstract Class

`Staff` is used as the base abstract class.

### Inheritance

* `Teacher` extends `Staff`
* `Principal` extends `Teacher`
* `AdminStaff` extends `Staff`
* `Intern` extends `Staff`

### Encapsulation

Private variables are accessed using getters and setters.

### Polymorphism

Different staff objects are handled using `Staff` references.

### Method Overriding

Each class overrides:

* `calculateSalary()`
* `displayDetails()`

---

## 🧾 Service Layer

### StaffService

Functions:

* Add staff
* Display all staff
* Calculate total salary payout

---

## ▶️ How to Run

### Compile Project

```bash id="p9q3lt"
mvn clean compile
```

### Run Project

```bash id="r5n1vk"
mvn exec:java
```

---

## 🖥️ Sample Output

```text id="u2m7xs"
===== Teacher Details =====
Name      : Selvasri
Salary    : 55000.0

===== Principal Details =====
Name      : Arun
Salary    : 105000.0

===== Total Salary Payout =====
200000.0
```

---

## 🎁 Future Enhancements

* Add Scanner input
* Store data in database
* Add file handling
* Convert into Spring Boot REST API

---

## 👨‍💻 Author

Selvasri
