package depend;

public class Dog extends Animal {
	public String getEat() {
		System.out.println("¹·³Ô¹ÇÍ·");
        return super.getEat();
    }
	
	public String getDrink() {
		System.out.println("¹·ºÈË®");
        return super.getDrink();
    }
	
	public String getRun() {
		System.out.println("¹·ËÄÌõÍÈÅÜ");
        return super.getRun();
    }
	
	public String getYell() {
		System.out.println("¹·ÍôÍô½Ğ");
        return super.getYell();
    }
	
	void setEat(String eat) {
		System.out.println("¹·³Ô¹ÇÍ·");
    }
	
	void setDrink(String drink) {
		System.out.println("¹·ºÈË®");
    }
	
	void setRun(String run) {
		System.out.println("¹·ËÄÌõÍÈÅÜ");
    }
	
	void setYell(String yell) {
		System.out.println("¹·ÍôÍô½Ğ");
    }
}
