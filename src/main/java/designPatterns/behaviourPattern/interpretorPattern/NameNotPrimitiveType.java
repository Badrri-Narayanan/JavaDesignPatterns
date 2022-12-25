package designPatterns.behaviourPattern.interpretorPattern;

import java.util.List;
import java.util.stream.Collectors;

public class NameNotPrimitiveType implements Expression {

	@Override
	public String interpret(String context) {
		List<String> primitives = List.of("int", "char", "double", "boolean", "string", "float");
		final String comparableContext = context.toLowerCase();
		if(primitives.parallelStream().filter(type -> type.equals(comparableContext)).collect(Collectors.toList()).size() > 0)
			context = context + "1";
		
		return context;
	}

}
