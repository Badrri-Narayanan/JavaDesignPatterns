package designPatterns.behaviourPattern.mediatorPattern;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public Fan(Mediator mediator, boolean isOn) {
		super();
		this.mediator = mediator;
		this.isOn = isOn;
	}

	public void turnOff() {
        isOn = false;
        mediator.stop();
    }
	
	public Fan() {
	}
}
