package Disanzhou;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

public class Properties1111 {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("lisi", "21");
		properties.setProperty("zhangsan", "23");
		System.out.println(properties);
		// 这个地方和键值对不一样，这个可以直接打印，而键值对必须
		// 封装成纸和盒子，然后遍历纸打印。
		Set<String> stringPropertyNames = properties.stringPropertyNames();// 相当于map里面的keySet
		for (String string : stringPropertyNames) {
			System.out.println(string);
			String value = properties.getProperty(string);
			System.out.println(value);
		}
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("ee");
			properties.load(fileReader);
			System.out.println(properties);
			fileWriter = new FileWriter("ss");// 一开始我让ss是空的
			properties.store(fileWriter, "ssssssss");// 第一项是要存储的位置，第二项是存储的数据
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				if (fileWriter != null) {
					try {
						fileWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("ddd");
			properties.load(inputStream);
			System.out.println(properties);
			outputStream = new FileOutputStream("sss");// 和上面一样都是空的
			properties.store(outputStream, "vvvvvv");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				if (outputStream != null) {
					try {
						outputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
