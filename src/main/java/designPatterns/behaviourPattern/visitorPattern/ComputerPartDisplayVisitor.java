package designPatterns.behaviourPattern.visitorPattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	public void visit(Computer computer) {
		System.out.println("computer");
	}

	public void visit(Mouse mouse) {
		System.out.println("mouse");
	}

	public void visit(Keyboard keyboard) {
		System.out.println("keyboard");
	}

	public void visit(Monitor monitor) {
		System.out.println("monitor");
	}

	public void visit(CPU cpu) {
		System.out.println("cpu");
	}

}
