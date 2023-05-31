package in.com.dao;

import java.util.List;

import in.com.dto.BlogPost;

public interface IBlogDao {

	List<BlogPost> getAllBlogs();

	String createBlog(BlogPost blogPost);

	String subscription(String mailId);

}
