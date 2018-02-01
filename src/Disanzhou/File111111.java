package Disanzhou;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class File111111 {
	public static void main(String[] args) throws IOException {
		String name = "dgdh.txt";
		String data = "dfgsfgsd";
		String readFileToString = FileUtils.readFileToString(new File("ee"));
		System.out.println(readFileToString);
		FileUtils.writeStringToFile(new File("ddd"), data);
		String extension = FilenameUtils.getExtension(name);
		System.out.println(extension);
		FileUtils.copyFile(new File("aa.jpg"), new File("cc.jpg"));// ¸´ÖÆcc
		FileUtils.deleteQuietly(new File("cc.jpg"));// É¾³ýcc
		String name2 = FilenameUtils.getName(name);
		System.out.println(name2);

	}
}
