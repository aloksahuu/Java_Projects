package week1assignments.model;

import java.util.Scanner;

public class FrequencyOfChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String str = scanner.nextLine();

		int[] frequency = new int[256]; // ASCII range

		// Counting character frequencies. like created an integer array of size 256(all ASCII char included)
		// then using charAt method  access each character in the string.
		// then when we store the character in the integer array it gets converted to its ASCII values.
		// If chr appears once its count becomes 1 and then goes on increasing.
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frequency[ch]++;
		}

		// Display characters with frequency > 0
		System.out.println("\nCharacter frequencies:");
		for (int i = 0; i < 256; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + " : " + frequency[i]);// Converting integer to ASCII value
			}
		}

		scanner.close(); 
	}
}
