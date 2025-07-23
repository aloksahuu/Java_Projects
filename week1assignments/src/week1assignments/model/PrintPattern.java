package week1assignments.model;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for pattern: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
