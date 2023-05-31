package in.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.service.IBlogService;
import in.com.servicefactory.BlogServiceFactory;

@WebServlet("/subscription")
public class SubscriptionController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String emailId = request.getParameter("emailid");
		
		IBlogService blogService = BlogServiceFactory.getBlogService();
		String subscription = blogService.subscription(emailId);
		
		request.setAttribute("subscription", subscription);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/landing.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
