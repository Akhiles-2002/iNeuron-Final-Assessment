package in.com.main;

import java.util.List;
import java.util.Scanner;

import in.com.model.Employee;
import in.com.service.EmployeeServiceImpl;
import in.com.service.IEmployeeService;
import in.com.util.HibernateUtil;

public class MainApp {

	static {
		HibernateUtil.startUp();
	}

	public static void main(String[] args) {

		saveEmployee();  // To save the Employee record
		
		getAllRecords(); // To get All records

	}

	private static void getAllRecords() {
		IEmployeeService service = new EmployeeServiceImpl();
		List<Employee> allRecord = service.getAllRecords();
		allRecord.forEach((person) -> System.out.println(person));
	}

	private static void saveEmployee() {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Name      : ");
		String name = scanner.next();
		System.out.print("Enter the Age       : ");
		int age = scanner.nextInt();
		System.out.print("Enter the Address   : ");
		String address = scanner.next();

		Employee employee = new Employee();
		employee.setEname(name);
		employee.setEage(age);
		employee.setEaddress(address);

		IEmployeeService service = new EmployeeServiceImpl();
		String result = service.save(employee);
		if (result.equals("success")) {
			System.out.println("Record Inserted Successfully");
		} else {
			System.out.println("Record Insertion Failed");
		}
	}

}
