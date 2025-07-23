package week1assignments.model;

import java.util.Scanner;

public class CountNoOfWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String str = scanner.nextLine();
		String regex = "[,\\.\\s]";
		String []myarr = str.split(regex);
		int wordcount = myarr.length;
		System.out.println("The number of words are :"+wordcount);
		scanner.close();
	}
}
