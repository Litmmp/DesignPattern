package mediator;

/**
 * 库存
 * @author zx
 * @date 2015年12月23日
 */
public class Stock extends AbstractColleague {

	private static int COMPUTER_NUMBER = 100;

	public Stock(AbstractMediator mediator) {
		super(mediator);
	}

	/**
	 * 增加库存
	 * @param number
	 */
	public void increase(int number) {
		COMPUTER_NUMBER += number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	/**
	 * 减少库存
	 * @param number
	 */
	public void decrease(int number) {
		COMPUTER_NUMBER -= number;
		System.out.println("库存数量为：" + COMPUTER_NUMBER);
	}

	/**
	 * 获取库存数量
	 * @return
	 */
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	/**
	 * 库存压力大了，就要通知采购人员不要采购，销售人员要尽快销售
	 */
	public void clearStock() {
		System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}

}
