package factory_method.human;

/**
 * 黄种人
 * @author zx
 * @date 2015年11月7日
 */
public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("yellow");
	}

}
