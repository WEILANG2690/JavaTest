class materoom {
	private String name = "mery";
	private int age =18;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		materoom setandget = new materoom();
		setandget.setName("judy");
		setandget.setAge(22);
		String newname = setandget.getName();
		int newage =setandget.getAge();
		System.out.println("newname=" + newname);
		System.out.println("newage=" + newage);
	}

}
