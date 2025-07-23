package com.array.assignments;
import java.util.Scanner;

public class SecondMaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int max, secondMax;

        if (arr[0] > arr[1]) {
            max = arr[0];
            secondMax = arr[1];
        } else {
            max = arr[1];
            secondMax = arr[0];
        }
        for (int i = 2; i < size; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        
        if (max == secondMax) {
            System.out.println("No second largest element found (all elements may be same).");
        } else {
            System.out.println("The second largest element is: " + secondMax);
        }

        scanner.close();
    }
}


