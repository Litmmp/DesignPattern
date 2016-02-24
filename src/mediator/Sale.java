package mediator;

import java.util.Random;

/**
 * 销售
 * @author zx
 * @date 2015年12月23日
 */
public class Sale extends AbstractColleague {

	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	/**
	 * 销售IBM电脑
	 * @param number
	 */
	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("销售IBM电脑" + number + "台");
	}

	/**
	 * 反馈销售情况：0～100，0代表无人问津，100代表非常畅销
	 * @return
	 */
	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("IBM电脑销售情况为：" + saleStatus);
		return saleStatus;
	}

	/**
	 * 折价处理
	 */
	public void offSale() {
		super.mediator.execute("sale.offsell");
	}

}
