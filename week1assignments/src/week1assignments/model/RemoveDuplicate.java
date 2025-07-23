package week1assignments.model;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String Str = scanner.nextLine();
		StringBuilder result = new StringBuilder();
		for (int i=0 ;i< Str.length() ; i++) {
			char ch = Str.charAt(i);
			
	        if (result.indexOf(String.valueOf(ch)) == -1) {
	            result.append(ch); // If not, add it
	        }
	    }

	    System.out.println("String without duplicates: " + result);
	    scanner.close();
	}
}
