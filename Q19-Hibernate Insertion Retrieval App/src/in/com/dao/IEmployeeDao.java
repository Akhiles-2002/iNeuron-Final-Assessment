package in.com.dao;

import java.util.List;

import in.com.model.Employee;

public interface IEmployeeDao {
	
	List<Employee> getAllRecords();
	
	String save(Employee employee);

}
