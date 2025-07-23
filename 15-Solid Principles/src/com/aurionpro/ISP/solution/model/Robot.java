package com.aurionpro.ISP.solution.model;

public class Robot implements IWorkable {

	@Override
	public void start() {
		System.out.println("Robot Start working");
		
	}

	@Override
	public void stop() {
		System.out.println("Robot stops working");
		
	}

}
