
package com.aurionpro.assignments;

import java.util.Scanner;

public class CurrencyDenominationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int amount = scanner.nextInt();

        if (amount > 50000) {
            System.out.println("Amount should not exceed 50000.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount should be a multiple of 100.");
        } else {
            int twoThousand = 0, fiveHundred = 0, twoHundred = 0, oneHundred = 0;

            while (amount >= 2000) { //5000
                amount -= 2000; //3000 1000
                twoThousand++; //1 2
            }

            while (amount >= 500) {  //1000
                amount -= 500;//500 0
                fiveHundred++;//1 2
            }

            while (amount >= 200) {
                amount -= 200;
                twoHundred++;
            }

            while (amount >= 100) {
                amount -= 100;
                oneHundred++;
            }

            if (twoThousand > 0) {
                System.out.println("Two Thousand : " + twoThousand);
            }
            if (fiveHundred > 0) {
                System.out.println("Five Hundred : " + fiveHundred);
            }
            if (twoHundred > 0) {
                System.out.println("Two Hundred : " + twoHundred);
            }
            if (oneHundred > 0) {
                System.out.println("One Hundred : " + oneHundred);
            }
        }

        scanner.close();
    }
}
