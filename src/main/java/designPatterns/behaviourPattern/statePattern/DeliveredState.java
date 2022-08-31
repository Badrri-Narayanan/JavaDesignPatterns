package designPatterns.behaviourPattern.statePattern;

public class DeliveredState implements PackageState {

	public void next(Package pkg) {
		pkg.setState(new RecievedState());
	}

	public void prev(Package pkg) {
		pkg.setState(new OrderedState());
	}

	public void printStatus() {
		System.out.println("The order has been placed. Delivery in progress.");
	}

}
