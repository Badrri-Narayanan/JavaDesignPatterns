package designPatterns;

import designPatterns.behaviourPattern.templatePattern.Bicycle;
import designPatterns.behaviourPattern.templatePattern.Car;
import designPatterns.behaviourPattern.templatePattern.Vehicle;
import designPatterns.behaviourPattern.visitorPattern.Computer;
import designPatterns.behaviourPattern.visitorPattern.ComputerPart;
import designPatterns.behaviourPattern.visitorPattern.ComputerPartDisplayVisitor;
import designPatterns.creationalPattern.singletonPattern.SalaryAccount;

public class App {
	public static void main(String[] args) {
//		visitorPattern();
//		singletonPattern();
		templatePattern();
	}
	
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
}
