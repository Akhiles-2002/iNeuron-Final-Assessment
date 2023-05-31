package in.com.dao;

import java.util.List;

import in.com.model.Employee;

public interface IEmployeeDao {
	
	List<Employee> getAllRecord();

	String update(Employee employee);
	
	Employee search(Integer eid);

}
