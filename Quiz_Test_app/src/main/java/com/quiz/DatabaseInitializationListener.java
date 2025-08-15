package com.quiz;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DatabaseInitializationListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("🚀 Quiz Application is starting up...");

		try {
			// Test database connection first
			System.out.println("📊 Testing database connection...");
			DatabaseConnection.testConnection();

			// Initialize database tables and sample data
			System.out.println("🔧 Initializing database...");
			DatabaseConnection.initializeDatabase();

			System.out.println("✅ Database initialized successfully!");
			System.out.println("🎉 Quiz Application startup completed!");

		} catch (Exception e) {
			System.err.println("❌ Error initializing database: " + e.getMessage());
			e.printStackTrace();

			// Log the error but don't stop the application
			System.err.println("⚠️ Application will continue, but database features may not work");
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("🔄 Quiz Application is shutting down...");

		// Perform any cleanup if needed
		// Close database connections, clear caches, etc.

		System.out.println("👋 Quiz Application shutdown completed!");
	}
}