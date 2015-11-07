package factory_method.human;

/**
 * 白种人
 * @author zx
 * @date 2015年11月7日
 */
public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("white");
	}

}
