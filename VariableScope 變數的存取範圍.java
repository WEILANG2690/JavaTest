package tw.WEILANG.myporject.VariableScope;

public class TestVariableScope {
	
	
	//l
	

	int a = 1;// instance variable 宣告在"class"與"method"之間的變數

	static int b = 2;// static variable 宣告在"class"與"method"之間的變數

	public void f1(int c) { // local varible 宣告在方法內的變數

		int d = 4;// local varible 宣告在方法內的變數
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
	}

	public static void f2(int e) {// local variable
		
		// System.out.println("a1=" + a); //compile error
		System.out.println("b1=" + b);
		// System.out.println("c1=" + c); //compile error
		// System.out.println("d1=" + d); //compile error
		System.out.println("e1=" + e);
	}

	public static void main(String[] args) {
		TestVariableScope scope = new TestVariableScope();
		scope.f1(3);
		scope.f2(6);// "static" 呼叫方法
		TestVariableScope.f2(6);// "static" 呼叫方法
		f2(6);// "static" 呼叫方法
	}

}
