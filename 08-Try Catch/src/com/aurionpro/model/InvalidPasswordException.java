package com.aurionpro.model;

public class InvalidPasswordException extends Exception{
	
	public InvalidPasswordException() {
		System.out.println("Incorrect password :");
		
	}
	public InvalidPasswordException(String message) {
		super(message);
	}
}
