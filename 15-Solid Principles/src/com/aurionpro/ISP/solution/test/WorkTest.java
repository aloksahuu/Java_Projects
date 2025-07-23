package com.aurionpro.ISP.solution.test;

import com.aurionpro.ISP.solution.model.Labour;
import com.aurionpro.ISP.solution.model.Robot;

public class WorkTest {
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.start();
		robot.stop();
		
		System.out.println("============================");
		Labour labour = new Labour();
		labour.start();
		labour.eat();
		labour.rest();
		labour.stop();
	}
}
