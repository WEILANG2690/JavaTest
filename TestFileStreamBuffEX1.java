package July07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileStreamBuffEX1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/hello.txt");
		BufferedInputStream bis1 = new BufferedInputStream(fis1);

		int data;
		while ((data = bis1.read()) != -1) {
			System.out.print((char)data);
		}
		
		bis1.close();
		fis1.close();
	}

}
