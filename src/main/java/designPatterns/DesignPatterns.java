package designPatterns;

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
import designPatterns.behaviourPattern.observerPattern.CompanyWebsite;
import designPatterns.behaviourPattern.observerPattern.DevTeam;
import designPatterns.behaviourPattern.observerPattern.Observer;
import designPatterns.behaviourPattern.observerPattern.QaTeam;
import designPatterns.behaviourPattern.observerPattern.WebsiteStatus;
import designPatterns.behaviourPattern.statePattern.Package;

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
		System.out.println("Thanks for buying a new laptop from Lenovo");
		laptop.printStatus();
		laptop.nextState();
		laptop.printStatus();
		laptop.nextState();
		laptop.printStatus();
		laptop.nextState();
	}
	
	public static void observerPattern() {
		CompanyWebsite gartnerWebsite = new CompanyWebsite();
		
		Observer devTeam = new DevTeam();
		Observer qaTeam = new QaTeam();
		
		gartnerWebsite.subscribe(devTeam);
		gartnerWebsite.subscribe(qaTeam);
		
		System.out.println("WEBSITE STATE: Created new Website for Gartner and deploying the changes");
		gartnerWebsite.setStatus(WebsiteStatus.DEPLOYMENT_IN_PROGRESS);
		
		System.out.println("\nWEBSITE STATE: Gartner website is now live");
		gartnerWebsite.setStatus(WebsiteStatus.UP);
		
		System.err.println("\nWEBSITE STATE: Huge surge in number of user requests, unable to cope up. Server going down");
		gartnerWebsite.setStatus(WebsiteStatus.DOWN);
		
		System.out.println("\nWEBSITE STATE: Fixing the issue and re-deploying changes");
		gartnerWebsite.setStatus(WebsiteStatus.DEPLOYMENT_IN_PROGRESS);		
		
		System.out.println("WEBSITE STATE: The build was succussful");
		gartnerWebsite.setStatus(WebsiteStatus.UP);
	}
}
