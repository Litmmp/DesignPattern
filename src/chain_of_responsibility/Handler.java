package chain_of_responsibility;

/**
 * @author zx
 * @date 2016年2月12日
 */
public abstract class Handler {

	static int FATHER_LEVEL_REQUEST = 1;
	static int HUSBAND_LEVEL_REQUEST = 2;
	static int SON_LEVEL_REQUEST = 3;

	// 能处理的级别
	private int level;

	// 责任传递，下一个责任人是谁
	private Handler nextHandler;

	/**
	 * 每个类都要说明一下自己能处理哪些请求
	 * （同时框定子类必须有一个显示构造方法）
	 * @param level
	 */
	public Handler(int level) {
		this.level = level;
	}

	/**
	 * 处理妇女的请求
	 * @param women
	 */
	public final void HandleMessage(IWomen women) {
		if (women.getType() == this.level) {
			response(women);
		} else {
			if (this.nextHandler != null) {// 有后续环节，才能把请求继续向后传递
				nextHandler.HandleMessage(women);
			} else {
				System.out.println("无请示处理者，按不同意处理！\n");
			}
		}
	}

	/**
	 * 如果请求不该你处理，就丢给下一个责任人处理
	 * @param nextHandler
	 */
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * 有请求那当然要回应
	 * @param women
	 */
	protected abstract void response(IWomen women);

}
