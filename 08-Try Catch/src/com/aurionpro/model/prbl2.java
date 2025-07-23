package com.aurionpro.model;

import java.util.Scanner;

public class prbl2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 1: Create string array of size 2
            String[] arr = new String[2];
            System.out.println("Enter 2 string values:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextLine();
            }

            // Step 2: Try accessing the 5th element (index 4)
            System.out.println("Accessing 5th element: " + arr[4]);

            // Step 3: Try to find length of a null string
            String str = null;
            System.out.println("Length of null string: " + str.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an index outside the array bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Tried to use a null object reference.");
        } catch (Exception e) {
            System.out.println("Other Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program Ended.");
        }
    }
}
