package state;

public class NoonState implements State {
	public void writeProgram(Work work) {
		if (work.getHour() < 13)
		{
			System.out.println("��ǰʱ�䣺" + work.getHour() + "�� ���ˣ��緹������������");
		}
		else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}
}
