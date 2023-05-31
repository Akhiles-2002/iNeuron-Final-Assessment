package in.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.dto.Student;
import in.com.service.IStudentService;
import in.com.servicefactory.StudentServiceFactory;

@WebServlet("/readdata")
public class ReadDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		
		IStudentService studentService = StudentServiceFactory.getStudentService();		
		Student student = new Student();
		student.setSid(id);
		
		student = studentService.readData(id);
		request.setAttribute("student", student);
		System.out.println(student);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./data.jsp");
		requestDispatcher.forward(request, response);
	
	}

}
