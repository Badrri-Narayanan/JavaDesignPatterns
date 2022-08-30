package designPatterns.behaviourPattern.templatePattern;

public class Car extends Vehicle {

	public Car() {
		fillFuelTank();
	}
	
	private void fillFuelTank() {
		this.remainingFuel = 100;
	}
	
	@Override
	boolean checkFuel() {
		return this.remainingFuel > 0;
	}

	@Override
	boolean checkIfKeyInIngition() {
		System.out.println("Inserting key into the Ignition");
		return true;
	}

	@Override
	void startEngine() {
		System.out.println("Car Engine started!");
	}

}
