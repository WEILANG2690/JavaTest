package July04;

class A {
	class B {
		public void travel() {
			System.out.println("travel");
		}
	}

	public void processNested() {
		B b1 = new B();
		b1.travel();
	}

}

public class NestedClassesEX1 {

	public static void main(String[] args) {
		// 間接呼叫B
		A a1 = new A();
		a1.processNested();
		// 直接呼叫B
		A.B b2 = a1.new B();
		b2.travel();

	}

}
