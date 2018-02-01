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
			Class.forName("com.mysql.jdbc.Driver");// ��һ��������������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1711", "root", "123456");
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
