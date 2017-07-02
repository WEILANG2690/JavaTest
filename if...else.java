package WEILANG.JavaTest;

import java.util.Scanner;

public class TestNestedIfEx1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("請輸入一個數字");
		num = scn.nextInt();

		if (num >= 0) {
			System.out.println("這是一個正數");
			if (num % 2 == 0) {
				System.out.println("這是一個正偶數");
			} else {
				System.out.println("這是一個正基數");
			}
		} else {
			System.out.println("這是一個負數");
			if (num % 2 == 0) {
				System.out.println("這是一個負偶數");
			} else {
				System.out.println("這是一個負基數");
			}
		}

	}

}
