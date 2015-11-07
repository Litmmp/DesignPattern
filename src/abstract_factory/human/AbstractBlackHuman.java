package abstract_factory.human;

/**
 * @author zx
 * @date 2015年11月7日
 */
public abstract class AbstractBlackHuman implements Human {
	
	@Override
	public void getColor() {
		System.out.println("black");
	}
	
}
