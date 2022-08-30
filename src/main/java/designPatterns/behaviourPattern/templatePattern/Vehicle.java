package designPatterns.behaviourPattern.templatePattern;

public abstract class Vehicle {
	public int remainingFuel;
	
	abstract boolean checkFuel();
	abstract boolean checkIfKeyInIngition();
	abstract void startEngine();
	
	// Template Pattern method
	public void startVehicle() {
		if(checkFuel() && checkIfKeyInIngition()) {
			startEngine();
		} else {
			System.out.println("Unable to start");
		}
	}
}
