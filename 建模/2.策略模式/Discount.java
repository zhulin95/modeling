package strategy;

public class Discount implements Charge {
	private double discount =1;
	
    public Discount(double discount) {
    	this.discount = discount;
    }
    
    public double charge(double money) {
        return money = money * discount;
    }
}
