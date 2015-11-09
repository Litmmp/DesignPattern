package template_method.model;

/**
 * @author zx
 * @date 2015年11月9日
 */
public class HummerH2Model extends HummerModel {

	@Override
	public void start() {
		System.out.println("悍马H2启动");
	}

	@Override
	public void end() {
		System.out.println("悍马H2停止");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣笛");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎声音");
	}

	/*
	 * 悍马H2默认不响喇叭 (non-Javadoc)
	 * 
	 * @see template_method.model.HummerModel#isAlarm()
	 */
	@Override
	protected boolean isAlarm() {
		return false;
	}

}
