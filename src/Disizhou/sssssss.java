package Disizhou;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class sssssss {
	static String classname;
	static String url;
	static String user;
	static String password;

	static {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("lib\\shujuku");
			Properties properties = new Properties();
			properties.load(inputStream);
			classname = properties.getProperty("className");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public static void main(String[] args) {
		Connection connection = null;
		Statement createStatement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(classname);// 第一步，加载驱动。
			connection = DriverManager.getConnection(url, user, password);
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

			Final(connection, createStatement, resultSet);
		}

	}

	private static void Final(Connection connection, Statement createStatement, ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (createStatement != null) {
			try {
				createStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
