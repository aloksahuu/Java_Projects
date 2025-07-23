package com.aurionpro.project.test;

import com.aurionpro.project.model.Department;
import com.aurionpro.project.model.Professor;
import com.aurionpro.project.model.Student;

public class Main {
    static int totalCourse = 0;

    public static void main(String[] args) {
        Student s1 = new Student("Alice", Department.COMPS, 101);
        Student s2 = new Student("Bob", Department.IT, 102);

        Professor p1 = new Professor("Dr. Smith", Department.COMPS, 1);
        Professor p2 = new Professor("Dr. John", Department.IT, 2);

        s1.enrollCourse("Data Structures");
        totalCourse++;

        s2.enrollCourse("OOP");
        totalCourse++;

        p1.assignSubject("Algorithms");
        p2.assignSubject("Machine Learning");

        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());

        System.out.println("Total Students: " + Student.totalStudents);
        System.out.println("Total Courses: " + totalCourse);
    }
}
