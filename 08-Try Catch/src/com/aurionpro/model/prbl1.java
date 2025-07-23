package com.aurionpro.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prbl1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int divide = num1 / num2;
            System.out.println("Result: " + divide);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scanner.close();
            System.out.println("Program Ended.");
        }
    }
}
