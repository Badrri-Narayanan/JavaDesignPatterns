package designPatterns.behaviourPattern.strategyPattern;

public class AddOperation implements Strategy {

	public int performOperation(int... a) {
		int sum = 0;
		for(int num: a) {
			sum += num;
		}
		return sum;
	}

}
