package tw.WEILANG.myporject.Method;

class MethodEX4{
	public boolean addE(int count){
		for(int i=1;i<=10;i++){
			System.out.println("hi");
		}
		return true;
	}
}
public class TestMethodEX4 {

	public static void main(String[] args) {
		MethodEX4 yes = new MethodEX4();
		boolean status=yes.addE(10);
		System.out.println("status"+status);
	
if(status){
System.out.println("sucess");
}
}
}
