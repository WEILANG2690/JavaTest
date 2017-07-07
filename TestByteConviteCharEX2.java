package July07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteConviteCharEX2 {

	public static void main(String[] args) throws IOException {

		System.out.println("Please Input Your Message:(use Q or q to exit)");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1 = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("c:/temp/test/hello3.txt")));

		String data;
		
		while ((data = br1.readLine()) != null) {
			if (data.equalsIgnoreCase("Q")) {
				bw1.flush();
				bw1.close();
				br1.close();

				System.out.println("see you next time");
				System.exit(-1);
			}
			System.out.println("data=" + data);
			bw1.write(data);
			bw1.newLine();
		}

	}

}
