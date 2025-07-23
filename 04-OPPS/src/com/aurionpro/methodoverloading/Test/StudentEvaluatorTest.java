package com.aurionpro.methodoverloading.Test;

import java.util.Scanner;

import com.aurionpro.methodoverloading.model.StudentEvaluator;

public class StudentEvaluatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentEvaluator evaluator = new StudentEvaluator();

		System.out.print("Enter marks: ");
		int marks = scanner.nextInt();

		// Call 1st evaluate()
		evaluator.evaluate(marks);

		System.out.print("Enter total marks: ");
		int total = scanner.nextInt();

		// Call 2nd evaluate()
		String grade = evaluator.evaluate(marks, total);
		System.out.println("Calculated Grade: " + grade);

		// Call 3rd evaluate()
		String remark = evaluator.evaluate(grade);
		System.out.println("Performance Remark: " + remark);

		scanner.close();
	}
}

