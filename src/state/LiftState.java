package state;

/**
 * 抽象电梯状态
 * 
 * @author zx
 * @date 2016年2月19日
 */
public abstract class LiftState {

	// 环境角色，也就是封装状态的变化引起的功能变化
	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * 开门
	 */
	public abstract void open();

	/**
	 * 关门
	 */
	public abstract void close();

	/**
	 * 上下运行
	 */
	public abstract void run();

	/**
	 * 停止
	 */
	public abstract void stop();

}
