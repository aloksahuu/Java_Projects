package com.aurionpro.methodoverloading.model;

public class Printer {
	String msg;
	int number;
	
	public void print() {
		System.out.println("Default");
	}
	
	public String print(String mssg) {
		return (mssg);
	}
	
	public int print(int number) {
		return(number);
	}
}
