package abstractfactory;

public class AccessUser implements IUser {
	public void insert(User user) {
		System.out.println("��Access�и�User������һ����¼");
	}

	public User getUser(int id) {
		System.out.println("��Access�и���ID�õ�User��һ����¼");
		return null;
	}
}
