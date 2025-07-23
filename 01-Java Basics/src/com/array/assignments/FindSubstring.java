package com.array.assignments;
import java.util.Scanner;

public class FindSubstring {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	       
	        System.out.print("Enter the substring to search: ");
	        String subString = scanner.nextLine();

	        
	        if (mainString.contains(subString)) {
	            int index = mainString.indexOf(subString);
	            System.out.println("Substring found at index: " + index);
	        } else {
	            System.out.println("Substring not found.");
	        }

	        scanner.close();  
	}

}
