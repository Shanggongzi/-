package Disizhou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Shujuku2 {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement createStatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1711", "root", "123456");
			String string = "UPDATE teacher SET age=2 WHERE NAME='zhangsan';";
			createStatement = connection.createStatement();
			int executeUpdate = createStatement.executeUpdate(string);
			System.out.println(executeUpdate);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (createStatement != null) {
				createStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}

	}
}
