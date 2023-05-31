package in.com.daofactory;

import in.com.dao.BlogDaoImpl;
import in.com.dao.IBlogDao;

public class BlogDaoFactory {

	private static IBlogDao blogDao = null;

	private BlogDaoFactory() {

	}

	public static IBlogDao getBlogDao() {
		if (blogDao == null) {
			blogDao = new BlogDaoImpl();
		}
		return blogDao;
	}

}
