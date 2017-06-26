package tw.WEILANG.myporject.flowcontrol;

import java.util.Scanner;

public class AccountEX2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String InUserID, InUserPW;
		String UserID = "123", UserPW = "456";
		System.out.println("請輸入帳號");
		InUserID = in.nextLine();
		while(true){
		System.out.println("請輸入密碼");
		InUserPW = in.nextLine();
		if (InUserID.equals(UserID) &&InUserPW.equals(UserPW)) {
			System.out.println("登入成功");
			break;
		} else {
			System.out.println("登入失敗");
			break;
		}
	}

}}
