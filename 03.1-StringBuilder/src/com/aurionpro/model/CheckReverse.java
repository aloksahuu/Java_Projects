package com.aurionpro.model;

public class CheckReverse {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";
        
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        
        if (sb.toString().equals(str2)) {
            System.out.println("Output: Yes");
        } else {
            System.out.println("Output: No");
        }
    }
}

