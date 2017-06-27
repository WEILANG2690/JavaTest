package WEILANG.JavaTest;

public class TestFor {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
			System.out.printf("%dx%d=%2d\t",i,j,i*j);// %d 整數, %2d 2位
		}
		
        System.out.println();
	}

}}
