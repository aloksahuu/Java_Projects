package com.aurionpro.SRP.Solution.model;

public class CalculatorMul {
	public void Multiply(Calculator calculate) {
		double n1 = calculate.getNum1();
		double n2 = calculate.getNum2();
		System.out.println("Multiplication of "+n1+" x "+n2+" is :"+(n1*n2));
	}
}
