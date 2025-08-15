package com.quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.quiz.DatabaseConnection;
import com.quiz.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/quiz")
public class QuizServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("user") == null) {
			response.sendRedirect("login.html");
			return;
		}

		// Initialize quiz session
		List<Question> questions = getRandomQuestions();
		session.setAttribute("quizQuestions", questions);
		session.setAttribute("userAnswers", new HashMap<Integer, String>());
		session.setAttribute("currentQuestion", 0);
		session.setAttribute("quizStartTime", System.currentTimeMillis());

		showQuestion(request, response, 0);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("user") == null) {
			response.sendRedirect("login.html");
			return;
		}

		// Check if time limit exceeded (60 seconds)
		Long startTime = (Long) session.getAttribute("quizStartTime");
		if (startTime != null && (System.currentTimeMillis() - startTime) > 60000) {
			session.removeAttribute("quizQuestions");
			session.removeAttribute("userAnswers");
			session.removeAttribute("currentQuestion");
			session.removeAttribute("quizStartTime");

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println(
					"<script>alert('Time limit exceeded! Quiz ended.'); window.location.href='dashboard';</script>");
			return;
		}

		String action = request.getParameter("action");
		int currentQuestion = (Integer) session.getAttribute("currentQuestion");

		// Save current answer
		String answer = request.getParameter("answer");
		if (answer != null) {
			Map<Integer, String> userAnswers = (Map<Integer, String>) session.getAttribute("userAnswers");
			userAnswers.put(currentQuestion, answer);
			session.setAttribute("userAnswers", userAnswers);
		}

		if ("next".equals(action)) {
			if (currentQuestion < 3) {
				session.setAttribute("currentQuestion", currentQuestion + 1);
				showQuestion(request, response, currentQuestion + 1);
			} else {
				// Quiz completed
				response.sendRedirect("result");
			}
		} else if ("prev".equals(action)) {
			if (currentQuestion > 0) {
				session.setAttribute("currentQuestion", currentQuestion - 1);
				showQuestion(request, response, currentQuestion - 1);
			}
		} else if ("finish".equals(action)) {
			response.sendRedirect("result");
		}
	}

	private List<Question> getRandomQuestions() {
		List<Question> allQuestions = new ArrayList<>();

		try (Connection conn = DatabaseConnection.getConnection()) {
			String sql = "SELECT * FROM questions";

			try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {
					Question q = new Question();
					q.setId(rs.getInt("id"));
					q.setQuestionText(rs.getString("question_text"));
					q.setOptionA(rs.getString("option_a"));
					q.setOptionB(rs.getString("option_b"));
					q.setOptionC(rs.getString("option_c"));
					q.setOptionD(rs.getString("option_d"));
					q.setCorrectAnswer(rs.getString("correct_answer"));
					allQuestions.add(q);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Collections.shuffle(allQuestions);
		return allQuestions.subList(0, Math.min(4, allQuestions.size()));
	}

	private void showQuestion(HttpServletRequest request, HttpServletResponse response, int questionIndex)
			throws IOException {

		HttpSession session = request.getSession();
		List<Question> questions = (List<Question>) session.getAttribute("quizQuestions");
		Map<Integer, String> userAnswers = (Map<Integer, String>) session.getAttribute("userAnswers");
		Long startTime = (Long) session.getAttribute("quizStartTime");

		if (questions == null || questionIndex >= questions.size()) {
			response.sendRedirect("dashboard");
			return;
		}

		Question question = questions.get(questionIndex);
		String selectedAnswer = userAnswers.get(questionIndex);

		// Calculate remaining time
		long remainingTime = 60 - ((System.currentTimeMillis() - startTime) / 1000);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("    <meta charset='UTF-8'>");
		out.println("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		out.println("    <title>Quiz - Question " + (questionIndex + 1) + "</title>");
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
				"                    <div class='card-header bg-primary text-white d-flex justify-content-between'>");
		out.println("                        <h4>Question " + (questionIndex + 1) + " of 4</h4>");
		out.println("                        <div id='timer' class='badge bg-warning text-dark fs-6'>");
		out.println("                            Time: <span id='timeLeft'>" + remainingTime + "</span>s");
		out.println("                        </div>");
		out.println("                    </div>");
		out.println("                    <div class='card-body'>");
		out.println("                        <form action='quiz' method='post' id='quizForm'>");
		out.println("                            <div class='mb-4'>");
		out.println("                                <h5 class='mb-3'>" + question.getQuestionText() + "</h5>");
		out.println("                            </div>");
		out.println("                            <div class='mb-3'>");

		String[] options = { "A", "B", "C", "D" };
		String[] optionTexts = { question.getOptionA(), question.getOptionB(), question.getOptionC(),
				question.getOptionD() };

		for (int i = 0; i < options.length; i++) {
			String checked = options[i].equals(selectedAnswer) ? "checked" : "";
			out.println("                                <div class='form-check mb-2'>");
			out.println(
					"                                    <input class='form-check-input' type='radio' name='answer' id='option"
							+ options[i] + "' value='" + options[i] + "' " + checked + ">");
			out.println("                                    <label class='form-check-label' for='option" + options[i]
					+ "'>");
			out.println("                                        " + options[i] + ") " + optionTexts[i]);
			out.println("                                    </label>");
			out.println("                                </div>");
		}

		out.println("                            </div>");
		out.println("                            <div class='d-flex justify-content-between'>");
		out.println("                                <div>");

		if (questionIndex > 0) {
			out.println(
					"                                    <button type='submit' name='action' value='prev' class='btn btn-secondary'>");
			out.println("                                        <i class='fas fa-arrow-left'></i> Previous");
			out.println("                                    </button>");
		}

		out.println("                                </div>");
		out.println("                                <div>");

		if (questionIndex < 3) {
			out.println(
					"                                    <button type='submit' name='action' value='next' class='btn btn-primary'>");
			out.println("                                        Next <i class='fas fa-arrow-right'></i>");
			out.println("                                    </button>");
		} else {
			out.println(
					"                                    <button type='submit' name='action' value='finish' class='btn btn-success'>");
			out.println("                                        Finish Quiz <i class='fas fa-check'></i>");
			out.println("                                    </button>");
		}

		out.println("                                </div>");
		out.println("                            </div>");
		out.println("                        </form>");
		out.println("                    </div>");
		out.println("                </div>");
		out.println("            </div>");
		out.println("        </div>");
		out.println("    </div>");

		// JavaScript for timer
		out.println("    <script>");
		out.println("        let timeLeft = " + remainingTime + ";");
		out.println("        const timer = setInterval(function() {");
		out.println("            document.getElementById('timeLeft').textContent = timeLeft;");
		out.println("            timeLeft--;");
		out.println("            if (timeLeft < 0) {");
		out.println("                clearInterval(timer);");
		out.println("                alert('Time up! Quiz will be submitted automatically.');");
		out.println("                document.getElementById('quizForm').submit();");
		out.println("            }");
		out.println("        }, 1000);");
		out.println("    </script>");

		out.println(
				"    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js'></script>");
		out.println("    <script src='https://kit.fontawesome.com/a076d05399.js'></script>");
		out.println("</body>");
		out.println("</html>");
	}
}
