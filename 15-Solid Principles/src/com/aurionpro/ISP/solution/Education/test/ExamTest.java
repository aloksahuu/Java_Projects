package com.aurionpro.ISP.solution.Education.test;

import com.aurionpro.ISP.solution.Education.model.Student;
import com.aurionpro.ISP.solution.Education.model.Teacher;
import com.aurionpro.ISP.solution.Education.model.admin;

public class ExamTest {
	public static void main(String[] args) {
		Student student = new Student();
		admin admin = new admin();
		Teacher teacher = new Teacher();
		
		teacher.createQuestionBank();
		admin.assignTeacher();
		student.startExam();
		teacher.gradeExam();
		
		
		
		
	}
}
