package easyfactory;

public class OperationSub extends Operation {
	public double getResult() {
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}
}
