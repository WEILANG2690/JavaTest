package tw.WEILANG.myporject.Arrays;

public class Test1DimensionEX3 {
	int[] data = { 5, 12, 7, 26, 3 };

	public void sortNumber() {
		for (int i = 0; i < data.length - 1; i++) { // i<data.length-1 = 比到不能比為止(倒數第二個)
													 
			for (int j = i + 1; j < data.length; j++) { // 取第一個到最後一個
				int temp = 0;
				if (data[i] < data[j]) { // EX:temp = 0 ,i = 1 ,j = 2
					temp = data[i]; // temp = 0>>>1 將右邊的值複製到左邊的變數
					data[i] = data[j]; // i = 1>>>2
					data[j] = temp; // j = temp == 2==0
				}
			}
		}
	}
    //Bidirectional/ Bubble Sort
	public void sortNumber2() {
		while (true) {
			int count = 0;

			for (int x = 0; x < data.length - 1; x++) { // i<data.length-1 = 比到不能比為止(倒數第二個)
				int temp = 0;
				if (data[x] < data[x + 1]) {
					temp = data[x];
					data[x + 1] = temp;
					count++;
				}
			}
			if (count == 0) { // count比大小算一次,沒有再繼續比下去時為 0
				break;
			}
		}
	}

	public void printResult() {
		for (int k = 0; k < data.length; k++) {
			System.out.printf("data[%d]=%d\n", k, data[k]);
		}
	}

	public static void main(String[] args) {
		Test1DimensionEX3 numberSort1 = new Test1DimensionEX3();
		numberSort1.sortNumber();
		numberSort1.printResult();
	}

}
