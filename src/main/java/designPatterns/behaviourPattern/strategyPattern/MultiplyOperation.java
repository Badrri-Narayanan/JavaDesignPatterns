package designPatterns.behaviourPattern.strategyPattern;

public class MultiplyOperation implements Strategy {

	public int performOperation(int... a) {
		int mul = 1;
		for(int num: a) {
			mul *= num;
		}
		return mul;
	}

}
