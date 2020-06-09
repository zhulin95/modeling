package state;

public class AfternoonState implements State {
	public void writeProgram(Work work) {
		if (work.getHour() < 17) {
			System.out.println("��ǰʱ�䣺" + work.getHour() + "�� ����״̬����������Ŭ��");
		}
		else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}
}
