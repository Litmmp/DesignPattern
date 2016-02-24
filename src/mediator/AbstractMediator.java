package mediator;

/**
 * @author zx
 * @date 2016年2月9日
 */
public abstract class AbstractMediator {

	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;

	public AbstractMediator() {
		purchase = new Purchase(this);
		System.err.println("purchase: " + purchase);
		sale = new Sale(this);
		stock = new Stock(this);
	}

	/**
	 * 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
	 * @param str
	 * @param objects
	 */
	public abstract void execute(String str, Object... objects);
}
