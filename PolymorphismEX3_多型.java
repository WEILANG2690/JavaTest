class DoLaA {
	public void sleep() {
		//System.out.println("A Sleep");
	}
}

class DoLaB extends DoLaA {

	@Override
	public void sleep() {
		System.out.println("B Sleep");
	}

	public void jump() {
		System.out.println("B Jump");
	}
}

class DoLaC extends DoLaA {

	@Override
	public void sleep() {
		System.out.println("C Sleep");
	}

	public void jump() {
		System.out.println("C Jump");
	}
}

public class PolymorphismEX3 {
	public void action(DoLaA A) {

		if (A instanceof DoLaB) {
			DoLaB B1 = (DoLaB) A;
			B1.sleep();
			B1.jump();
		}
		if (A instanceof DoLaC) {
			DoLaC C1 = (DoLaC) A;
			C1.sleep();
			C1.jump();
		}
	}

	public static void main(String[] args) {
		PolymorphismEX3 D = new PolymorphismEX3();

		D.action(new DoLaB());
		D.action(new DoLaC());

	}

}
