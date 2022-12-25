package designPatterns.behaviourPattern.mediatorPattern;

public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void press() {
        mediator.press();
    }
	
	public Button() {
	}
}
