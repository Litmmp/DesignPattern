package mediator;

/**
 * @author zx
 * @date 2016年2月9日
 */
public class Mediator extends AbstractMediator {

	@Override
	public void execute(String str, Object... objects) {
		if ("purchase.buy".equals(str)) {// 采购电脑
			this.buyComputer((Integer) objects[0]);
		} else if ("sale.sell".equals(str)) {// 销售电脑
			this.sellComputer((Integer) objects[0]);
		} else if ("sale.offsell".equals(str)) {// 折价销售
			this.offSell();
		} else if ("stock.clear".equals(str)) {// 清仓处理
			this.clearStock();
		}
	}

	/**
	 * 采购电脑
	 * @param number
	 */
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if (saleStatus > 80) {// 销售状况良好
			System.out.println("采购IBM电脑：" + number + " 台");
			super.stock.increase(number);
		} else {// 销售状况不好
			int buyNumber = number / 2;// 折半采购
			System.out.println("采购IBM电脑：" + buyNumber + " 台");
		}
	}

	/**
	 * 销售电脑
	 * @param number
	 */
	private void sellComputer(int number) {
		if (super.stock.getStockNumber() < number) {// 库存不够
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}

	/**
	 * 折价销售电脑
	 */
	private void offSell() {
		System.out.println("折价销售IBM电脑 " + stock.getStockNumber() + " 台");
	}

	/**
	 * 清仓处理
	 */
	private void clearStock() {
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

}
