package com.aurionpro.ISP.solution.model;

public class Labour implements IWorkable,ILunchaInterval{

	@Override
	public void eat() {
		System.out.println("Labour Starts eating");
		
	}

	@Override
	public void rest() {
		System.out.println("Labour Takes Rest");
		
	}

	@Override
	public void start() {
		System.out.println("Labour starts working");
		
	}

	@Override
	public void stop() {
		System.out.println("Labour stops working");
		
	}

}
