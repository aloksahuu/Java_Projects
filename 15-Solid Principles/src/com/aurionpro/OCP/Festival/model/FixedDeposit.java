package com.aurionpro.OCP.Festival.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private IFestivalInterest intrest;
	
	public FixedDeposit(int accountNumber, String name, double principal, int duration,IFestivalInterest intrest) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.principal=principal;
		this.duration=duration;
		this.intrest =intrest;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public double getPricipal() {
		return principal;
	}
	public int getDuration() {
		return duration;
	}
	public IFestivalInterest getIntrest() {
		return intrest;
	}
	
	public double CalculateSimpleIntrest() {
		double p = getPricipal();
		int n = getDuration();
		double r = intrest.getIntrestRate();
		return (p*n*r)/100;
	}
}
