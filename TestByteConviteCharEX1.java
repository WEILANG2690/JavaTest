package July07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestByteConviteCharEX1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Please Input Your Message:(use Q or q to exit)");

		// InputStream is1 = System.in;
		// InputStreamReader isr1 = new InputStreamReader(is1);
		// BufferedReader br1 = new BufferedReader(isr1);

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String data;
		while ((data = br1.readLine()) != null) {
			if (data.equalsIgnoreCase("Q")) {
				br1.close();
				// isr1.close();
				// is1.close();

				System.out.println("see you next time");
				System.exit(-1);
			}
			System.out.println("data=" + data);
		}
		
	}

}
