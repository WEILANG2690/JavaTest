package WEILANG.JavaTest;

class A {
	public int add() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

public class TestMethodEX3 {

	public static void main(String[] args) {
		A test = new A();
		int value = test.add();
		System.out.println("value"+value);
	}

}
