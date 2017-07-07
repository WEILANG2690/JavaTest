package July07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class TestMyPageEX1 {
	private String pageurl = "https://gnn.gamer.com.tw/9/149299.html";

	private void showmypage() throws IOException {
		URL url = new URL(pageurl);
		InputStream is = url.openStream();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw1 = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("c:/temp/test/myPage.html")));
		String data;
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
			bw1.write(data);
		}
		bw1.flush();
		bw1.close();
		br1.close();
	}

	public static void main(String[] args) throws IOException {
		TestMyPageEX1 page =new TestMyPageEX1();
		page.showmypage();
	}

}
