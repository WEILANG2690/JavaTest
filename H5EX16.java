import java.util.Scanner;

public class H5EX16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int day;
		Scanner scn = new Scanner(System.in);
		//day = scn.nextInt();
		System.out.print("今天禮拜幾? ");
		day = scn.nextInt();

		switch (day) {
		case 1:
			System.out.println("今天要上班");
			break;
		case 2:
			System.out.println("今天要上班");
			break;
		case 3:
			System.out.println("今天要上班");
			break;
		case 4:
			System.out.println("今天要上班");
			break;
		case 5:
			System.out.println("今天要上班");
			break;
		case 6:
			System.out.println("今天要上班");
		case 7:
			System.out.println("今天休假");
			break;
		default:
			System.out.println("請輸入正確日期");
		}
	}

}
