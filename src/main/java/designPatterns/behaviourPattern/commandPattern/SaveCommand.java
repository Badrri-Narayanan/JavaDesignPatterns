package designPatterns.behaviourPattern.commandPattern;

public class SaveCommand implements Command {

	Document document;
	
	public SaveCommand(Document document) {
		this.document = document;
	}

	@Override
	public void execute() {
		document.save();
	}

}
