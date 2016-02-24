package chain_of_responsibility;

/**
 * @author zx
 * @date 2016年2月12日
 */
public class Women implements IWomen {

	// 1、未出嫁 2、出嫁 3、夫死
	private int type;

	// 妇女的请示
	private String request;

	public Women(int type, String request) {
		this.type = type;
		this.request = request;
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是：" + request;
			break;
		case 2:
			this.request = "妻子的请求是：" + request;
			break;
		case 3:
			this.request = "母亲的请求是：" + request;
			break;
		default:
			break;
		}
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}

}
