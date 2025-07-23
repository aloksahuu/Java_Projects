package com.aurionpro.test;

import com.aurionpro.model.PriorityDemo;

public class PriorityTest {
	public static void main(String[] args) {
		new PriorityDemo("MAX", 10).start();
		new PriorityDemo("Min", 1).start();
		new PriorityDemo("Normal", 5).start();
//		new PriorityDemo("t1", 7).start();

	}
}
