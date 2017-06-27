package WEILANG.JavaTest;

public class Test9x9TableLab {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 8) {
				System.out.print(i + "x" + j + "=" + (i * j)+"\t" );
				j++;//遞增+1
			}
			System.out.println(i + "x" + j + "=" + (i * j)+"\t" );
			i++;//遞增+1
		}
		
		
	}
}
