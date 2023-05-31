package in.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.dto.BlogPost;
import in.com.service.IBlogService;
import in.com.servicefactory.BlogServiceFactory;

@WebServlet("/createblog")
public class CreateBlogPostController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BlogPost blogPost = new BlogPost();
		blogPost.setBlogTitle(request.getParameter("title"));
		blogPost.setBlogDesc(request.getParameter("description"));
		blogPost.setBlogContent(request.getParameter("content"));

		IBlogService blogService = BlogServiceFactory.getBlogService();
		String result = blogService.createBlog(blogPost);

		request.setAttribute("result", result);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/createblog.jsp");
		requestDispatcher.forward(request, response);

	}

}
