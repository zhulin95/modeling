package factorymethod;

public class Main {
	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();
		student.buyRice();
		student.sweep();
		student.wash();
		
		LeiFeng studentA = SimpleFactory.createLeiFeng("ѧ�׷�Ĵ�ѧ��");
		studentA.buyRice();

		LeiFeng studentB = SimpleFactory.createLeiFeng("ѧ�׷�Ĵ�ѧ��");
		studentB.sweep();
				
		LeiFeng studentC = SimpleFactory.createLeiFeng("ѧ�׷�Ĵ�ѧ��");
		studentC.wash();
	}
}
