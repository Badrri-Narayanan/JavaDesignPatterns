package designPatterns.behaviourPattern.visitorPattern;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {

	public List<ComputerPart> parts;

	public Computer() {
		parts = new ArrayList<ComputerPart>();
		parts.add(new Mouse());
		parts.add(new Keyboard());
		parts.add(new Monitor());
		parts.add(new CPU());
	}

	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		for (ComputerPart part : parts) {
			part.accept(computerPartVisitor);
		}
	}

}
