package July04;

abstract class Dinosaur{
	public abstract void attack();
	public abstract void jump();
	public abstract void search();
}

//class Trex extends Dinosaur{
//
//	@Override
//	public void attack() {
//		System.out.println("speedup and attack.");
//	}
//
//	@Override
//	public void jump() {
//		System.out.println("jumps 3 feet.");
//	}
//
//	@Override
//	public void search() {
//		System.out.println("search for hunt.");
//	}
//	
//}

public class NestedClassesEx3 {

	public static void main(String[] args) {
//		Trex t1 = new Trex();
//		t1.search();
//		t1.jump();
//		t1.attack();
		
//		new Dinosaur(){
//
//			@Override
//			public void attack() {
//				System.out.println("speedup and attack something.");
//			}
//
//			@Override
//			public void jump() {
//				System.out.println("jumps 5 feet.");
//			}
//
//			@Override
//			public void search() {
//				System.out.println("search for hunt animal.");
//			}
//			
//		}.attack();
		
		Dinosaur d1 = new Dinosaur(){

			@Override
			public void attack() {
				System.out.println("speedup and attack something.");
			}

			@Override
			public void jump() {
				System.out.println("jumps 5 feet.");
			}

			@Override
			public void search() {
				System.out.println("search for hunt animal.");
			}
			
		};
		
		d1.search();
		d1.jump();
		d1.attack();
	}

}

