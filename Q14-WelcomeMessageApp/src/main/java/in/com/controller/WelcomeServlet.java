/*
Question 14 : Create a Java servlet that reads the name of the user from a form and displays a
welcome message on the web page. The servlet should use the GET method to read
the input data from the user.
 */

package in.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set the response content type
		response.setContentType("text/html");

		// Get the user's name from the request parameters
		String name = request.getParameter("name");

		// Create the welcome message
		String message = "Welcome, " + name + "!";

		// Create the HTML response
		PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Welcome</title>");
        out.println("<style>");
        out.println("body {");
        out.println("    background-color: lightblue;");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    text-align: center;");
        out.println("}");
        out.println("h1 {");
        out.println("    color: green;");
        out.println("    font-size: 32px;");
        out.println("    margin-top: 50px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body>");
        out.println("</html>");
	}
}
