package com.aurionpro.SRP.Solution.test;

import java.util.Scanner;

import com.aurionpro.SRP.Solution.model.Calculator;
import com.aurionpro.SRP.Solution.model.CalculatorAdd;
import com.aurionpro.SRP.Solution.model.CalculatorDivide;
import com.aurionpro.SRP.Solution.model.CalculatorMul;
import com.aurionpro.SRP.Solution.model.CalculatorSub;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		double num1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Enter the number 2:");
		double num2 = Double.parseDouble(scanner.nextLine());
		
		Calculator calculate = new Calculator(num1, num2);
		
		CalculatorAdd add = new CalculatorAdd();
		add.add(calculate);
		
		CalculatorSub sub =new CalculatorSub();
		sub.subtract(calculate);
		
		CalculatorMul mul = new CalculatorMul();
		mul.Multiply(calculate);
		
		CalculatorDivide div = new CalculatorDivide();
		div.Divide(calculate);
		scanner.close();
	}
}
