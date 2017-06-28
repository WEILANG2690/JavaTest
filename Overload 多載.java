package tw.WEILANG.myporject.Overload;

public class TestOverloadEX1 {
	

	public  void plus(int  x1, int  y1 ){ //int 型別
	System.out.println("x1+y1="+(x1+y1));
}
	public void plus(double x2,double y2){ //double 型別
		System.out.println("x2+y2="+(x2+y2));
	}

	public static void main(String[] args) {
		TestOverloadEX1 test1 = new TestOverloadEX1();
test1.plus(3,14);
test1.plus(3.14, 3.14);

	}

}
