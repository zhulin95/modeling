package depend;

public class Dog extends Animal {
	public String getEat() {
		System.out.println("���Թ�ͷ");
        return super.getEat();
    }
	
	public String getDrink() {
		System.out.println("����ˮ");
        return super.getDrink();
    }
	
	public String getRun() {
		System.out.println("����������");
        return super.getRun();
    }
	
	public String getYell() {
		System.out.println("��������");
        return super.getYell();
    }
	
	void setEat(String eat) {
		System.out.println("���Թ�ͷ");
    }
	
	void setDrink(String drink) {
		System.out.println("����ˮ");
    }
	
	void setRun(String run) {
		System.out.println("����������");
    }
	
	void setYell(String yell) {
		System.out.println("��������");
    }
}
