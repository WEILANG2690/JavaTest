class SecuritySystem {
	private String systemID = "mike", systemPW = "3345678";

	public boolean verifyID(String userID, String userPW) {
		if (systemID.equals(userID) && systemPW.equals(userPW)) {
			return true;
		}
		return false;
	}
}

public class TestEncapsulationEX3 {

	public static void main(String[] args) {
		SecuritySystem verify = new SecuritySystem();
		if(args.length>=2){
			boolean qwe =verify.verifyID(args[0],args[1]);
			System.out.println("status="+qwe);
		}
	}

}
