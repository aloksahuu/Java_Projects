package com.aurionpro.model;

public abstract class Students {
	String name;
	public int rollNumber;
	String stream;
	
	public Students(String name, int rollNumber, String stream) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.stream=stream;
	}
	
	public abstract void calculatePerformance(); 
	
	public void displayInfo() {
		System.out.println("Name: " + name + " | Roll No: " + rollNumber + " | Stream: " + stream);
	}
	
	public void displayPerformance() {
		System.out.println("Performance: Displaying basic performance info.");
		calculatePerformance();
	}

	public void displayPerformance(boolean detailed) {
		if (detailed) {
			System.out.println("Performance: Detailed View");
			calculatePerformance();
		} else {
			System.out.println("Performance: Summary Only");
		}
	}

	public void displayPerformance(String format) {
		System.out.println("Performance Format: " + format);
		if (format.equalsIgnoreCase("percentage") || format.equalsIgnoreCase("grade")) {
			calculatePerformance(); 
		} else {
			System.out.println("Invalid format. Use 'percentage' or 'grade'");
		}
	}

}
