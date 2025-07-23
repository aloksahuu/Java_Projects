package com.array.assignments;

import java.util.Scanner;

public class NumberRepeatingInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count how many times each number appears
        for (int i = 0; i < size; i++) {
            int count = 1;
            boolean alreadyCounted = false;

            // Check if this number was already counted
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            // If not already counted, count its occurrences
            if (!alreadyCounted) {
                for (int k = i + 1; k < size; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " is repeated " + count + " time(s)");
            }
        }

        scanner.close();
    }
}

