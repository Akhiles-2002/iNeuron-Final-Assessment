package in.com.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import in.com.model.Employee;
import in.com.util.HibernateUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	Session session = null;

	@Override
	public List<Employee> getAllRecords() {

		session = HibernateUtil.getSession();

		@SuppressWarnings("unchecked")
		Query<Employee> query = session.createQuery("from in.com.model.Employee");
		@SuppressWarnings("unused")
		List<Employee> list = query.list();

		return list;
	}

}
