package Disanzhou;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zijieliu {
	public static void main(String[] args) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("aa.jpg");
			outputStream = new FileOutputStream("bb.jpg");
			byte[] buffer = new byte[1024];
			int length = 0;
			try {
				while ((length = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, length);
					System.out.println(length);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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

}
