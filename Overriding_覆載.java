class Person {
	public void jog() {
		System.out.println("jog slow");

	}

}

class child extends Person {
	public void jog() {
		System.out.println("jog fast");
	}
}

public class TestOverriding {

	public static void main(String[] args) {
		child mike = new child();
		mike.jog();

	}

}
