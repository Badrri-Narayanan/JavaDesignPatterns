package designPatterns;

import designPatterns.behaviourPattern.visitorPattern.Computer;
import designPatterns.behaviourPattern.visitorPattern.ComputerPart;
import designPatterns.behaviourPattern.visitorPattern.ComputerPartDisplayVisitor;

public class App {
	public static void main(String[] args) {
		visitorPattern();
	}
	
	public static void visitorPattern() {
		ComputerPart computer = new Computer();
	    computer.accept(new ComputerPartDisplayVisitor());
	}
}
