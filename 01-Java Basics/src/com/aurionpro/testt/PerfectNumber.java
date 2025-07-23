package com.aurionpro.testt;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6;
        int sum = 0;

        // Start i from 1 (NOT 0) to avoid divide-by-zero error
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i; // Add proper divisors
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is Not a Perfect Number");
        }
    }
}

