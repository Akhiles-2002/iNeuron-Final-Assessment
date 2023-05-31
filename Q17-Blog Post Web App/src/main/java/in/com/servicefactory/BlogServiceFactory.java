package in.com.servicefactory;

import in.com.service.BlogServiceImpl;
import in.com.service.IBlogService;

public class BlogServiceFactory {

	private static IBlogService blogService = null;

	private BlogServiceFactory() {

	}

	public static IBlogService getBlogService() {
		if (blogService == null) {
			blogService = new BlogServiceImpl();
		}
		return blogService;
	}

}
