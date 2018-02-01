package Disanzhou;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copylei {
	public static void main(String[] args) {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("ee");
			fileWriter = new FileWriter("ss");
			int length = 0;
			char[] a = new char[10];
			while ((length = fileReader.read(a)) != -1) {
				fileWriter.write(a, 0, length);

			}
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
