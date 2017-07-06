package July06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEX2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/hello.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/hello2.txt");
		//不會覆蓋原本的檔案
		//FileOutputStream fos2 = new FileOutputStream("c:/temp/test/hello2.txt",ture);
		int data;
		while ((data = fis1.read()) != -1) {
			System.out.print((char) data);
			fos1.write(data);
		}
		fos1.close();
		fis1.close();
	}

}
