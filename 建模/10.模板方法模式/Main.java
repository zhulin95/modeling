package modelmethod;

public class Main {
	public static void main(String[] args) {
		System.out.println("ѧ���׳����Ծ�");
		TestPaper studentA = new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();

		System.out.println("ѧ���ҳ����Ծ�");
		TestPaper studentB = new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}
}
