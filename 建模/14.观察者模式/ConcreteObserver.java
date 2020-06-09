package observe;

public class ConcreteObserver extends Observer {
	private String name;
	private String observerState;
	private ConcreteSubject	subject;

	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}

	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("�۲���" + name + "����״̬��" + observerState);
	}

	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
}
