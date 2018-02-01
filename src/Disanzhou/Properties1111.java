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
		// ����ط��ͼ�ֵ�Բ�һ�����������ֱ�Ӵ�ӡ������ֵ�Ա���
		// ��װ��ֽ�ͺ��ӣ�Ȼ�����ֽ��ӡ��
		Set<String> stringPropertyNames = properties.stringPropertyNames();// �൱��map�����keySet
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
			fileWriter = new FileWriter("ss");// һ��ʼ����ss�ǿյ�
			properties.store(fileWriter, "ssssssss");// ��һ����Ҫ�洢��λ�ã��ڶ����Ǵ洢������
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
			outputStream = new FileOutputStream("sss");// ������һ�����ǿյ�
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
