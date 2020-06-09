package factorymethod;

public class Main {
	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();
		student.buyRice();
		student.sweep();
		student.wash();
		
		LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
		studentA.buyRice();

		LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋的大学生");
		studentB.sweep();
				
		LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋的大学生");
		studentC.wash();
	}
}
