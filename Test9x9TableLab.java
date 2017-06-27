package tw.leonchen.myproject.lab;

public class Test9x9TableLab {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {

			int j = 1;
			while (j <= 9) {
				if ((i * j) < 10) {
					System.out.print(i + "x" + j + "= " + (i * j) + "\t");
				} else {
					System.out.print(i + "x" + j + "=" + (i * j) + "\t");
				}
				j++;
			}

			System.out.println();

			i++;
		}
	}

}
