# School Management System

## Introduction

Welcome to the School Management System project! This Java-based system is designed to help manage the day-to-day operations of a school, including keeping track of teachers, students, their fees, and teacher salaries. It serves as an educational tool to demonstrate fundamental object-oriented programming concepts in practice.

## Classes

### 1. School

The `School` class acts as the central hub for the management of teachers, students, and financial transactions within the school. It offers the following features:

- **Teacher Management:** The system enables you to add teachers to the school's roster and keep track of their details.

- **Student Management:** Students can be added to the school, complete with their grade, fees paid, and total fees.

- **Financial Tracking:** The `School` class maintains a record of the total money earned from student fees and the total money spent on teacher salaries.

### 2. Teacher

The `Teacher` class represents the faculty members of the school and includes the following features:

- **Teacher Details:** Each teacher is associated with a unique ID, a name, and a base salary.

- **Salary Management:** The class provides a method to update a teacher's salary and track the salary earned.

- **Financial Interaction:** When teachers receive their salaries, the system automatically updates the total money spent by the school.

### 3. Student

The `Student` class embodies the student body within the school and includes the following features:

- **Student Information:** Each student is identified by a unique ID, has a name, belongs to a specific grade, and has details about their fees paid and total fees.

- **Fee Payment:** Students can make payments toward their fees, and the system will update the fees paid and the total money earned by the school.

## Getting Started

To get started with the School Management System:

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile and run the `Main` class to interact with the system.

## Usage

1. When you run the program, you will be prompted to input details for teachers and students.
2. After entering the teacher and student details, you can input fees payment for specific students and salary payments for teachers.
3. The program calculates and displays the total money earned from fees and the total money spent on salaries.

## Contributing

Contributions to this project are highly encouraged! If you encounter any issues, have ideas for improvements, or want to extend the functionality, please consider opening an issue or submitting a pull request.
