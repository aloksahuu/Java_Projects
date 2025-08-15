package com.quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.quiz.DatabaseConnection;
import com.quiz.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (username == null || password == null || username.trim().isEmpty() || password.trim().isEmpty()) {
			out.println(
					"<script>alert('Username and password are required!'); window.location.href='login.html';</script>");
			return;
		}

		try (Connection conn = DatabaseConnection.getConnection()) {
			String sql = "SELECT id, username, email FROM users WHERE username = ? AND password = ?";

			try (PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setString(1, username.trim());
				ps.setString(2, password); // Case-sensitive password check

				try (ResultSet rs = ps.executeQuery()) {
					if (rs.next()) {
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("username"));
						user.setEmail(rs.getString("email"));

						HttpSession session = request.getSession();
						session.setAttribute("user", user);
						session.setMaxInactiveInterval(300); // 5 minutes session timeout

						response.sendRedirect("dashboard");
					} else {
						out.println(
								"<script>alert('Invalid username or password!'); window.location.href='login.html';</script>");
					}
				}
			}

		} catch (SQLException e) {
			out.println("<script>alert('Database error: " + e.getMessage()
					+ "'); window.location.href='login.html';</script>");
		}
	}
}