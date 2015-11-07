package abstract_factory.factory;

import abstract_factory.human.Human;
import abstract_factory.human.MaleBlackHuman;
import abstract_factory.human.MaleWhiteHuman;
import abstract_factory.human.MaleYellowHuman;

/**
 * 男人工厂
 * @author zx
 * @date 2015年11月7日
 */
public class MaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

}
