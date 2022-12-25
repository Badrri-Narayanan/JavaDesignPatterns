package designPatterns.behaviourPattern.mediatorPattern;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public PowerSupplier getPowerSupplier() {
		return powerSupplier;
	}

	public void setPowerSupplier(PowerSupplier powerSupplier) {
		this.powerSupplier = powerSupplier;
	}

	public Mediator(Button button, Fan fan, PowerSupplier powerSupplier) {
		super();
		this.button = button;
		this.fan = fan;
		this.powerSupplier = powerSupplier;
	}

	public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
    
    public Mediator() {
	}
    
}
