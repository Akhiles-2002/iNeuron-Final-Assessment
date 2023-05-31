package in.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.dto.BlogPost;
import in.com.service.IBlogService;
import in.com.servicefactory.BlogServiceFactory;

@WebServlet("/viewblog")
public class ViewBlogController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IBlogService blogService = BlogServiceFactory.getBlogService();
		List<BlogPost> allBlogs = blogService.getAllBlogs();
		
		request.setAttribute("allBlogs", allBlogs);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/viewblog.jsp");
		requestDispatcher.forward(request, response);
	}

}
