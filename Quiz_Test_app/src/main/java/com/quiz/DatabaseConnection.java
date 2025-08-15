package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	// Database configuration
	private static final String URL = "jdbc:mysql://localhost:3306/quiz_app";
	private static final String USERNAME = "root"; // Change if your username is different
	private static final String PASSWORD = "Sahu@2004"; // Change if you have a password

	static {
		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MySQL JDBC Driver loaded successfully!");
		} catch (ClassNotFoundException e) {
			System.err.println("MySQL JDBC Driver not found!");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Database connection established successfully!");
			return connection;
		} catch (SQLException e) {
			System.err.println("Failed to create database connection!");
			System.err.println("Error: " + e.getMessage());
			throw e;
		}
	}

	// Initialize database tables and sample data
	public static void initializeDatabase() throws SQLException {
		try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {

			System.out.println("Initializing database tables...");

			// Create users table if not exists
			String createUsersTable = """
					    CREATE TABLE IF NOT EXISTS users (
					        id INT PRIMARY KEY AUTO_INCREMENT,
					        username VARCHAR(50) UNIQUE NOT NULL,
					        password VARCHAR(255) NOT NULL,
					        email VARCHAR(100) UNIQUE NOT NULL,
					        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
					    )
					""";
			stmt.executeUpdate(createUsersTable);
			System.out.println("✅ Users table created/verified");

			// Create questions table if not exists
			String createQuestionsTable = """
					    CREATE TABLE IF NOT EXISTS questions (
					        id INT PRIMARY KEY AUTO_INCREMENT,
					        question_text TEXT NOT NULL,
					        option_a VARCHAR(255) NOT NULL,
					        option_b VARCHAR(255) NOT NULL,
					        option_c VARCHAR(255) NOT NULL,
					        option_d VARCHAR(255) NOT NULL,
					        correct_answer CHAR(1) NOT NULL CHECK (correct_answer IN ('A', 'B', 'C', 'D')),
					        category VARCHAR(50),
					        difficulty ENUM('EASY', 'MEDIUM', 'HARD') DEFAULT 'MEDIUM',
					        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
					    )
					""";
			stmt.executeUpdate(createQuestionsTable);
			System.out.println("✅ Questions table created/verified");

			// Create quiz results table if not exists
			String createResultsTable = """
					    CREATE TABLE IF NOT EXISTS quiz_results (
					        id INT PRIMARY KEY AUTO_INCREMENT,
					        user_id INT NOT NULL,
					        score INT NOT NULL,
					        total_questions INT NOT NULL,
					        time_taken INT,
					        quiz_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
					        FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
					    )
					""";
			stmt.executeUpdate(createResultsTable);
			System.out.println("✅ Quiz results table created/verified");

			// Insert sample questions (only if table is empty)
			String checkQuestions = "SELECT COUNT(*) as count FROM questions";
			var rs = stmt.executeQuery(checkQuestions);
			rs.next();
			int questionCount = rs.getInt("count");

			if (questionCount == 0) {
				System.out.println("Inserting sample questions...");

				String[] sampleQuestions = {
						"INSERT INTO questions (question_text, option_a, option_b, option_c, option_d, correct_answer, category, difficulty) VALUES "
								+ "('What is the capital of France?', 'London', 'Berlin', 'Paris', 'Madrid', 'C', 'Geography', 'EASY')",

						"INSERT INTO questions (question_text, option_a, option_b, option_c, option_d, correct_answer, category, difficulty) VALUES "
								+ "('Which programming language is known as the mother of all languages?', 'Java', 'C', 'Python', 'JavaScript', 'B', 'Programming', 'MEDIUM')",

						"INSERT INTO questions (question_text, option_a, option_b, option_c, option_d, correct_answer, category, difficulty) VALUES "
								+ "('What is 2 + 2?', '3', '4', '5', '6', 'B', 'Mathematics', 'EASY')",

						"INSERT INTO questions (question_text, option_a, option_b, option_c, option_d, correct_answer, category, difficulty) VALUES "
								+ "('Who wrote Romeo and Juliet?', 'Charles Dickens', 'William Shakespeare', 'Jane Austen', 'Mark Twain', 'B', 'Literature', 'MEDIUM')",

						"INSERT INTO questions (question_text, option_a, option_b, option_c, option_d, correct_answer, category, difficulty) VALUES "
								+ "('What is the largest planet in our solar system?', 'Earth', 'Mars', 'Jupiter', 'Saturn', 'C', 'Science', 'MEDIUM')" };

				for (String question : sampleQuestions) {
					stmt.executeUpdate(question);
				}
				System.out.println("✅ Sample questions inserted successfully");
			} else {
				System.out.println("ℹ️ Sample questions already exist (" + questionCount + " questions found)");
			}

			System.out.println("🎉 Database initialization completed successfully!");

		} catch (SQLException e) {
			System.err.println("❌ Error during database initialization: " + e.getMessage());
			throw e;
		}
	}

	// Test method to verify connection
	public static void testConnection() {
		try (Connection conn = getConnection()) {
			if (conn != null && !conn.isClosed()) {
				System.out.println("✅ Database connection test successful!");
				System.out.println("Connected to: " + conn.getMetaData().getURL());
			}
		} catch (SQLException e) {
			System.err.println("❌ Database connection test failed!");
			e.printStackTrace();
		}
	}

	// Main method for testing
	public static void main(String[] args) {
		System.out.println("Testing database connection and initialization...");
		try {
			testConnection();
			initializeDatabase();
		} catch (SQLException e) {
			System.err.println("Database setup failed: " + e.getMessage());
		}
	}
}