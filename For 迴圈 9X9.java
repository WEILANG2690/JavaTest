package WEILANG.JavaTest;

public class TestFor {

	public static void main(String[] args) {
		public static void main(String[] args) {
			for (int i = 1; i <= 9; i++) { //回到外層迴圈時，內層迴圈從新開始
				for (int j = 1; j <= 9; j++) {
				System.out.printf("%dx%d=%2d\t",i,j,i*j);// %d 整數, %2d 2位
			}
			
	        System.out.println();
		}

	
	}

}
// 1x1=_1 1x2=_2 1x3_3 ... 1x9=_9 1x10=10=>false 輸出到最後"System.out.println();"換行
// 2x1=_2 2x2=_4 2x3_6 ... 2x9=18 2x10=20=>false 輸出到最後"System.out.println();"換行
// ...以此類推
