package factory_method.factory;

import factory_method.human.Human;

/**
 * 抽象工厂
 * @author zx
 * @date 2015年11月7日
 */
public abstract class AbstractHumanFactory {

	/**
	 * 女娲造人
	 * @param clazz
	 * @return
	 */
	public abstract <T extends Human> T createHuman(Class<T> clazz);

}
