package tw.WEILANG.myporject.Wapper;

public class WapperClassEX1 {

	public static void main(String[] args) {
		String number = "12345";
		System.out.println(number + "+1=" + (number+1));
        
		Integer i1 = new Integer(number); //建立一個 new物件,轉換成"int型別
		int value1 = i1.intValue();  
		System.out.println("(value1+1)=" + (value1+1));
		
		int value2 = Integer.parseInt(number);//直接轉換成"int"型別
		System.out.println("(value2+2)=" + (value2+2));
		
		Integer num=6;
		int nums =6;
		System.out.println("num="+(num++));
		System.out.println("nums="+(++nums));
	}

}
