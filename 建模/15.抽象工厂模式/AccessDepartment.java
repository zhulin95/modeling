package abstractfactory;

public class AccessDepartment implements IDepartment {
	public void insert(Department department) {
		System.out.println("��Access�и�Deaprtment������һ����¼");
	}

	public Department getDepartment(int id) {
		System.out.println("��Access�и���ID�õ�Deaprtment��һ����¼");
		return null;
	}
}
