class roommate {
	// Attribute_屬性
	private String name = "Mary";
	private int age = 18;

	// Method_方法
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

public class TestEncapsulationEX2 {

	public static void main(String[] args) {
		// new_實體化
		roommate SetAndGet = new roommate();

		SetAndGet.setName("Judy");
		String newName = SetAndGet.getName();
		System.out.println("NewRoomMateRoom" + newName);

		SetAndGet.setAge(20);
		int newAge = SetAndGet.getAge();
		System.out.println("NewRoomMateAge" + newAge);

	}

}
