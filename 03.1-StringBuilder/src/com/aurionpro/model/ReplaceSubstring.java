package com.aurionpro.model;

public class ReplaceSubstring {
    public static void main(String[] args) {
        String input = "This is a bad idea";
        String toReplace = "bad";
        String replacement = "good";
        
        StringBuilder sb = new StringBuilder(input);
        int start = sb.indexOf(toReplace);
        
        if (start != -1) {
            sb.replace(start, start + toReplace.length(), replacement);
        }
        
        System.out.println("Output: " + sb.toString());
    }
}

