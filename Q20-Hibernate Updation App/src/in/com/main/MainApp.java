package in.com.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import in.com.model.Employee;
import in.com.service.EmployeeServiceImpl;
import in.com.service.IEmployeeService;
import in.com.util.HibernateUtil;

public class MainApp {

	static {
		HibernateUtil.startUp();
	}

	public static void main(String[] args) throws IOException {

		updateEmployee(); // To save the person record

		getAllRecord(); // To get All records

	}

	private static void getAllRecord() {
		IEmployeeService service = new EmployeeServiceImpl();
		List<Employee> allRecord = service.getAllRecord();
		allRecord.forEach((person) -> System.out.println(person));
	}

	private static void updateEmployee() throws IOException {
		IEmployeeService service = new EmployeeServiceImpl();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Id  : ");
		String id = br.readLine();

		Employee employee = service.search(Integer.parseInt(id));
		if (employee != null) {
			Employee newEmployee = new Employee();

			newEmployee.setEid(employee.getEid());

			System.out.print("Your old name :: " + employee.getEname() + "\t\t Enter the Name  :: ");
			String name = br.readLine();
			if (name.equals("")) {
				newEmployee.setEname(employee.getEname());
			} else {
				newEmployee.setEname(name);
			}

			System.out.print("Your old age :: " + employee.getEage() + "\t\t Enter the Age :: ");
			String age = br.readLine();
			if (age.equals("")) {
				newEmployee.setEage(employee.getEage());
			} else {
				newEmployee.setEage(Integer.parseInt(age));
			}

			System.out.print("Your old address :: " + employee.getEaddress() + "\t\t Enter the Address :: ");
			String address = br.readLine();
			if (address.equals("")) {
				newEmployee.setEaddress(employee.getEaddress());
			} else {
				newEmployee.setEaddress(address);
			}

			String result = service.update(newEmployee);
			if (result.equals("success")) {
				System.out.println("Record updated successfully");
			} else {
				System.out.println("Record Not Updated Successfully");
			}
		} else {
			System.out.println("Record Not Found");
		}

	}

}
