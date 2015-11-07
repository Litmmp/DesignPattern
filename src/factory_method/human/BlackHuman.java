package factory_method.human;

/**
 * 黑种人
 * @author zx
 * @date 2015年11月7日
 */
public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("black");
	}

}
