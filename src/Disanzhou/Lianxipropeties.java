package Disanzhou;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Lianxipropeties {
	public static void main(String[] args) {
		Properties properties = new Properties();
		// properties.setProperty("zhangsan", "23");
		// properties.setProperty("lisi", "21");
		// System.out.println(properties);
		// String property = properties.getProperty("zhangsan");
		// System.out.println(property);
		// Set<String> stringPropertyNames = properties.stringPropertyNames();
		// for (String string : stringPropertyNames) {
		// String value = properties.getProperty(string);
		// System.out.println(string);
		// System.out.println(value);
		//
		// }
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			// fileReader = new FileReader("ss");
			// properties.load(fileReader);
			// System.out.println(properties);
			fileWriter = new FileWriter("ssss");
			properties.store(fileWriter, "bb");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
