package decorate;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("С��");
		
		System.out.println("��һ��װ�磺");
		
		Sneakers pqx = new Sneakers();
		BigTrouser kk = new BigTrouser();
		TShirts dtx = new TShirts();
		
		pqx.decorate(person);
		kk.decorate(pqx);
		dtx.decorate(kk);
		dtx.show();

		System.out.println("�ڶ���װ�磺");
		
		LeatherShoes px = new LeatherShoes();
		Tie ld = new Tie();
		Suit xz = new Suit();
		
		px.decorate(person);
		ld.decorate(px);
		xz.decorate(ld);
		xz.show();
	}
}
