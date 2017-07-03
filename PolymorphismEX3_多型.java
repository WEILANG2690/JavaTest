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
	public void action(DoLaA D) {

		if (D instanceof DoLaB) {
			DoLaB B1 = (DoLaB) D;
			B1.sleep();
			B1.jump();
		}
		if (D instanceof DoLaC) {
			DoLaC C1 = (DoLaC) D;
			C1.sleep();
			C1.jump();
		}
	}

	public static void main(String[] args) {
		PolymorphismEX3 A = new PolymorphismEX3();

		A.action(new DoLaB());
		A.action(new DoLaC());

	}

}
