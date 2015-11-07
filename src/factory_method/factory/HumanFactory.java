package factory_method.factory;

import factory_method.human.Human;

/**
 * 具体工厂
 * @author zx
 * @date 2015年11月7日
 */
public class HumanFactory extends AbstractHumanFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> clazz) {
		T human = null;
		try {
			human = (T) Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("女娲造人失败……");
		}
		return  human;
	}

}
