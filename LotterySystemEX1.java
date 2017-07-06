package July06;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class LotterySystemEX1 {

	public static void main(String[] args) {
		HashSet<Integer> number = new HashSet<Integer>();

		while (number.size() < 6) {
			int richnum = (int) (Math.random() * 42) + 1;
			System.out.println("richnum" + richnum);
			number.add(richnum);
		}
		System.out.println(number);
		
		TreeSet<Integer> set1 = new TreeSet<Integer>(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		set1.addAll(number);
		System.out.println(set1);
	}

}
