package designPatterns.behaviourPattern.visitorPattern;

public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}
