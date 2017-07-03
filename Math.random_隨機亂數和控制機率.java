package WEILANG.JavaTest;

public class TestIfElseWithDiceEx1 {

	public static void main(String[] args) {

		int lucknum = 1;
		int probability = 0;
		int count = 0;
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("num=" + num);
			if (num == lucknum) {
				probability++;
				if (probability == 2) {
					System.out.println("win");
					System.out.println("count=" + count);
					break;
				}

			} else {
				System.out.println("lose");
				count++;
			}
		}
	}
}
