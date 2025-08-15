package com.quiz;

import java.sql.Timestamp;

public class Result {
	private int id;
	private int userId;
	private int score;
	private int totalQuestions;
	private Timestamp testDate;
	private String answers;

	public Result() {
	}

	public Result(int id, int userId, int score, int totalQuestions, Timestamp testDate, String answers) {
		this.id = id;
		this.userId = userId;
		this.score = score;
		this.totalQuestions = totalQuestions;
		this.testDate = testDate;
		this.answers = answers;
	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public Timestamp getTestDate() {
		return testDate;
	}

	public void setTestDate(Timestamp testDate) {
		this.testDate = testDate;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}
}
