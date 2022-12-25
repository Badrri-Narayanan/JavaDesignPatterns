package designPatterns.behaviourPattern.interpretorPattern;

public class FirstLetterInLowerCase implements Expression {

	private Expression nameNotPrimitiveType = new NameNotPrimitiveType();

	@Override
	public String interpret(String context) {
		context = Character.toLowerCase(context.charAt(0)) + context.substring(1);
		return nameNotPrimitiveType.interpret(context);
	}

}
