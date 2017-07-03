class Fish {
	String name = "Nemo";

	public Fish() {// this占用,需建立給18行繼承
		super();
		System.out.println("default action");
	}

	public Fish(String name) {
		this.name = name;
	}

	 public void swim() {
	 System.out.println("I can swim+" + name);
	 }
}

class shark extends Fish {
	public shark() { // 建構子
		super("Dolly"); // 只能再建構子下第一行呼叫
	}
	public void action(){
		super.swim();
	}
}

public class TestSuperInheritance {

	public static void main(String[] args) {
		shark tigershark = new shark();
		tigershark.action();
		System.out.println("finished");
	}

}
