package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    // Database configuration - UPDATE THESE VALUES FOR YOUR SETUP
    private static final String URL = "jdbc:mysql://localhost:3306/quiz_app";
    private static final String USERNAME = "root";  // Change if your username is different
    private static final String PASSWORD = "Sahu@2004";      // Change if you have a password
    
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
            return connection;
        } catch (SQLException e) {
            System.err.println("Failed to create database connection!");
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}