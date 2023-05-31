package in.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Get the session object
		HttpSession session = request.getSession(false);

		// Retrieve the user's name from the session
		String name = (String) session.getAttribute("name");

		// Set the response content type
		response.setContentType("text/html");

		// Generate the response HTML
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1>Welcome, " + name + "!</h1>");
		response.getWriter().println("<p>Your name has been stored in the session.</p>");
		response.getWriter().println("<a href=\"goodbye\">Go to Goodbye Page</a>");
		response.getWriter().println("</body></html>");

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);

	}

}
