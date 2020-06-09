package strategy;

public class Main {
	private static double total = 0;

    public static void main(String[] args) {
        consume("正常收费", 1, 1000);
        consume("满300返100", 1, 1000);
        consume("打8折", 1, 1000);
        System.out.println("总计:" + total);
    }
    
    public static void consume(String type, int num, double price) {
        Context Context = null;
        
        if ("正常收费".equals(type)) {
            Context = new Context(new Normal());
        }
        else if ("满300返100".equals(type)) {
            Context = new Context(new MoneyOff(100, 300));
        }
        else if ("打8折".equals(type)) {
            Context = new Context(new Discount(0.8));
        }

        double totalPrices = Context.charge(num * price);
        total += totalPrices;
        System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
    }
}
