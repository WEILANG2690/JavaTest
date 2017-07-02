package WEILANG.JavaTest;

public class TestConstructorEx1 {
	// constructor
	public TestConstructorEx1(String name) { // 需和類別名稱一樣
		System.out.println("constructor." + name);
	}

	// method
	public void play() {
		System.out.println("Play Game");

	}

	public static void main(String[] args) {
		TestConstructorEx1 test = new TestConstructorEx1("marry");
		test.play();

		new TestConstructorEx1("john").play();
		

	}

}
