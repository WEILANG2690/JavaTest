package tw.WEILANG.myporject.Reference;

class Shirt {
	int price = 2000;
	char size = 'L';
}

public class TestReference {

	public static void main(String[] args) {
		Shirt myShirt = new Shirt();
		myShirt.price = 3000;
		myShirt.size = 'L';

		Shirt yourShirt = new Shirt();
		yourShirt.price = 5000;
		yourShirt.size = 'M';

		System.out.println("myShirt.price:" + myShirt.price + "\n" + "myShirt.size:" + myShirt.size);
		System.out.println("yourShirt.price:" + yourShirt.price + "\n" + "yourShirt.size:" + yourShirt.size);

		System.out.println("myShirt" + myShirt); //查詢"myShirt"記憶體分配位址
		System.out.println("yourShirt" + yourShirt);//查詢"yourShirt"記憶體分配位址

		yourShirt = myShirt;

		yourShirt.size = 'X';
		yourShirt.price = 6000;

		System.out.println("myShirt.price_1:" + myShirt.price + "\n" + "myShirt.size_1:" + myShirt.size);
		System.out.println("yourShirt.price_1:" + yourShirt.price + "\n" + "yourShirt.size_1:" + yourShirt.size);

	}

}
