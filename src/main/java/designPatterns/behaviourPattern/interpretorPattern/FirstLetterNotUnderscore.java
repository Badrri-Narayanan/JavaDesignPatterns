package designPatterns.behaviourPattern.interpretorPattern;

public class FirstLetterNotUnderscore implements Expression {
	Expression firstLetterIsLowerCase = new FirstLetterInLowerCase();
	
	@Override
	public String interpret(String context) {
		if(context.startsWith("_"))
			context = context.substring(1);
		return firstLetterIsLowerCase.interpret(context);
	}

}
