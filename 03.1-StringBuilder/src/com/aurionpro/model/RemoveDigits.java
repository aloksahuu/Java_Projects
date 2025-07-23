package com.aurionpro.model;

public class RemoveDigits {
    public static void main(String[] args) {
        String input = "abc123xyz";
        StringBuilder sb = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            if (!Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        
        System.out.println("Output: " + sb.toString());
    }
}

