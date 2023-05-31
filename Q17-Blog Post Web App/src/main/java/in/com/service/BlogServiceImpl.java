package in.com.service;

import java.util.List;

import in.com.dao.BlogDaoImpl;
import in.com.dao.IBlogDao;
import in.com.daofactory.BlogDaoFactory;
import in.com.dto.BlogPost;
import in.com.servicefactory.BlogServiceFactory;

public class BlogServiceImpl implements IBlogService {

	private IBlogDao blogDao = null;

	@Override
	public List<BlogPost> getAllBlogs() {
		blogDao = BlogDaoFactory.getBlogDao();
		return blogDao.getAllBlogs();
	}

	@Override
	public String createBlog(BlogPost blogPost) {
		blogDao = BlogDaoFactory.getBlogDao();
		return blogDao.createBlog(blogPost);
	}

	@Override
	public String subscription(String mailId) {
		blogDao = BlogDaoFactory.getBlogDao();
		return blogDao.subscription(mailId);
	}

}
