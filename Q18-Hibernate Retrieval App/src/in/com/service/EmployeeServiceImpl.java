package in.com.service;

import java.util.List;

import in.com.dao.EmployeeDaoImpl;
import in.com.dao.IEmployeeDao;
import in.com.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public List<Employee> getAllRecords() {

		IEmployeeDao employeeDao = new EmployeeDaoImpl();
		return employeeDao.getAllRecords();
	}

}
