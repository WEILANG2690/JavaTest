package July04;

class MyOwnExcetpion extends Exception {

	private static final long serialVersionUID = 1L;

	private String server = "Deel Blue";
	private int port = 80;
	private String errMsg = "System Error ";

	public MyOwnExcetpion(String server, int port, String errMsg) {
		this.server = server;
		this.port = port;
		this.errMsg = errMsg;
	}

	public void showInfo() {
		System.out.println("server" + server);
		System.out.println("port" + port);
		System.out.println("Error Message" + errMsg);
	}
}

public class UseMyOwnExceptionEX1 {

	public static void main(String[] args) {
		int code = 006;
		if (code % 2 == 0) {
			try {
				throw new MyOwnExcetpion("blade", 12345, "Unauthorized Access Intruder");
			} catch (MyOwnExcetpion e) {
				e.showInfo();
				// e.printStackTrace();// 查看錯誤的"Exceptions"
			}
		} else {
			System.out.println("歡迎進入本系統");
		}
	}

}
