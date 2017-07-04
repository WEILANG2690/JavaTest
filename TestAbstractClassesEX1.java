package July04;

abstract class Company {
	public abstract void CalFuel();

	public abstract void CalDistance();

	public static void processVehicle(Company corp) {
		corp.CalDistance();
		corp.CalFuel();
	}
}

class Truck extends Company {

	@Override
	public void CalFuel() {
		System.out.println("Truck calculates Fuel.");
	}

	@Override
	public void CalDistance() {
		System.out.println("Truck calculates Distance.");
	}

}

class Ship extends Company {

	@Override
	public void CalFuel() {
		System.out.println("Ship calculates Fuel.");
	}

	@Override
	public void CalDistance() {
		System.out.println("Ship calculates Distance.");
	}

}

public class TestAbstractClassesEX1 {

	public static void main(String[] args) {
		// Truck toyota = new Truck();
		// toyota.calFuel();
		// toyota.calDistance();
		//
		// Ship cargoShip = new Ship();
		// cargoShip.calFuel();
		// cargoShip.calDistance();

		// Company corp;
		//
		// corp = new Truck();
		// corp.calFuel();
		// corp.calDistance();
		//
		// corp = new Ship();
		// corp.calFuel();
		// corp.calDistance();

		// 多型
		Company.processVehicle(new Truck());
		Company.processVehicle(new Truck());
	}

}
