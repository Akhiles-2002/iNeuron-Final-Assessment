/*
Question 11 : Write a Java program that connects to a MySQL database using JDBC. The program
should read data from a table and display the results in the console.
*/

package in.com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLJDBCExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/person";
		String username = "root";
		String password = "root123";

		try {
			// Step 1: Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2: Establish the connection to the database
			Connection connection = DriverManager.getConnection(url, username, password);

			// Step 3: Create a statement
			Statement statement = connection.createStatement();

			// Step 4: Execute the query
			String query = "SELECT sid, sname, sage, saddress FROM student";
			ResultSet resultSet = statement.executeQuery(query);

			// Step 5: Process the results
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				String address = resultSet.getString(4);

				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + "Address : " + address);
			}

			// Step 6: Clean up resources
			resultSet.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to connect to the database");
			e.printStackTrace();
		}
	}
}
