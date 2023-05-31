package in.com.main;

import java.util.List;

import in.com.model.Employee;
import in.com.service.EmployeeServiceImpl;
import in.com.service.IEmployeeService;

public class MainApp {

	public static void main(String[] args) {
		
		IEmployeeService service = new EmployeeServiceImpl();
		List<Employee> allRecords = service.getAllRecords();

		allRecords.forEach((employee) -> System.out.println(employee));

	}

}
