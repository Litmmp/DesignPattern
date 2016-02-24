package chain_of_responsibility;

/**
 * 女性丧偶后，向儿子请示
 * @author zx
 * @date 2016年2月12日
 */
public class Son extends Handler {

	/**
	 * 儿子只处理丧偶母亲的请求
	 */
	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("------母亲向儿子请示------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复是：同意\n");
	}

}
