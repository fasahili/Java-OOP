
# University Enrollment System

## Overview

The University Enrollment System is a Java program designed to simulate a basic university enrollment system. It allows students to enroll in courses offered by the university and provides various functionalities for managing students, courses, and generating reports.

## Table of Contents

- [Features](#features)
- [Classes](#classes)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Getting Started](#getting-started)
- [Examples](#examples)
- [Contributors](#contributors)

## Features

- Add students to the university.
- Drop students from the university.
- Add courses to the university.
- Drop courses from the university.
- Enroll students in courses.
- Drop students from courses.
- Generate reports:
  - List of available courses.
  - Courses enrolled by a specific student.
  - Students enrolled in a specific course.
  - General report combining the above information.

## Classes

### `Main`

The `Main` class serves as the entry point of the program. It contains the `main` method for testing the university enrollment system.

### `University`

The `University` class manages students and courses within the system. It provides methods for adding students and courses, enrolling students in courses, and more.

### `Report`

The `Report` class contains methods for generating various reports, such as a list of available courses, courses enrolled by a student, students enrolled in a course, and a general report.

### `Course`

The `Course` class represents a course offered by the university. It includes information such as the course code, title, instructor, and maximum capacity. Students can enroll in courses, and the class keeps track of enrolled students.

### `Student`

The `Student` class represents a student with attributes like ID, name, email, and a list of enrolled courses. Students can enroll in and drop courses.

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- An Integrated Development Environment (IDE) like Eclipse or IntelliJ IDEA (optional).

## Installation

- Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/student-enrollment-system.git
   ```


## Getting Started

To get started, create an instance of the `University` class and use its methods to manage students, courses, and generate reports. See the "Examples" section below for sample usages.

## Examples

Here are some example usages of the program:

```java
University myUniversity = new University();

// Adding students to the university
myUniversity.addStudent(121100, "John Doe", "john.doe@example.com");
myUniversity.addStudent(121111, "Jane Smith", "jane.smith@example.com");

// Adding courses to the university
myUniversity.addCourse(1212323, "Computer Science Fundamentals", "Professor Johnson", 2);
myUniversity.addCourse(1212144, "Web Development Basics", "Professor Williams", 3);

// Enrolling students in courses
myUniversity.enrollStuInCourse(121100, 1212323);
myUniversity.enrollStuInCourse(121111, 1212144);

// Generating reports
myUniversity.reportOfCoursesAvailable();
myUniversity.reportOfStudent(121100);
myUniversity.reportOfCourses(1212323);
myUniversity.generalReport(121100, 1212323);
```

## Contributors

- [Mustafa Assaf](https://github.com/mkassaf)
- [Faris Al-Sahili](https://github.com/fasahili)
  
