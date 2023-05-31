package in.com.service;

import java.util.List;

import in.com.dao.EmployeeDaoImpl;
import in.com.dao.IEmployeeDao;
import in.com.model.Employee;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public List<Employee> getAllRecord() {
		IEmployeeDao employeeDao = new EmployeeDaoImpl();
		return employeeDao.getAllRecord();
	}

	@Override
	public String update(Employee employee) {
		IEmployeeDao employeeDao = new EmployeeDaoImpl();
		return employeeDao.update(employee);
	}

	@Override
	public Employee search(Integer eid) {
		IEmployeeDao employeeDao = new EmployeeDaoImpl();
		return employeeDao.search(eid);
	}
}
