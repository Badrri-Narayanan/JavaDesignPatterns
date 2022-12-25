package designPatterns.behaviourPattern.commandPattern;

public class CommandPatternButton {
	String displayName;
	
	public CommandPatternButton(String displayName) {
		super();
		this.displayName = displayName;
	}

	public void click(Command command) {
		command.execute();
	}
}
