package factorymethod;

public class SimpleFactory {
	public static LeiFeng createLeiFeng(String type)
	{
		LeiFeng result = null;

		if ("ѧ�׷�Ĵ�ѧ��".equals(type))
		{
			result = new Undergraduate();
		}
		else if ("����־Ը��".equals(type))
		{
			result = new Volunteer();
		}

		return result;
	}
}
