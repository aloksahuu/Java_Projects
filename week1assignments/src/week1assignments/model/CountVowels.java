package week1assignments.model;
import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the string :");
		String str1 = scanner.nextLine().toLowerCase();
		int count =0;
		for(int i =0;i<str1.length();i++) {
			char chr = str1.charAt(i);
			if(chr=='a'|| chr=='e'||chr=='o'||chr=='u'||chr=='i') {
				count++;
			}
		}
		if(count>0) {
			System.out.println("The number of vowels in the string are:"+count);
		}else {
			System.out.println("There is no vowels in the string.");
		}
		scanner.close();
	}
}

