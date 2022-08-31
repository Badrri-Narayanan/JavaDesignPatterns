package designPatterns.behaviourPattern.strategyPattern;

public class Context implements Strategy {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int performOperation(int... a) {
		return this.strategy.performOperation(a);
	}
	
}
