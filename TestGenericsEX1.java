package July06;

class TestGenerics<T> {
	private T t1;

	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
}

public class TestGenericsEX1 {

	public static void main(String[] args) {
		TestGenerics<Integer> test1 = new TestGenerics<Integer>();
		test1.setT1(7);
		int value1 = test1.getT1();
		System.out.println("test1=" + value1);

		TestGenerics<Double> test2 = new TestGenerics<Double>();
		test2.setT1(3.14);
		double value2 = test2.getT1();
		System.out.println("test2=" + value2);
	}

}
