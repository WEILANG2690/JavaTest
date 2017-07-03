class car {
	String brand = "Java"; //brand 品牌

	public void drive() {
		System.out.println("Drive a" + brand + "car");
	}

}

public class TestEquals {

	public static void main(String[] args) {
		// car1:0x1234
		car car1 = new car();
		// car2:0x2345
		car car2 = new car();

		System.out.println("(car1==car2=)=" + (car1 == car2));
		System.out.println("(car1==car2=)=" + (car1.equals(car2)));
                
		// car1:0x1234 -> 0x2345
		car1 = car2;

		System.out.println("(car1==car2=)_2=" + (car1 == car2));
		System.out.println("(car1==car2=)_2=" + (car1.equals(car2)));
	}

}
