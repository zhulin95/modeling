package easyfactory;

public class OperationDiv extends Operation {
	public double getResult() throws Exception {
		double result = 0;
		if (getNumberB() == 0) {
			throw new Exception("��������Ϊ0");
		}
		result = getNumberA() / getNumberB();
		return result;
	}
}
