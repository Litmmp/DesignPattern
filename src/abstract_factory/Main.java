package abstract_factory;

import abstract_factory.factory.FemaleFactory;
import abstract_factory.factory.HumanFactory;
import abstract_factory.factory.MaleFactory;
import abstract_factory.human.Human;

/**
 * 抽象工厂模式
 * @author zx
 * @date 2015年11月7日
 */
public class Main {

	public static void main(String[] args) {

		// 男人工厂
		HumanFactory maleHumanFactory = new MaleFactory();
		// 女人工厂
		HumanFactory femaleHumanFactory = new FemaleFactory();

		// 创建一个黄种男人
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		maleYellowHuman.getSex();

		// 创建一个黄种女人
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		femaleYellowHuman.getSex();

		// ......

	}

}
