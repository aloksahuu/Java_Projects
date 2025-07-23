package com.aurionpro.model;

import java.util.Scanner;

public class prbl5 {
	public static void main(String[] args) throws InvalidPasswordException {
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your password :");
			String password = scanner.nextLine();
			if(password.length()<8) {
				throw new InvalidPasswordException("Password should be atleast 8 character long !");
			}
			
			boolean hasDigit = false;
			for(char ch : password.toCharArray()) {
				if(Character.isDigit(ch)) {
					hasDigit=true;
					break;
				}
			}
			if(!hasDigit) {
				throw new InvalidPasswordException("Password should contain atleast one digit .");
			}
			else {
				System.out.println("Password is valid ");
			}
		}catch (InvalidPasswordException e) {
			System.out.println(e);
			System.exit(0);
		}
		finally {
			System.out.println("Password is created");
		
		}
		
	}
}
