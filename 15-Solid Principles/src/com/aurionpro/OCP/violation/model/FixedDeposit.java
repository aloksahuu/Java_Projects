package com.aurionpro.OCP.violation.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(int accountNumber, String name, double principle, FestivalType festival, int duration) {
		this.accountNumber=accountNumber;
		this.name=name;
		this.principal=principle;
		this.duration=duration;
		this.festival=festival;
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
	public FestivalType getFestival() {
		return festival;
	}
	
	public double getIntrestRates() {
		switch(festival) {
		case NEWYEAR:
			return 8.0;
			
		case DIWALI:
			return 8.5;
			
		case HOLI:
			return 7.5;
			
		case OTHERS:
			return 6.5;
			
		default:
			return 0;
		}
	}
	
	public double calculateSimpleIntrest() {
		double p = principal;
		int n = duration;
		double r = getIntrestRates();
		return (p*n*r)/100;
	}
	
}
