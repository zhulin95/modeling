package abstractfactory;

public class SqlServerUser implements IUser {
	public void insert(User user) {
		System.out.println("��SQL Server�и�User������һ����¼");
	}

	public User getUser(int id) {
		System.out.println("��SQL Server�и���ID�õ�User��һ����¼");
		return null;
	}
}
