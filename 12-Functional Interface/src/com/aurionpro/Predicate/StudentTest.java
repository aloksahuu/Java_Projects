package com.aurionpro.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentTest {
    public static void main(String[] args) {
      
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alok", 85));
        students.add(new Student("Ravi", 35));
        students.add(new Student("Anshika", 60));
        students.add(new Student("Neha", 20));
        students.add(new Student("Om", 45));

        
        Predicate<Student> isPassing = s -> s.marks >= 40;

        System.out.println(" Passing Students:");
        for (Student s : students) {
            if (isPassing.test(s)) {
                System.out.println("- " + s.name + " (Marks: " + s.marks + ")");
            }
        }
    }
}

