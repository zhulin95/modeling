package factorymethod;

public class UndergraduateFactory implements IFactory {
	public LeiFeng createLeiFeng() {
		return new Undergraduate();
	}
}
