package observe;

public class ConcreteSubject extends Subject {
	// ���屻�۲���״̬
	private String	subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}
	
	public void setSubjectState(String subjectState){
		this.subjectState = subjectState;
	}
}
