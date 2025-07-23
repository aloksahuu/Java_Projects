package week1assignments.model;

import java.util.Scanner;

public class CountCharctersDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = scanner.nextLine();
		int digits =0;
		int letters =0;
		int specialchar =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) {
				letters++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else {
				specialchar++;
			}
		}
		System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialchar);

        scanner.close();
	}
}
