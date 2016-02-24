package strategy;

/**
 * 妙计二：吴国太开绿灯
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class GivenGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开绿灯，放行！");
	}

}
