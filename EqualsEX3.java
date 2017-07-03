class SecuritySystem {
	private String systemID = "mike", systemPW = "3345678";

	public boolean verifyID(String userID, String userPW) {
		if (systemID.equals(userID) && systemPW.equals(userPW)) {
			return true;
		}
		return false;
	}

	public boolean verifyID2(String userID, String userPW) {
		// .equalsIgnoreCase 不區分大小寫
		// .trim 去空格
		if (systemID.equalsIgnoreCase(userID.trim()) && systemPW.equalsIgnoreCase(userPW.trim())) {
			return true;
		}
		return false;
	}
}

public class TestEncapsulationEX3 {

	public static void main(String[] args) {
		SecuritySystem verify = new SecuritySystem();
		if (args.length >= 2) {
			boolean abc = verify.verifyID(args[0], args[1]);// abc 變數名稱
			System.out.println("status=" + abc);
		}
	}

}
