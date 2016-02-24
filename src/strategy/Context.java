package strategy;

/**
 * 锦囊
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class Context {

	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 使用计谋
	 */
	public void operate() {
		this.strategy.operate();
	}

}
