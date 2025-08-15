package com.quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.quiz.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("user") == null) {
			response.sendRedirect("login.html");
			return;
		}

		User user = (User) session.getAttribute("user");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("    <meta charset='UTF-8'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("    <title>Quiz Dashboard</title>");
		out.println(
				"    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("    <link rel='stylesheet' href='css/style.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("    <div class='container mt-5'>");
		out.println("        <div class='row justify-content-center'>");
		out.println("            <div class='col-md-8'>");
		out.println("                <div class='card shadow-lg'>");
		out.println("                    <div class='card-header bg-primary text-white text-center'>");
		out.println("                        <h2>Welcome, " + user.getUsername() + "!</h2>");
		out.println("                    </div>");
		out.println("                    <div class='card-body text-center'>");
		out.println("                        <h4 class='mb-4'>Quiz Dashboard</h4>");
		out.println("                        <p class='text-muted mb-4'>Ready to test your knowledge?</p>");
		out.println("                        <div class='row'>");
		out.println("                            <div class='col-md-4 mb-3'>");
		out.println("                                <form action='quiz' method='get' style='display:inline;'>");
		out.println("                                    <button type='submit' class='btn btn-success btn-lg w-100'>");
		out.println("                                        <i class='fas fa-play'></i> Start Quiz");
		out.println("                                    </button>");
		out.println("                                </form>");
		out.println("                            </div>");
		out.println("                            <div class='col-md-4 mb-3'>");
		out.println("                                <form action='history' method='get' style='display:inline;'>");
		out.println("                                    <button type='submit' class='btn btn-info btn-lg w-100'>");
		out.println("                                        <i class='fas fa-history'></i> View History");
		out.println("                                    </button>");
		out.println("                                </form>");
		out.println("                            </div>");
		out.println("                            <div class='col-md-4 mb-3'>");
		out.println("                                <form action='logout' method='post' style='display:inline;'>");
		out.println("                                    <button type='submit' class='btn btn-danger btn-lg w-100'>");
		out.println("                                        <i class='fas fa-sign-out-alt'></i> Logout");
		out.println("                                    </button>");
		out.println("                                </form>");
		out.println("                            </div>");
		out.println("                        </div>");
		out.println("                        <div class='alert alert-warning mt-4'>");
		out.println("                            <strong>Quiz Rules:</strong><br>");
		out.println("                            • You have 1 minute to complete 4 questions<br>");
		out.println("                            • Questions are randomly selected<br>");
		out.println("                            • You can navigate back and forth between questions<br>");
		out.println("                            • Your session will timeout after the time limit");
		out.println("                        </div>");
		out.println("                    </div>");
		out.println("                </div>");
		out.println("            </div>");
		out.println("        </div>");
		out.println("    </div>");
		out.println(
				"    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js'></script>");
		out.println("    <script src='https://kit.fontawesome.com/a076d05399.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}
}
