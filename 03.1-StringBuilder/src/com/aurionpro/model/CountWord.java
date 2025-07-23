package com.aurionpro.model;

public class CountWord {
    public static void main(String[] args) {
        String sentence = "this is this and that is this";
        String wordToCount = "this";
        int count = 0;
        
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        
        System.out.println("Output: " + count);
    }
}

