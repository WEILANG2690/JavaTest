package tw.WEILANG.myporject.Constructor;

public class TestConstructorEX1 {
//constructor
public TestConstructorEX1(String name){
System.out.println("my Constructor"+ name);
}
//method
	public void MethodEX1(){
		System.out.println("my Method");
}

	public static void main(String[] args) {
		TestConstructorEX1 Test1 = new TestConstructorEX1("Mom");//利用 new 呼叫
		Test1.MethodEX1();//利用 新建檔案"Test1"呼叫
		new TestConstructorEX1("Dad").MethodEX1();
		System.out.println("finished");
	}

}
