package mediator;

/**
 * 备注：个人感觉这不是一个好的中介者模式，该例运用中，实际的交互对象都被封装到了中介者自身内，不能再发生改变！
 * 
 * @author zx
 * @date 2015年12月23日
 */
public class Main {

	public static void main(String[] args) {

		AbstractMediator mediator = new Mediator();

		System.out.println("-------采购人员采购电脑-------");
		Purchase purchase = new Purchase(mediator);
		System.err.println("purchase: " + purchase);
		purchase.buyIBMcomputer(100);

		System.out.println("-------销售人员销售电脑-------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);

		System.out.println("-------库房人员清理库存-------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

}
