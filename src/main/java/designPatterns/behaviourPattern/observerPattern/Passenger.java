package designPatterns.behaviourPattern.observerPattern;

public class Passenger implements TrainObserver {
	private String name;
	
	private String origin;
	private String destination;
	
	@Override
	public void notifyChange(Train train) {
		if(train.getCurrentStation().equals(origin)) {
			System.out.println(name + " getting into the train");
		} else if(train.getCurrentStation().equals(destination)) {
			train.deregisterObserver(this);
			System.out.println(name + " getting off the train");
		}
	}

	public Passenger(String name, String origin, String destination) {
		super();
		this.name = name;
		this.origin = origin;
		this.destination = destination;
	}
	
}
