package designPatterns.behaviourPattern.commandPattern;

public class PrintCommand implements Command {
	
	Document document;

	public PrintCommand(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		document.print();
	}

}
