package abstract_factory.human;

/**
 * 白种人
 * @author zx
 * @date 2015年11月7日
 */
public class MaleWhiteHuman extends AbstractWhiteHuman {

	@Override
	public void getSex() {
		System.out.println("white male");
	}

}
