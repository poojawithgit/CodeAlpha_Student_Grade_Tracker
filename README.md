# CodeAlpha_Student_Grade_Tracker
A simple console-based Java project to manage student grades, calculate averages, and display reports.
## Project Description
The **Student Grade Tracker** is a simple Java console-based application that allows teachers or students to manage and track student grades. Users can add multiple students, input their grades, and get a detailed report including average, highest, and lowest grades.

This project is designed to demonstrate basic Java programming concepts, object-oriented programming (OOP), and collection handling using ArrayLists

## Features / Functionality
1.Add multiple students to the tracker.
2.Input multiple grades for each student.
3. Automatically calculate:
4. Average grade (formatted to 2 decimal places)
5. Highest grade
6. Lowest grade
7. Display a complete student report with all grades and statistics.

## How It Works
1. The program prompts the user to enter the number of students.
2. For each student:
   - The program asks for the student's name.
   - The user enters the number of grades they want to input.
   - Grades are entered one by one.
3. After all input is completed, a **student report** is displayed showing:
   - Student name
   - List of grades
   - Average grade
   - Highest grade
   - Lowest grade
   - 
## Classes & Methods

### 1. `GradeTracker.java`
- **Purpose:** Main class that handles user input and generates the student report.
- **Key Methods / Concepts Used:**
  - `Scanner` – for taking user input from the console.
  - `ArrayList<Student>` – stores all student objects.
  - `for` loops – used to iterate through students and their grades.
  - `System.out.println` & `System.out.printf` – used for output formatting.
  - `sc.nextLine()` after `nextInt()` – clears input buffer to avoid skipping inputs.

### 2. `Student.java`
- **Purpose:** Represents a student with a name and a list of grades.
- **Attributes:**
  - `String name` – stores student name.
  - `ArrayList<Integer> grades` – stores all grades for the student.
- **Methods:**
  - `getName()` – returns the student’s name.
  - `addGrade(int grade)` – adds a grade to the student.
  - `getGrades()` – returns all grades.
  - `getAverage()` – calculates and returns the average grade.
  - `getHighest()` – finds and returns the highest grade.
  - `getLowest()` – finds and returns the lowest grade.

## Concepts Used
- **Java Basics:** Variables, data types, input/output.
- **Control Flow:** Loops (`for`) and conditional statements.
- **Object-Oriented Programming (OOP):**
  - Classes & Objects (`Student` class, `GradeTracker` class)
  - Encapsulation (private attributes with getters)
- **Collections:** `ArrayList` for storing students and grades.
- **Type Casting:** Casting `int` sum to `double` for average calculation.
- **Input Handling:** `Scanner` and buffer management.
- **Formatting Output:** `System.out.printf` for 2-decimal precision.

- ## Example Usage

**Input:**
How many students do you want to add? 2
Enter the name of student: Muskan
How many grades do you want to enter for? 3
Enter Grade 1: 85
Enter Grade 2: 90
Enter Grade 3: 78
Enter the name of student: Somya
How many grades do you want to enter for? 2
Enter Grade 1: 92
Enter Grade 2: 88 


**Output:**
===== Student Report =====
Name: Muskan
Grades: [85, 90, 78]
Average: 84.33
Highest: 90
Lowest: 78
Name: Somya
Grades: [92, 88]
Average: 90.00
Highest: 92
Lowest: 88



## How to Run
1. Clone the repository.
2. Open the project in **IntelliJ IDEA** or any Java IDE.
3. Compile and run `GradeTracker.java`.
4. Follow the console prompts to add students and grades


## Author
Pooja Soni


