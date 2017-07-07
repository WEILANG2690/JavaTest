package July07;

import java.util.HashMap;
import java.util.LinkedList;

public class TrackRecordEX1 {
	public void record() {

		LinkedList<HashMap<String, Double>> line = new LinkedList<HashMap<String, Double>>();

		for (int i = 1; i <= 5; i++) {
			double x = Math.random() * 100;
			double y = Math.random() * 100;

			HashMap<String, Double> point = new HashMap<String, Double>();
			point.put("x", y);
			point.put("y", y);

			System.out.println(point);
		}
		System.out.println(line);
	}

	public static void main(String[] args) {
		TrackRecordEX1 record1 = new TrackRecordEX1();
		record1.record();
	}

}
