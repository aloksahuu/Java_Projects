package com.aurionpro.model;

public class ScienceStudent extends Students{
	int physics;
	int chemisty;
	int maths;
	
	public ScienceStudent(String name,int rollNumber, String Stream, int physics, int chemistry, int maths) {
		super(name, rollNumber, Stream);
		this.physics=physics;
		this.chemisty=chemistry;
		this.maths=maths;
	}
	
	@Override
	public void calculatePerformance() {
		double average = (physics+chemisty+maths)/3.0;
		System.out.println("Subjects marks : Physics = "+physics+" , Chemistry =  "+chemisty+" , Maths = "+maths);
		System.out.println("Performance of "+name+" : "+average+ "%");
		printGrade(average);
	}
	
	public void printGrade(double avg) {
		if (avg >= 90)
			System.out.println("Grade: A+");
		else if (avg >= 80)
			System.out.println("Grade: A");
		else if (avg >= 70)
			System.out.println("Grade: B");
		else if (avg >= 60)
			System.out.println("Grade: C");
		else
			System.out.println("Grade: D");
	}
}
