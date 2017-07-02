package WEILANG.JavaTest;
class Calculator{
	public void plus(int x,int y){
		System.out.println("x+y="+(x+y));
	}
	public void minus(int a,int b){
		System.out.println("a-b="+(a-b));
	}
}
public class TestMethodEX2 {

	public static void main(String[] args) {
		Calculator casio = new Calculator();
		casio.plus(7, 7);
		casio.minus(7, 7);
		System.out.println("finished");
	}

}
