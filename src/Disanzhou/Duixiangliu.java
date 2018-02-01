package Disanzhou;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Duixiangliu {
	public static void main(String[] args) {
		Person person = new Person("gg", 2);
		OutputStream outputStream = null;

		ObjectOutputStream objectoutputStream = null;

		try {
			outputStream = new FileOutputStream("person");
			objectoutputStream = new ObjectOutputStream(outputStream);
			objectoutputStream.writeObject(person);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
		InputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			inputStream = new FileInputStream("person");
			objectInputStream = new ObjectInputStream(inputStream);
			Object object = objectInputStream.readObject();
			Person person2 = (Person) object;
			System.out.println(person2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}
}
