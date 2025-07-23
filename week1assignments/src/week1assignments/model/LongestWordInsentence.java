package week1assignments.model;

import java.util.Scanner;

public class LongestWordInsentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = scanner.nextLine();
        String regex = "[,\\.\\s]+";  
        String[] myarr = str.split(regex);
        String longestWord = "";
        int maxLength = 0;

        for (int i = 0; i < myarr.length; i++) {
            String word = myarr[i];
            int length = word.length();

            if (length > maxLength) {
                maxLength = length;
                longestWord = word;
            }
        }

        System.out.println("Longest word is: " + longestWord);
        System.out.println("Length of longest word: " + maxLength);
        scanner.close();
    }
}
