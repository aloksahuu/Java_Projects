package week1assignments.model;

import java.util.Scanner;

public class RepeatedCharInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if character appears more than once and is not already in result
			if (str.indexOf(ch) != str.lastIndexOf(ch) && result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch); 
			}
		}

		System.out.println("Duplicate characters: " + result);
		scanner.close();
	}
}
