package com.aurionpro.ISP.solution.Education.model;

public class Teacher implements ITeacher{

	@Override
	public void gradeExam() {
		System.out.println("Teacher gives grade");
	}

	@Override
	public void createQuestionBank() {
		System.out.println("Teacher creates question bank");
		
	}

}
