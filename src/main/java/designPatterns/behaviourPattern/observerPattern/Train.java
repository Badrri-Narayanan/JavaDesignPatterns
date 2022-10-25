package designPatterns.behaviourPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Train {
	private String currentStation;
	private String nextStation;
	List<String> route;
	
	List<TrainObserver> observers;
	
	public Train(List<String> route) {
		this.route = route;
		currentStation = route.get(0);
		nextStation = route.get(1);
		observers = new ArrayList<TrainObserver>();
	}

	public void notifyChange() {
		for(int i=0; i< observers.size(); i++) {
			observers.get(i).notifyChange(this);
		}
	}
	
	public void nextStation() {
		if(!hasTrainReachedFinalHalt()) {
			System.out.println(String.format("Train going from %s to %s", currentStation, nextStation));
			currentStation = nextStation;
			if(!hasTrainReachedFinalHalt())
				nextStation = route.get(route.indexOf(nextStation)+1);
		} else {
			System.err.println("Train has reached final station");
		}
		notifyChange();
	}
	
	private boolean hasTrainReachedFinalHalt() {
		return currentStation.equals(route.get(route.size()-1));
	}
	
	public void registerObserver(TrainObserver observer) {
		observers.add(observer);
	}
	
	public void deregisterObserver(TrainObserver observer) {
		observers.remove(observer);
	}

	public String getCurrentStation() {
		return currentStation;
	}
}
