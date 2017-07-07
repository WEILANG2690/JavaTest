package July07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffReadWriteStringEX1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/hello"));

		BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/test/hello3"));

		String data;
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
			bw1.write(data);
		}
		bw1.close();
		br1.close();
	}

}
