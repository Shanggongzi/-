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
			Class.forName(classname);// ��һ��������������
			connection = DriverManager.getConnection(url, user, password);
			// �ڶ������������Ӷ���
			String sql = "select * from teacher;";// ��������ִ��sql��䡣
			createStatement = connection.createStatement();// ���Ĳ�������statement.
			resultSet = createStatement.executeQuery(sql);// ���岽��ִ��sql��䡣���ǲ�ѯ����ResultSet�����ա�
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
