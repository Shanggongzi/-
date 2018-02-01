package Disizhou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Shujuku {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement createStatement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// 第一步，加载驱动。
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1711", "root", "123456");
			// 第二步，创建连接对象。
			String sql = "select * from teacher;";// 第三步，执行sql语句。
			createStatement = connection.createStatement();// 第四步，创建statement.
			resultSet = createStatement.executeQuery(sql);// 第五步，执行sql语句。这是查询，用ResultSet来接收。
			List<Teachershujuku> list = new ArrayList<Teachershujuku>();//
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				Teachershujuku teacher = new Teachershujuku(id, name, age);
				list.add(teacher);
			}
			for (Teachershujuku teachershujuku : list) {
				System.out.println(teachershujuku);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (createStatement != null) {
				createStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}
}
