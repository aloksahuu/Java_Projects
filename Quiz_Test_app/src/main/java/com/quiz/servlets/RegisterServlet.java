package com.quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.quiz.DatabaseConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// Validation
		if (username == null || password == null || email == null || username.trim().isEmpty()
				|| password.trim().isEmpty() || email.trim().isEmpty()) {

			showErrorPage(out, "All fields are required!", "register.html");
			return;
		}

		try (Connection conn = DatabaseConnection.getConnection()) {
			String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";

			try (PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setString(1, username.trim());
				ps.setString(2, password); // In real app, hash the password
				ps.setString(3, email.trim());

				int result = ps.executeUpdate();

				if (result > 0) {
					showSuccessPage(out, "Registration successful!", "login.html", "Go to Login");
				} else {
					showErrorPage(out, "Registration failed! Please try again.", "register.html");
				}
			}

		} catch (SQLException e) {
			if (e.getMessage().contains("Duplicate entry")) {
				showErrorPage(out, "Username already exists! Please choose a different username.", "register.html");
			} else {
				showErrorPage(out, "Database error: " + e.getMessage(), "register.html");
			}
		}
	}

	private void showSuccessPage(PrintWriter out, String message, String redirectUrl, String buttonText) {
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Success</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("<meta http-equiv='refresh' content='3;url=" + redirectUrl + "'>");
		out.println("</head>");
		out.println("<body class='bg-light'>");
		out.println("<div class='container mt-5'>");
		out.println("<div class='row justify-content-center'>");
		out.println("<div class='col-md-6'>");
		out.println("<div class='card shadow-lg'>");
		out.println("<div class='card-header bg-success text-white text-center'>");
		out.println("<h2><i class='fas fa-check-circle'></i> Success!</h2>");
		out.println("</div>");
		out.println("<div class='card-body text-center p-4'>");
		out.println("<div class='alert alert-success' role='alert'>");
		out.println("<h4 class='alert-heading'>Great!</h4>");
		out.println("<p>" + message + "</p>");
		out.println("<hr>");
		out.println("<p class='mb-0'>You will be redirected automatically in 3 seconds.</p>");
		out.println("</div>");
		out.println("<a href='" + redirectUrl + "' class='btn btn-success btn-lg mt-3'>" + buttonText + "</a>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("<script src='https://kit.fontawesome.com/a076d05399.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}

	private void showErrorPage(PrintWriter out, String message, String redirectUrl) {
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("<title>Error</title>");
		out.println(
				"<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("</head>");
		out.println("<body class='bg-light'>");
		out.println("<div class='container mt-5'>");
		out.println("<div class='row justify-content-center'>");
		out.println("<div class='col-md-6'>");
		out.println("<div class='card shadow-lg'>");
		out.println("<div class='card-header bg-danger text-white text-center'>");
		out.println("<h2><i class='fas fa-exclamation-triangle'></i> Error!</h2>");
		out.println("</div>");
		out.println("<div class='card-body text-center p-4'>");
		out.println("<div class='alert alert-danger' role='alert'>");
		out.println("<h4 class='alert-heading'>Oops!</h4>");
		out.println("<p>" + message + "</p>");
		out.println("</div>");
		out.println("<a href='" + redirectUrl + "' class='btn btn-danger btn-lg mt-3'>Try Again</a>");
		out.println("<a href='index.html' class='btn btn-secondary btn-lg mt-3 ms-2'>Home</a>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("<script src='https://kit.fontawesome.com/a076d05399.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}
}