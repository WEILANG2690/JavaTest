package July04;

public class TestExceptionsEX1 {
	public void processExcept() {
		int[] data = { 1, 2, 3, 4, 5, 6 };
		try {
			for (int i = 0; i <= data.length; i++) {// 印了七個字元,陣列只有六個
				System.out.println("data[" + i + "]=" + data[i]);
			}
			// } catch (ArrayIndexOutOfBoundsException e) { // 抓取小範圍
			// System.out.println("發生錯誤 請聯絡廠商");
		} catch (Exception e) { // 抓取大範圍
			System.out.println("e=" + e);
			e.printStackTrace();// 查看錯誤的"Exceptions"
		}
	}

	public void processExcept2(int x, int y) {
		try {
			System.out.println("x/y=" + (x / y));
		} catch (ArithmeticException e) {
			System.out.println("e=" + e);
			System.exit(0);
		} finally { // 不管錯誤與否,一定會執行
			System.out.println("always excute here");
		}
	}

	public static void main(String[] args) {
		TestExceptionsEX1 except = new TestExceptionsEX1();
		except.processExcept2(6,0);
	}

}
