package agency;

public class Main {
	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl();
		jiaojiao.setName("���");
		Proxy daili = new Proxy(jiaojiao);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
