package builder.model;

/**
 * @author zx
 * @date 2015年11月9日
 */
public class BMWModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("BMW start ...");
	}

	@Override
	protected void stop() {
		System.out.println("BMW stop ...");
	}

	@Override
	protected void alarm() {
		System.out.println("BMW alarm ...");
	}

	@Override
	protected void engineBoom() {
		System.out.println("BMW engine boom ...");
	}

}
