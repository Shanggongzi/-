package Disizhou;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Shujuku3 {
	private static String className;
	private static String url;
	private static String user;
	private static String password;
	static {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("lib\\shujuku");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
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
		className = properties.getProperty("className");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");

	}

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			Class.forName(className);
			connection = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM TEACHER WHERE NAME=? AND age=?;";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, "张三");
			prepareStatement.setLong(2, 123);
			resultSet = prepareStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println("成功");
			} else {
				System.out.println("失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Final(connection, prepareStatement, resultSet);
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
