package in.com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.com.model.Employee;
import in.com.util.HibernateUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	Session session = null;
	Transaction transaction = null;

	@Override
	public List<Employee> getAllRecords() {

		session = HibernateUtil.getSession();

		@SuppressWarnings("unchecked")
		Query<Employee> query = session.createQuery("from in.com.model.Employee");
		@SuppressWarnings("unused")
		List<Employee> list = query.list();

		return list;
	}

	@Override
	public String save(Employee employee) {

		boolean flag = false;
		String result = "fail";
		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				session.save(employee);
				flag = true;
				result = "success";
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
			} else {
				transaction.rollback();
			}
		}

		return result;

	}

}
