package designPatterns.behaviourPattern.statePattern;

public class OrderedState implements PackageState {

	public void next(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	public void prev(Package pkg) {
		System.out.println("The package is in its root state.");
	}

	public void printStatus() {
		System.out.println("The order has been placed.");
	}

}
