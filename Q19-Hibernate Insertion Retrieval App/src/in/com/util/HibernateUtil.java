package in.com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.com.model.Employee;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	static {
		sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
	}

	private HibernateUtil() {
		// TODO Auto-generated constructor stub
	}

	public static Session getSession() {
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

	public static void closeSession() {
		if (session != null) {
			session.close();
		}
	}
	
	public static void  startUp() {
		System.out.println("Hibernate Started......\n");
	}

}
