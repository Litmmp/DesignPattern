package factory_method;

import factory_method.factory.AbstractHumanFactory;
import factory_method.factory.HumanFactory;
import factory_method.human.BlackHuman;
import factory_method.human.WhiteHuman;
import factory_method.human.YellowHuman;

/**
 * 工厂方法模式
 * @author zx
 * @date 2015年11月7日
 */
public class Main {

	public static void main(String[] args) {

		AbstractHumanFactory factory = new HumanFactory();

		BlackHuman black = factory.createHuman(BlackHuman.class);
		black.getColor();

		WhiteHuman white = factory.createHuman(WhiteHuman.class);
		white.getColor();

		YellowHuman yellow = factory.createHuman(YellowHuman.class);
		yellow.getColor();

	}

}
