package com.aurionpro.OCP.violation.test;

import com.aurionpro.OCP.violation.model.FestivalType;
import com.aurionpro.OCP.violation.model.FixedDeposit;

public class FDTest {
	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(123, "Anshika", 10000, FestivalType.DIWALI, 2);
		
		fd.getIntrestRates();
		double simpleintrest = fd.calculateSimpleIntrest();
		System.out.println("Customer details");
		System.out.println(" Name :" + fd.getName());
		System.out.println("Account number :"+ fd.getAccountNumber());
		System.out.println("Festival Type :"+fd.getFestival());
		System.out.println("Duration :"+fd.getDuration());
		System.out.println("Your simple intrest is :"+simpleintrest);
	}
}
