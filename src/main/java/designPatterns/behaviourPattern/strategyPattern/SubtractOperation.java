package designPatterns.behaviourPattern.strategyPattern;

public class SubtractOperation implements Strategy {

	public int performOperation(int... a) {
		int sub = a[0];
		for(int i=1; i<a.length; i++) {
			sub = sub - a[i];
		}
		return sub;
	}

}
