package in.com.dto;

import java.io.Serializable;

public class BlogPost implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer blogId;
	private String blogTitle;
	private String blogDesc;
	private String blogContent;

	public BlogPost() {
		System.out.println("Object Created.....");
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogDesc() {
		return blogDesc;
	}

	public void setBlogDesc(String blogDesc) {
		this.blogDesc = blogDesc;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	@Override
	public String toString() {
		return "BlogPost [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogDesc=" + blogDesc + ", blogContent="
				+ blogContent + "]";
	}
}
