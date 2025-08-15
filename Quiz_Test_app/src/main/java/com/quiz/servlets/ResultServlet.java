package com.quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.quiz.DatabaseConnection;
import com.quiz.Question;
import com.quiz.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("user") == null) {
			response.sendRedirect("login.html");
			return;
		}

		User user = (User) session.getAttribute("user");
		List<Question> questions = (List<Question>) session.getAttribute("quizQuestions");
		Map<Integer, String> userAnswers = (Map<Integer, String>) session.getAttribute("userAnswers");

		if (questions == null || userAnswers == null) {
			response.sendRedirect("dashboard");
			return;
		}

		// Calculate score
		int score = 0;
		StringBuilder answersString = new StringBuilder();

		for (int i = 0; i < questions.size(); i++) {
			Question question = questions.get(i);
			String userAnswer = userAnswers.get(i);
			String correctAnswer = question.getCorrectAnswer();

			if (userAnswer != null && userAnswer.equals(correctAnswer)) {
				score++;
			}

			// Store answers for history
			answersString.append(question.getId()).append(":").append(userAnswer != null ? userAnswer : "N")
					.append(",");
		}

		// Save result to database
		saveResult(user.getId(), score, questions.size(), answersString.toString());

		// Display result
		showResult(response, user, questions, userAnswers, score);

		// Clear quiz session data
		session.removeAttribute("quizQuestions");
		session.removeAttribute("userAnswers");
		session.removeAttribute("currentQuestion");
		session.removeAttribute("quizStartTime");
	}

	private void saveResult(int userId, int score, int totalQuestions, String answers) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String sql = "INSERT INTO results (user_id, score, total_questions, answers) VALUES (?, ?, ?, ?)";

			try (PreparedStatement ps = conn.prepareStatement(sql)) {
				ps.setInt(1, userId);
				ps.setInt(2, score);
				ps.setInt(3, totalQuestions);
				ps.setString(4, answers);
				ps.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void showResult(HttpServletResponse response, User user, List<Question> questions,
			Map<Integer, String> userAnswers, int score) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		double percentage = (double) score / questions.size() * 100;
		String resultClass = percentage >= 75 ? "success" : percentage >= 50 ? "warning" : "danger";

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("    <meta charset='UTF-8'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("    <title>Quiz Results</title>");
		out.println(
				"    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("    <link rel='stylesheet' href='css/style.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("    <div class='container mt-5'>");
		out.println("        <div class='row justify-content-center'>");
		out.println("            <div class='col-md-10'>");
		out.println("                <div class='card shadow-lg'>");
		out.println("                    <div class='card-header bg-" + resultClass + " text-white text-center'>");
		out.println("                        <h2>Quiz Results</h2>");
		out.println("                    </div>");
		out.println("                    <div class='card-body'>");
		out.println("                        <div class='text-center mb-4'>");
		out.println("                            <h3>Congratulations, " + user.getUsername() + "!</h3>");
		out.println("                            <div class='alert alert-" + resultClass + " d-inline-block'>");
		out.println(
				"                                <h4>Your Score: " + score + " out of " + questions.size() + "</h4>");
		out.println("                                <h5>Percentage: " + String.format("%.1f", percentage) + "%</h5>");
		out.println("                            </div>");
		out.println("                        </div>");

		out.println("                        <div class='mb-4'>");
		out.println("                            <h5>Detailed Results:</h5>");

		for (int i = 0; i < questions.size(); i++) {
			Question question = questions.get(i);
			String userAnswer = userAnswers.get(i);
			String correctAnswer = question.getCorrectAnswer();
			boolean isCorrect = userAnswer != null && userAnswer.equals(correctAnswer);

			out.println("                            <div class='card mb-3 border-" + (isCorrect ? "success" : "danger")
					+ "'>");
			out.println("                                <div class='card-header bg-light'>");
			out.println("                                    <strong>Question " + (i + 1) + ":</strong> "
					+ question.getQuestionText());
			out.println("                                </div>");
			out.println("                                <div class='card-body'>");
			out.println("                                    <div class='row'>");
			out.println("                                        <div class='col-md-6'>");
			out.println("                                            <strong>Your Answer:</strong> ");
			if (userAnswer != null) {
				String userAnswerText = getOptionText(question, userAnswer);
				out.println("                                            <span class='badge bg-"
						+ (isCorrect ? "success" : "danger") + "'>");
				out.println("                                                " + userAnswer + ") " + userAnswerText);
				out.println("                                            </span>");
			} else {
				out.println(
						"                                            <span class='badge bg-secondary'>No Answer</span>");
			}
			out.println("                                        </div>");
			out.println("                                        <div class='col-md-6'>");
			out.println("                                            <strong>Correct Answer:</strong> ");
			String correctAnswerText = getOptionText(question, correctAnswer);
			out.println("                                            <span class='badge bg-success'>");
			out.println("                                                " + correctAnswer + ") " + correctAnswerText);
			out.println("                                            </span>");
			out.println("                                        </div>");
			out.println("                                    </div>");
			out.println("                                </div>");
			out.println("                            </div>");
		}

		out.println("                        </div>");

		out.println("                        <div class='text-center'>");
		out.println("                            <div class='row'>");
		out.println("                                <div class='col-md-3 mb-2'>");
		out.println("                                    <form action='quiz' method='get' style='display:inline;'>");
		out.println(
				"                                        <button type='submit' class='btn btn-primary btn-lg w-100'>");
		out.println("                                            <i class='fas fa-redo'></i> Take Quiz Again");
		out.println("                                        </button>");
		out.println("                                    </form>");
		out.println("                                </div>");
		out.println("                                <div class='col-md-3 mb-2'>");
		out.println("                                    <form action='history' method='get' style='display:inline;'>");
		out.println("                                        <button type='submit' class='btn btn-info btn-lg w-100'>");
		out.println("                                            <i class='fas fa-history'></i> View History");
		out.println("                                        </button>");
		out.println("                                    </form>");
		out.println("                                </div>");
		out.println("                                <div class='col-md-3 mb-2'>");
		out.println(
				"                                    <form action='dashboard' method='get' style='display:inline;'>");
		out.println(
				"                                        <button type='submit' class='btn btn-secondary btn-lg w-100'>");
		out.println("                                            <i class='fas fa-home'></i> Dashboard");
		out.println("                                        </button>");
		out.println("                                    </form>");
		out.println("                                </div>");
		out.println("                                <div class='col-md-3 mb-2'>");
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
		out.println(
				"    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js'></script>");
		out.println("    <script src='https://kit.fontawesome.com/a076d05399.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}

	private String getOptionText(Question question, String option) {
		switch (option) {
		case "A":
			return question.getOptionA();
		case "B":
			return question.getOptionB();
		case "C":
			return question.getOptionC();
		case "D":
			return question.getOptionD();
		default:
			return "Unknown";
		}
	}
}
