package com.quiz.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session != null) {
			// Remove all quiz-related attributes
			session.removeAttribute("user");
			session.removeAttribute("quizQuestions");
			session.removeAttribute("userAnswers");
			session.removeAttribute("currentQuestion");
			session.removeAttribute("quizStartTime");

			// Invalidate the session
			session.invalidate();
		}

		// Redirect to login page
		response.sendRedirect("login.html");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Handle GET requests the same way as POST
		doPost(request, response);
	}
}