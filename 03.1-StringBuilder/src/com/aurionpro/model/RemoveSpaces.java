package com.aurionpro.model;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "Java is awesome";
        StringBuilder sb = new StringBuilder();
        
        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                sb.append(ch);
            }
        }
        
        System.out.println("Output: " + sb.toString());
    }
}
