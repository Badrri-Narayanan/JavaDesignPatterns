package designPatterns.behaviourPattern.templatePattern;

public class Bicycle extends Vehicle {

	@Override
	boolean checkFuel() {
		return true;
	}

	@Override
	boolean checkIfKeyInIngition() {
		System.out.println("Unlocking saftey lock");
		return true;
	}

	@Override
	void startEngine() {
		System.out.println("Bicycle is now ready to start pedalling!!");
	}

}
