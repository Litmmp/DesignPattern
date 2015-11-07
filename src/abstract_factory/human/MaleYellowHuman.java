package abstract_factory.human;

/**
 * 黄种人
 * @author zx
 * @date 2015年11月7日
 */
public class MaleYellowHuman extends AbstractYellowHuman {

	@Override
	public void getSex() {
		System.out.println("yellow male");
	}

}
