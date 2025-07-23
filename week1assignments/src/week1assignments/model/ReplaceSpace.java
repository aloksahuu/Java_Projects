package week1assignments.model;

import java.util.Scanner;

public class ReplaceSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String str = scanner.nextLine();

       
        String[] words = str.split(" "); 

       
        String newSentence = "";

        for (int i = 0; i < words.length; i++) {
            newSentence += words[i];
            if (i < words.length - 1) {
                newSentence += "-";
            }
        }

        System.out.println("Modified sentence: " + newSentence);
        scanner.close();
    }
}
