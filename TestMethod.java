package WEILANG.JavaTest;

class Person {
	public void sayHello() {
		System.out.println("Hola");
	}
	public void sayBye(){
		System.out.println("Adios");
	}
}

public class TestMethod {

	public static void main(String[] args) {
		Person mike = new Person();
		
		mike.sayHello();
		mike.sayBye();
		System.out.print("Finished");
	}

}
