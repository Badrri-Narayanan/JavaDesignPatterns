package designPatterns.behaviourPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyWebsite {
	private List<Observer> observers;
	
	private WebsiteStatus status;
	
	public CompanyWebsite() {
		this.observers = new ArrayList<Observer>();
		this.status = WebsiteStatus.DOWN;
	}
	
	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void setStatus(WebsiteStatus status) {
		this.status = status;
		notifyChangeToAll();
	}

	private void notifyChangeToAll() {
		for(Observer observer : this.observers) {
			observer.notifyChange(this.status);
		}
	}
}
