package builder.model;

import java.util.ArrayList;

/**
 * @author zx
 * @date 2015年11月9日
 */
public abstract class CarModel {

	// 执行顺序
	private ArrayList<String> sequence = new ArrayList<>();

	/**
	 * 启动
	 */
	protected abstract void start();

	/**
	 * 停止
	 */
	protected abstract void stop();

	/**
	 * 鸣笛
	 */
	protected abstract void alarm();

	/**
	 * 引擎声音
	 */
	protected abstract void engineBoom();

	/**
	 * 设置执行顺序
	 * @param sequence
	 */
	public final void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	/**
	 * 真正跑起来
	 */
	public final void run() {
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) {
				this.start();
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop();
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}
	}
}
