package com.example.gradetracker;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student: "); //student name enter krna hai
            String name = sc.nextLine();
            Student s = new Student(name);

            System.out.print("How many grades do you want to enter for? ");
            int m = sc.nextInt();

            for (int j = 0; j < m; j++) {
                System.out.print("Enter Grade " + (j+1) + ": ");
                int grade = sc.nextInt();
                s.addGrade(grade);
            }
            sc.nextLine(); // buffer clear
            students.add(s);
        }

        // Report
        System.out.println("\n===== Student Report =====");
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Grades: " + s.getGrades());
            System.out.println("Average: " + s.getAverage());  //average ko 2 decimal tak
            System.out.println("Highest: " + s.getHighest());
            System.out.println("Lowest: " + s.getLowest());
            System.out.println("--------------------------");
        }

        sc.close();
    }
}
