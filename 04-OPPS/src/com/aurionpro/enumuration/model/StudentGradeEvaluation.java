package com.aurionpro.enumuration.model;

import java.util.Scanner;

public class StudentGradeEvaluation {

    public static void gradecalculation(Grade grade) {
        switch (grade) {
            case A:
                System.out.println("Excellent!");
                break;
            case B:
                System.out.println("Very good!");
                break;
            case C:
                System.out.println("Good!");
                break;
            case D:
                System.out.println("Bad!");
                break;
            case F:
                System.out.println("Needs Improvement!");
                break;
            default:
                System.out.println("Enter correct grade!!");
        }
    }

    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the grade (A, B, C, D, F): ");
         String input = scanner.nextLine().toUpperCase();

         Grade grade = Grade.valueOf(input);  
//         StudentGradeEvaluation obj = new StudentGradeEvaluation(); // static use kiya to no need to create object
         gradecalculation(grade);
         
         scanner.close();
    }
}
