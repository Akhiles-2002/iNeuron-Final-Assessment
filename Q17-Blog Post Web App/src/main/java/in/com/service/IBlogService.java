package in.com.service;

import java.util.List;

import in.com.dto.BlogPost;

public interface IBlogService {

	List<BlogPost> getAllBlogs();

	String createBlog(BlogPost blogPost);

	String subscription(String mailId);

}
