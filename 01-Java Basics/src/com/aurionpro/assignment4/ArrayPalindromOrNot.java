package com.aurionpro.assignment4;
import java.util.Scanner;

public class ArrayPalindromOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] original = new int[size];
        int[] reverse = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            original[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            reverse[i] = original[size - 1 - i];
        }

        boolean isPalindrome = true;
        for (int i = 0; i < size; i++) {
            if (original[i] != reverse[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }

        scanner.close();
    }
}
