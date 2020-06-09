package strategy;

public class Context {
	Charge charge;
	
    public Context(Charge charge) {
        this.charge = charge;
    }
    
    public double charge(double money) {
        return charge.charge(money);
    }
}
