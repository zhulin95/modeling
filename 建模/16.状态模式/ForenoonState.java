package state;

public class ForenoonState implements State {
	public void writeProgram(Work work) {
		if (work.getHour() < 12) {
			System.out.println("��ǰʱ�䣺" + work.getHour() + "�� ���繤��������ٱ�");
		}
		else {
			work.setState(new NoonState());
			work.writeProgram();
		}
	}
}
