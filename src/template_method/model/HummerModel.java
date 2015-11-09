package template_method.model;

/**
 * 抽象模板
 * 方法分为三类：
 * 基本方法（尽量设计成protected类型，符合迪米特法则）
 * 模板方法（为了防止恶意操作，一般模板方法都加上final关键字，不允许被重写）
 * 钩子方法（Hook Method，子类重写后，可以改变公共部分的执行结果）
 * @author zx
 * @date 2015年11月9日
 */
public abstract class HummerModel {

	/**
	 * 启动（基本方法）
	 */
	protected abstract void start();

	/**
	 * 停止（基本方法）
	 */
	protected abstract void end();

	/**
	 * 喇叭（基本方法）
	 */
	protected abstract void alarm();

	/**
	 * 引擎声音（基本方法）
	 */
	protected abstract void engineBoom();

	/**
	 * 默认喇叭是会响的（钩子方法）
	 * @return
	 */
	protected boolean isAlarm() {
		return true;
	}

	/**
	 * 真正跑起来（模板方法）
	 */
	public final void run() {
		this.start();
		this.engineBoom();
		// 是否需要响喇叭
		if (isAlarm()) {
			this.alarm();
		}
		this.end();
	}

}
