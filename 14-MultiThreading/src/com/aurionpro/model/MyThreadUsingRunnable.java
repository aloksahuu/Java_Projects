package com.aurionpro.model;

public class MyThreadUsingRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current thread running is :"+Thread.currentThread().getName());
	}

}
