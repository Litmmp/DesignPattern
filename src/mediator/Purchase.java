package mediator;

/**
 * 采购
 * @author zx
 * @date 2015年12月23日
 */
public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	/**
	 * 采购IBM电脑
	 * @param number
	 */
	public void buyIBMcomputer(int number) {
		super.mediator.execute("purchase.buy", number);
	}

	/**
	 * 不再采购IBM电脑
	 */
	public void refuseBuyIBM() {
		System.out.println("不再采购IBM电脑");
	}
}
