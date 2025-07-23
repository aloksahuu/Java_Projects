package com.aurionpro.SRP.Solution.model;

public class CalculatorDivide {
	public void Divide(Calculator calculate) {
		double n1 = calculate.getNum1();
		double n2 = calculate.getNum2();
		System.out.println("Division of "+n1+" / "+n2+" is :"+(n1/n2));
	}
}
