package state;

public class RestState implements State {
	public void writeProgram(Work work) {
		System.out.println("��ǰʱ�䣺" + work.getHour() + "�� �°�ؼ���");
	}
}
