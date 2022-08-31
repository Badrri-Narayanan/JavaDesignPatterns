package designPatterns.behaviourPattern.statePattern;

public class RecievedState implements PackageState {

	public void next(Package pkg) {
		System.out.println("The packed has been recieved by the customer");
	}

	public void prev(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	public void printStatus() {
		System.out.println("Package recieved successfully!");
	}

}
