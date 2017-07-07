package July07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStreamBuffEX2 {

	public static void main(String[] args) throws IOException {
		// FileInputStream fis1 = new FileInputStream("c:/temp/test/hello.txt");
		BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("c:/temp/test/hello.txt"));

		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("c:/temp/test/hello2.txt"));
		int data;
		while ((data = bis1.read()) != -1) {
			System.out.print((char) data);
			bos1.write(data);
		}
		bos1.flush();
		bis1.close();
		// fis1.close();
		bos1.close();
	}

}
