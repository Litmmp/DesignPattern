package chain_of_responsibility;

/**
 * 未出嫁的女儿请示父亲
 * @author zx
 * @date 2016年2月12日
 */
public class Father extends Handler {

	/**
	 * 父亲只处理未出嫁儿女的请求
	 */
	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("------女儿向父亲请示------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复是：同意\n");
	}

}
