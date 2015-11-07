package abstract_factory.factory;

import abstract_factory.human.FemaleBlackHuman;
import abstract_factory.human.FemaleWhiteHuman;
import abstract_factory.human.FemaleYellowHuman;
import abstract_factory.human.Human;

/**
 * @author zx
 * @date 2015年11月7日
 */
public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

}
