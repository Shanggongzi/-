package Disanzhou;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Duxiewenjian {
	public static void main(String[] args) {

		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("ee");
			fileWriter = new FileWriter("ss");
			// int a = fileReader.read();
			// System.out.println(a);
			char[] Buffer = new char[10];
			int length = 0;
			while ((length = fileReader.read(Buffer)) != -1) {
				fileWriter.write(Buffer, 0, length);
				System.out.println(length);
			}
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
