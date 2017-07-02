package WEILANG.JavaTest;

import java.util.Scanner;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int day;

		System.out.println("請輸入1-7");
		day = scn.nextInt();

		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("今天要上班");
			break;
		case 6:
		case 7:
			System.out.println("今天休息日");
			break;
		default:
			System.out.println("輸入錯誤");
		}
	}

}
