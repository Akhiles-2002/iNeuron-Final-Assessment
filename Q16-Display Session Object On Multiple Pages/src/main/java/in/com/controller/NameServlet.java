package in.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/name")
public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Retrieve the user's name from the request parameters
        String name = request.getParameter("name");
        
        // Get or create a session object for the user
        HttpSession session = request.getSession(true);
        
        // Store the user's name in the session object
        session.setAttribute("name", name);
        
        // Redirect the user to the welcome page
        response.sendRedirect("welcome");
		
	}

}
