package state;

public class EveningState implements State {
	public void writeProgram(Work work) {
		if (work.isFinish()) {
			work.setState(new RestState());
			work.writeProgram();
		}
		else {
			if (work.getHour() < 21) {
				System.out.println("��ǰʱ�䣺" + work.getHour() + "�� �Ӱడ��ƣ������");
			}
			else {
				work.setState(new SleepingState());
				work.writeProgram();
			}
		}
	}
}
