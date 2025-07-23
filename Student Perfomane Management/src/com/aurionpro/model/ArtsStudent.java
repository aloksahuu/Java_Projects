package com.aurionpro.model;

public class ArtsStudent extends Students{
	int history;
	int politicalScience;
	int sociology;

	public ArtsStudent(String name, int rollNumber, String stream, int history, int politicalScience, int sociology) {
		super(name, rollNumber, stream);
		this.history = history;
		this.politicalScience = politicalScience;
		this.sociology = sociology;
	}

	@Override
	public void calculatePerformance() {
		double average = (history + politicalScience + sociology) / 3.0;
		System.out.println("Subjects: History = " + history + ", Political Science = " + politicalScience + ", Sociology = " + sociology);
		System.out.println("Performance (Avg): " + average + "%");
		printGrade(average);
	}

	public void printGrade(double avg) {
		if (avg >= 90)
			System.out.println("Grade: A+");
		else if (avg >= 80)
			System.out.println("Grade: A");
		else if (avg >= 70)
			System.out.println("Grade: B");
		else if (avg >= 60)
			System.out.println("Grade: C");
		else
			System.out.println("Grade: D");
	}
}

