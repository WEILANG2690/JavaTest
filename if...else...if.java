package WEILANG.JavaTest;

import java.util.Scanner;

public class TestIfElseIfEx1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int month, year;

		System.out.println("請輸入月份");
		month = scn.nextInt();
		System.out.println("請輸入年份");
		year = scn.nextInt();
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("此月份有31天");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("此月份有30天");
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("此月份有29天");
			} else {
				System.out.println("此月份有28天");
			}
		
		}
	}

}
