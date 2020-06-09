package strategy;

public class MoneyOff implements Charge {
	private double moneyoff = 0;
    private double bargain = 0;
    
    public MoneyOff(double moneyoff,double bargain) {
        this.moneyoff = moneyoff;
        this.bargain = bargain;
    }
    
    public double charge(double money) {
        if (money < money) {
        	return money;
        }
        else {
            return money = money - moneyoff;
        }
    }
}
