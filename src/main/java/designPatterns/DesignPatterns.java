package designPatterns;

import java.util.List;

import designPatterns.behaviourPattern.chainOfResponsiblityPattern.DocumentHandler;
import designPatterns.behaviourPattern.chainOfResponsiblityPattern.SlideshowDocumentHandler;
import designPatterns.behaviourPattern.chainOfResponsiblityPattern.SpreadsheetDocumentHandler;
import designPatterns.behaviourPattern.chainOfResponsiblityPattern.TextDocumentHandler;
import designPatterns.behaviourPattern.commandPattern.CommandPatternButton;
import designPatterns.behaviourPattern.commandPattern.Document;
import designPatterns.behaviourPattern.commandPattern.PrintCommand;
import designPatterns.behaviourPattern.commandPattern.SaveCommand;
import designPatterns.behaviourPattern.interpretorPattern.Expression;
import designPatterns.behaviourPattern.interpretorPattern.FirstLetterNotUnderscore;
import designPatterns.behaviourPattern.iteratorPattern.Iterator;
import designPatterns.behaviourPattern.iteratorPattern.LinkedList;
import designPatterns.behaviourPattern.mediatorPattern.Button;
import designPatterns.behaviourPattern.mediatorPattern.Fan;
import designPatterns.behaviourPattern.mediatorPattern.Mediator;
import designPatterns.behaviourPattern.mediatorPattern.PowerSupplier;
import designPatterns.behaviourPattern.observerPattern.CompanyWebsite;
import designPatterns.behaviourPattern.observerPattern.DevTeam;
import designPatterns.behaviourPattern.observerPattern.Observer;
import designPatterns.behaviourPattern.observerPattern.Passenger;
import designPatterns.behaviourPattern.observerPattern.QaTeam;
import designPatterns.behaviourPattern.observerPattern.Train;
import designPatterns.behaviourPattern.observerPattern.WebsiteStatus;
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
		System.out.println("Thanks for buying a new laptop from Lenovo");
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
	
	public static void mementoPattern() {
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
	
	public static void mediatorPattern() {
		Button button = new Button();
        Fan fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        
        Mediator mediator = new Mediator(button, fan, powerSupplier);
        
        button.setMediator(mediator);
        fan.setMediator(mediator);
        
        button.press();
        button.press();
  }
	
	public static void iteratorPattern() {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("India");
		list.add("Brazil");
		list.add("South Korea");
		
		Iterator<String> it1 = list.getIterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		list.pop();
		
		Iterator<String> it2 = list.getIterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
	
	public static void interpreterPattern() {
		String context = "_Int";
		Expression firstLetterNotUnderscore = new FirstLetterNotUnderscore();
		
		String result = firstLetterNotUnderscore.interpret(context);
		
		System.out.println(result);
	}
	
	public static void commandPattern() {
		CommandPatternButton saveButton = new CommandPatternButton("Save");
		CommandPatternButton printButton = new CommandPatternButton("Print");
		
		Document resume = new Document();
		
		saveButton.click(new SaveCommand(resume));
		printButton.click(new PrintCommand(resume));
	}
	
	public static void chainOfResponsibilityPattern() {
		DocumentHandler documentHandler = new SlideshowDocumentHandler(new SpreadsheetDocumentHandler(new TextDocumentHandler(null)));
		
		String documentName = "sample.xlsx";
		documentHandler.openDocument(documentName.split("\\.")[1]);
	}
}
