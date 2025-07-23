package com.aurionpro.methodoverloading.model;

public class StudentEvaluator {

	// 1. Evaluate based on marks directly
	public void evaluate(int marks) {
		if (marks >= 90) {
			System.out.println("Excellent");
		} else if (marks > 75) {
			System.out.println("Very Good");
		} else if (marks > 60) {
			System.out.println("Good");
		} else if (marks > 40) {
			System.out.println("Average");
		} else {
			System.out.println("Fail");
		}
	}

	// 2. Evaluate based on marks & totalMarks and return grade
	public String evaluate(int marks, int totalMarks) {
		float percentage = (float) marks / totalMarks * 100;

		if (percentage >= 90) {
			return "A";
		} else if (percentage >= 75) {
			return "B";
		} else if (percentage >= 60) {
			return "C";
		} else if (percentage >= 40) {
			return "D";
		} else {
			return "F";
		}
	}

	// 3. Evaluate based on grade and return performance remark
	public String evaluate(String grade) {
		switch (grade.toUpperCase()) {
			case "A":
				return "Very Good";
			case "B":
				return "Good";
			default:
				return "Needs Improvement";
		}
	}
}
