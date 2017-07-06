package July06;

import java.util.ArrayList;

public class TestArrayList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add("mary");
		list1.add("mary");
		list1.add("john");
		list1.add(6);
		list1.add(new Integer(6));
		list1.add(3.14);

		list1.remove("john"); // 刪除
		list1.set(0, "jacky");// 修改
		// list1.size();
		// list1.contains()
		System.out.println("list1" + list1);
		System.out.println("size:" + list1.size()); // 查詢有多少字元
		System.out.println("list1.contains('mary')" + list1.contains("mary"));// 查詢是否有這字串

	}

}