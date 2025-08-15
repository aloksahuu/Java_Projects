package com.quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.quiz.DatabaseConnection;
import com.quiz.Result;
import com.quiz.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/history")
public class TestHistoryServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("user") == null) {
			response.sendRedirect("login.html");
			return;
		}

		User user = (User) session.getAttribute("user");
		List<Result> results = getUserTestHistory(user.getId());

		showTestHistory(response, user, results);
	}

	private List<Result> getUserTestHistory(int userId) {
		List<Result> results = new ArrayList<>();

		try (Connection conn = DatabaseConnection.getConnection()) {
			String sql = "SELECT * FROM results WHERE user_id = ? ORDER BY test_date DESC";

			try (PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, userId);

				try (ResultSet rs = ps.executeQuery()) {
					while (rs.next()) {
						Result result = new Result();
						result.setId(rs.getInt("id"));
						result.setUserId(rs.getInt("user_id"));
						result.setScore(rs.getInt("score"));
						result.setTotalQuestions(rs.getInt("total_questions"));
						result.setTestDate(rs.getTimestamp("test_date"));
						result.setAnswers(rs.getString("answers"));
						results.add(result);
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return results;
	}

	private void showTestHistory(HttpServletResponse response, User user, List<Result> results) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("    <meta charset='UTF-8'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("    <title>Test History</title>");
		out.println(
				"    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("    <link rel='stylesheet' href='css/style.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("    <div class='container mt-5'>");
		out.println("        <div class='row justify-content-center'>");
		out.println("            <div class='col-md-10'>");
		out.println("                <div class='card shadow-lg'>");
		out.println(
				"                    <div class='card-header bg-info text-white d-flex justify-content-between align-items-center'>");
		out.println("                        <h2>Test History - " + user.getUsername() + "</h2>");
		out.println("                        <form action='dashboard' method='get' style='display:inline;'>");
		out.println("                            <button type='submit' class='btn btn-light btn-sm'>");
		out.println("                                <i class='fas fa-home'></i> Dashboard");
		out.println("                            </button>");
		out.println("                        </form>");
		out.println("                    </div>");
		out.println("                    <div class='card-body'>");

		if (results.isEmpty()) {
			out.println("                        <div class='text-center'>");
			out.println("                            <div class='alert alert-warning'>");
			out.println("                                <h4>No Test History Found</h4>");
			out.println(
					"                                <p>You haven't taken any quizzes yet. Start your first quiz now!</p>");
			out.println("                                <form action='quiz' method='get' style='display:inline;'>");
			out.println("                                    <button type='submit' class='btn btn-primary'>");
			out.println("                                        <i class='fas fa-play'></i> Start Quiz");
			out.println("                                    </button>");
			out.println("                                </form>");
			out.println("                            </div>");
			out.println("                        </div>");
		} else {
			// Calculate statistics
			int totalTests = results.size();
			int totalScore = results.stream().mapToInt(Result::getScore).sum();
			int totalQuestions = results.stream().mapToInt(Result::getTotalQuestions).sum();
			double averagePercentage = totalQuestions > 0 ? (double) totalScore / totalQuestions * 100 : 0;
			int bestScore = results.stream().mapToInt(r -> (int) ((double) r.getScore() / r.getTotalQuestions() * 100))
					.max().orElse(0);

			out.println("                        <div class='row mb-4'>");
			out.println("                            <div class='col-md-3'>");
			out.println("                                <div class='card bg-primary text-white text-center'>");
			out.println("                                    <div class='card-body'>");
			out.println("                                        <h4>" + totalTests + "</h4>");
			out.println("                                        <p>Total Tests</p>");
			out.println("                                    </div>");
			out.println("                                </div>");
			out.println("                            </div>");
			out.println("                            <div class='col-md-3'>");
			out.println("                                <div class='card bg-success text-white text-center'>");
			out.println("                                    <div class='card-body'>");
			out.println("                                        <h4>" + String.format("%.1f", averagePercentage)
					+ "%</h4>");
			out.println("                                        <p>Average Score</p>");
			out.println("                                    </div>");
			out.println("                                </div>");
			out.println("                            </div>");
			out.println("                            <div class='col-md-3'>");
			out.println("                                <div class='card bg-warning text-white text-center'>");
			out.println("                                    <div class='card-body'>");
			out.println("                                        <h4>" + bestScore + "%</h4>");
			out.println("                                        <p>Best Score</p>");
			out.println("                                    </div>");
			out.println("                                </div>");
			out.println("                            </div>");
			out.println("                            <div class='col-md-3'>");
			out.println("                                <div class='card bg-info text-white text-center'>");
			out.println("                                    <div class='card-body'>");
			out.println("                                        <h4>" + totalScore + "/" + totalQuestions + "</h4>");
			out.println("                                        <p>Total Correct</p>");
			out.println("                                    </div>");
			out.println("                                </div>");
			out.println("                            </div>");
			out.println("                        </div>");

			out.println("                        <div class='table-responsive'>");
			out.println("                            <table class='table table-striped table-hover'>");
			out.println("                                <thead class='table-dark'>");
			out.println("                                    <tr>");
			out.println("                                        <th>#</th>");
			out.println("                                        <th>Test Date</th>");
			out.println("                                        <th>Score</th>");
			out.println("                                        <th>Percentage</th>");
			out.println("                                        <th>Grade</th>");
			out.println("                                        <th>Action</th>");
			out.println("                                    </tr>");
			out.println("                                </thead>");
			out.println("                                <tbody>");

			for (int i = 0; i < results.size(); i++) {
				Result result = results.get(i);
				double percentage = (double) result.getScore() / result.getTotalQuestions() * 100;
				String grade = getGrade(percentage);
				String gradeClass = getGradeClass(percentage);

				out.println("                                    <tr>");
				out.println("                                        <td>" + (i + 1) + "</td>");
				out.println("                                        <td>"
						+ result.getTestDate().toString().substring(0, 19) + "</td>");
				out.println("                                        <td>" + result.getScore() + "/"
						+ result.getTotalQuestions() + "</td>");
				out.println(
						"                                        <td>" + String.format("%.1f", percentage) + "%</td>");
				out.println("                                        <td><span class='badge bg-" + gradeClass + "'>"
						+ grade + "</span></td>");
				out.println("                                        <td>");
				out.println(
						"                                            <button class='btn btn-sm btn-outline-primary' onclick='showDetails("
								+ result.getId() + ")'>");
				out.println("                                                <i class='fas fa-eye'></i> View Details");
				out.println("                                            </button>");
				out.println("                                        </td>");
				out.println("                                    </tr>");
			}

			out.println("                                </tbody>");
			out.println("                            </table>");
			out.println("                        </div>");
		}

		out.println("                        <div class='text-center mt-4'>");
		out.println("                            <div class='row'>");
		out.println("                                <div class='col-md-6 mb-2'>");
		out.println("                                    <form action='quiz' method='get' style='display:inline;'>");
		out.println(
				"                                        <button type='submit' class='btn btn-success btn-lg w-100'>");
		out.println("                                            <i class='fas fa-play'></i> Take New Quiz");
		out.println("                                        </button>");
		out.println("                                    </form>");
		out.println("                                </div>");
		out.println("                                <div class='col-md-6 mb-2'>");
		out.println("                                    <form action='logout' method='post' style='display:inline;'>");
		out.println(
				"                                        <button type='submit' class='btn btn-danger btn-lg w-100'>");
		out.println("                                            <i class='fas fa-sign-out-alt'></i> Logout");
		out.println("                                        </button>");
		out.println("                                    </form>");
		out.println("                                </div>");
		out.println("                            </div>");
		out.println("                        </div>");
		out.println("                    </div>");
		out.println("                </div>");
		out.println("            </div>");
		out.println("        </div>");
		out.println("    </div>");

		out.println("    <script>");
		out.println("        function showDetails(resultId) {");
		out.println("            alert('Detailed view will be implemented. Result ID: ' + resultId);");
		out.println("        }");
		out.println("    </script>");

		out.println(
				"    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js'></script>");
		out.println("    <script src='https://kit.fontawesome.com/a076d05399.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}

	private String getGrade(double percentage) {
		if (percentage >= 90)
			return "A+";
		else if (percentage >= 80)
			return "A";
		else if (percentage >= 70)
			return "B";
		else if (percentage >= 60)
			return "C";
		else if (percentage >= 50)
			return "D";
		else
			return "F";
	}

	private String getGradeClass(double percentage) {
		if (percentage >= 75)
			return "success";
		else if (percentage >= 50)
			return "warning";
		else
			return "danger";
	}
}