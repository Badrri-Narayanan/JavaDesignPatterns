package designPatterns.behaviourPattern.visitorPattern;

public class CPU implements ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
