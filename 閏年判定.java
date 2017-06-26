
public class ElseIfElseEX3 {

	public static void main(String[] args) {
int month=2,year=1996;
if (month==1||month==3||month==5||month==7||month==8||month==11){
	System.out.print("This Month has 31 days");
}else if (month==4||month==6||month==9||month==10||month==12){
	System.out.print("This Month has 30 days");
}else if (month==2){
	if(year%4==0&&year%100!=0||year%400==0){
		System.out.println("This Month has 29 days");
	}else{
		System.out.println("This Month has 28 days");
	}
}
	}

}
