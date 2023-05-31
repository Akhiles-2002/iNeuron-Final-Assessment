package in.com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.com.dto.Student;
import in.com.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	private Connection connection = null;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet = null;
	private Student student;

	@Override
	public Student readData(Integer sid) {

		String sqlSelectQuery = "SELECT sid, sname, sage, saddress FROM student WHERE sid = ?";

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				preparedStatement = connection.prepareStatement(sqlSelectQuery);
			}

//			if (preparedStatement != null) {
//				preparedStatement.setInt(1, sid);
//			}

			if (preparedStatement != null) {
				preparedStatement.setInt(1, sid);
				resultSet = preparedStatement.executeQuery();
			}
			if (resultSet != null) {
				student = new Student();

				if (resultSet.next()) {
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));
					return student;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return student;
	}

}
