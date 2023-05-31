/*
Question 13. : Create a Java program that connects to a PostgreSQL database and executes a
batch update. The program should read the input data from a file and insert it into the
database using JDBC batch updates. 
 */

package in.com.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcBatchUpdateThroughPostgreSql {
	private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/persons";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "root123";

	public static void main(String[] args) {
		String inputFile = "src/input.txt";

		try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
			// Disable auto-commit to enable batch updates
			conn.setAutoCommit(false);

			// Create a prepared statement with the INSERT query
			String insertQuery = "INSERT INTO employee (sname, sage, saddress) VALUES (?, ?, ?)";
			try (PreparedStatement pstmt = conn.prepareStatement(insertQuery);
					BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
				String line;
				while ((line = reader.readLine()) != null) {
					// Split the line into two values
					String[] values = line.split(",");

					// Set the values in the prepared statement
					pstmt.setString(1, values[0]);
					pstmt.setString(2, values[1]);
					pstmt.setString(3, values[2]);

					// Add the prepared statement to the batch
					pstmt.addBatch();
				}

				// Execute the batch update
				int[] updateCounts = pstmt.executeBatch();

				// Commit the changes
				conn.commit();

				// Print the number of rows affected for each statement
				for (int count : updateCounts) {
					System.out.println("Rows affected: " + count);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
