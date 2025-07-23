package week1assignments.model;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Enter first word:");
        String str1 = scanner.nextLine();

        System.out.println("Enter second word:");
        String str2 = scanner.nextLine();


        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams (length mismatch)");
        }

       
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

       
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Both are anagrams!");
        } else {
            System.out.println("Not anagrams");
        }

        scanner.close();
    }
}
