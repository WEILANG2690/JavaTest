
public class TestEqualsEX2 {

	public static void main(String[] args) {
		// 0x1234
		// String str1 = new String("hello");
		// 0x2345
		// String str2 = new String("hello");

		// 0x3456
		// String str1 = "hello";
		// 0x2345
		// String str2 = new String("hello");

		// 0x3456
		String str1 = "hello";
		// 0x3456
		String str2 = "hello";

		System.out.println("str1==str2=" + (str1 == str2));
		System.out.println("str1.equals(str2)=" + (str1.equals(str2)));

	}

}
