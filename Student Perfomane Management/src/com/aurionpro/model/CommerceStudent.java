package com.aurionpro.model;

public class CommerceStudent extends Students {
	int accounts;
	int businessStudies;
	int economics;

	public CommerceStudent(String name, int rollNumber, String stream, int accounts, int businessStudies, int economics) {
		super(name, rollNumber, stream);
		this.accounts = accounts;
		this.businessStudies = businessStudies;
		this.economics = economics;
	}

	@Override
	public void calculatePerformance() {
		double average = (accounts + businessStudies + economics) / 3.0;
		System.out.println("Subjects: Accounts = " + accounts + ", Business Studies = " + businessStudies + ", Economics = " + economics);
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

