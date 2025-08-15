package com.quiz;

import java.sql.Connection;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DatabaseInitializationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("🚀 Quiz Application is starting up...");
        
        try {
            // Test database connection
            System.out.println("📊 Testing database connection...");
            
            try (Connection conn = DatabaseConnection.getConnection()) {
                if (conn != null && !conn.isClosed()) {
                    System.out.println("✅ Database connection successful!");
                    System.out.println("🎉 Quiz Application startup completed!");
                }
            }
            
        } catch (Exception e) {
            System.err.println("❌ Database connection failed: " + e.getMessage());
            System.err.println("⚠️ Please check:");
            System.err.println("   - MySQL server is running");
            System.err.println("   - Database 'quiz_app' exists");
            System.err.println("   - Username/password are correct");
            System.err.println("   - JDBC driver is in classpath");
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("👋 Quiz Application is shutting down...");
    }
}