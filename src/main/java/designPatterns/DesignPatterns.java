package designPatterns;

import java.util.List;

import designPatterns.behaviourPattern.observerPattern.Passenger;
import designPatterns.behaviourPattern.observerPattern.Train;
import designPatterns.behaviourPattern.statePattern.Package;
import designPatterns.behaviourPattern.strategyPattern.AddOperation;
import designPatterns.behaviourPattern.strategyPattern.Context;
import designPatterns.behaviourPattern.strategyPattern.MultiplyOperation;
import designPatterns.behaviourPattern.strategyPattern.SubtractOperation;
import designPatterns.behaviourPattern.templatePattern.Bicycle;
import designPatterns.behaviourPattern.templatePattern.Car;
import designPatterns.behaviourPattern.templatePattern.Vehicle;
import designPatterns.behaviourPattern.visitorPattern.Computer;
import designPatterns.behaviourPattern.visitorPattern.ComputerPart;
import designPatterns.behaviourPattern.visitorPattern.ComputerPartDisplayVisitor;
import designPatterns.creationalPattern.singletonPattern.SalaryAccount;

public class DesignPatterns {
	public static void visitorPattern() {
		ComputerPart computer = new Computer();
	    computer.accept(new ComputerPartDisplayVisitor());
	}
	
	private static void createSalaryAccount() {
		SalaryAccount salAcc = SalaryAccount.getInstance();
		salAcc.setAccountNumber(2351123);
		salAcc.setBankName("Canara Bank");
		salAcc.setAccountBalance(230000);
	}
	
	public static void singletonPattern() {
		createSalaryAccount();
		System.out.println(SalaryAccount.getInstance());
	}
	
	public static void templatePattern() {
		Vehicle car = new Car();
		car.startVehicle();
		Vehicle cycle = new Bicycle();
		cycle.startVehicle();
	}
	
	public static void strategyPattern() {
		Context context = new Context(new AddOperation());
		System.out.println(context.performOperation(4,5));
		
		context = new Context(new SubtractOperation());
		System.out.println(context.performOperation(10,4,2));
		
		context = new Context(new MultiplyOperation());
		System.out.println(context.performOperation(6,5,4,3,2));
	}
	
	public static void statePattern() {
		Package laptop = new Package();
		System.out.println("Thanks for buying a new laptop for Lenovo");
		laptop.printStatus();
		laptop.nextState();
		laptop.printStatus();
		laptop.nextState();
		laptop.printStatus();
		laptop.nextState();
	}
	
	public static void observerPattern() {
		Passenger barryAllen = new Passenger("Barry Allen", "Korattur", "Chennai Central");
		Passenger robertMartin = new Passenger("Robert Martin", "Avadi", "Basin bridge");
		
		Train pattabiramSuburban = new Train(List.of("Pattabiram", "Avadi", "Ambattur", "Korattur", "Perambur", "Basin bridge", "Chennai Central"));
		
		pattabiramSuburban.registerObserver(barryAllen);
		pattabiramSuburban.registerObserver(robertMartin);
		
		pattabiramSuburban.nextStation();
		pattabiramSuburban.nextStation();
		pattabiramSuburban.nextStation();
		pattabiramSuburban.nextStation();
		pattabiramSuburban.nextStation();
		pattabiramSuburban.nextStation();
		pattabiramSuburban.nextStation();
	}
}
