package state;

public class SleepingState implements State {
	public void writeProgram(Work work) {
		System.out.println("��ǰʱ�䣺" + work.getHour() + "�� ����ס�ˣ�˯����");
	}
}
