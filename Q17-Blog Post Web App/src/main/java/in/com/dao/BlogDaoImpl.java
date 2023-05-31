package in.com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.com.dto.BlogPost;
import in.com.util.JdbcUtil;

public class BlogDaoImpl implements IBlogDao {

	private Connection connection = null;
	private PreparedStatement pstmt = null;
	private ResultSet resultSet = null;
	private List<BlogPost> list = null;
	private String status = "fail";

	@Override
	public List<BlogPost> getAllBlogs() {
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				pstmt = connection.prepareStatement("select bid,title,description,content from blog");
			}
			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}
			if (resultSet != null) {
				list=new ArrayList<>();
				while (resultSet.next()) {
					BlogPost blogPost = new BlogPost();
					blogPost.setBlogId(resultSet.getInt("bid"));
					blogPost.setBlogTitle(resultSet.getString("title"));
					blogPost.setBlogDesc(resultSet.getString("description"));
					blogPost.setBlogContent(resultSet.getString("content"));
					list.add(blogPost);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public String createBlog(BlogPost blogPost) {

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				pstmt = connection.prepareStatement("Insert into blog (title,description,content) values (?,?,?)");
			}
			if (pstmt != null) {
				pstmt.setString(1, blogPost.getBlogTitle());
				pstmt.setString(2, blogPost.getBlogDesc());
				pstmt.setString(3, blogPost.getBlogContent());

				int rowAffected = pstmt.executeUpdate();

				if (rowAffected == 1) {
					status = "success";
					return status;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String subscription(String mailId) {
		
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				pstmt = connection.prepareStatement("insert into subscription (emailid) values (?)");
			}
			if (pstmt != null) {
				pstmt.setString(1, mailId);

				int rowAffected = pstmt.executeUpdate();

				if (rowAffected == 1) {
					status = "success";
					return status;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

		return status;
	}

}
