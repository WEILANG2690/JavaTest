
public class Temperature {

	public static void main(String[] args) {
		float T = 30, index = 2;
		if (index == 1) {

			float C = (T - 32) * 5 / 9; // 攝氏 = (華氏-32)*5/9
			System.out.println("C=" + C);

		} else if (index == 2) {
			float F = (T * 9 / 5) + 32; // 華氏 = 攝氏*(9/5)+32
			System.out.println("F=" + F);

		} else {
			System.out.println("FINISHED");

		}
	}
}
