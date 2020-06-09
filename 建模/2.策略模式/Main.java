package strategy;

public class Main {
	private static double total = 0;

    public static void main(String[] args) {
        consume("�����շ�", 1, 1000);
        consume("��300��100", 1, 1000);
        consume("��8��", 1, 1000);
        System.out.println("�ܼ�:" + total);
    }
    
    public static void consume(String type, int num, double price) {
        Context Context = null;
        
        if ("�����շ�".equals(type)) {
            Context = new Context(new Normal());
        }
        else if ("��300��100".equals(type)) {
            Context = new Context(new MoneyOff(100, 300));
        }
        else if ("��8��".equals(type)) {
            Context = new Context(new Discount(0.8));
        }

        double totalPrices = Context.charge(num * price);
        total += totalPrices;
        System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
    }
}
