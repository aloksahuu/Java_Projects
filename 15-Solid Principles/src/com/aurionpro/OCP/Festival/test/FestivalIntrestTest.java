package com.aurionpro.OCP.Festival.test;

import com.aurionpro.OCP.Festival.model.DiwaliIntrest;
import com.aurionpro.OCP.Festival.model.FixedDeposit;

public class FestivalIntrestTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(123, "Anshika", 10000,20, new DiwaliIntrest());
//		FestivalIntrest festivalIntrest = new FestivalIntrest();
		System.out.println("Customer details");
		System.out.println(" Name :" + fd.getName());
		System.out.println("Account number :"+ fd.getAccountNumber());
		System.out.println("Principle :" +fd.getPricipal());
		System.out.println("Duration :"+fd.getDuration());
		System.out.println("Simple interst is :"+ fd.CalculateSimpleIntrest());
	}
}
