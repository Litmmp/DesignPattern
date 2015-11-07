package abstract_factory.factory;

import abstract_factory.human.Human;

/**
 * 工厂
 * @author zx
 * @date 2015年11月7日
 */
public interface HumanFactory {

	/**
	 * 创建黄种人
	 * @return
	 */
	public Human createYellowHuman();

	/**
	 * 创建白种人
	 * @return
	 */
	public Human createWhiteHuman();

	/**
	 * 创建黑种人
	 * @return
	 */
	public Human createBlackHuman();
}
