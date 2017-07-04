package July04;

class cat {
	public void play() {
		System.out.println("play a ball");
	}

}

class kitty extends cat {

}

class dog {
	public void bark() {
		System.out.println("dog bark");
	}
}

public class UsingThrowExceptionWithMethodEX1 {
	public void processAction() throws ClassCastException, Exception {
		Object c1 = new kitty();
		dog d1 = (dog) c1;// 強制轉型
		d1.bark();

	}

	public static void main(String[] args) {
		UsingThrowExceptionWithMethodEX1 test = new UsingThrowExceptionWithMethodEX1();
		try {
			test.processAction();
		} catch (Exception e) {
			System.out.println("請聯絡廠商");
		}
	}

}
