package week1assignments.model;

import java.util.Scanner;

public class StringPalindromeOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = scanner.nextLine();

		String reversed = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			reversed = reversed + str1.charAt(i);
		}

		if (reversed.equals(str1)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}

		scanner.close();
	}
}
