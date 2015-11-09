package template_method.model;

/**
 * @author zx
 * @date 2015年11月9日
 */
public class HummerH1Model extends HummerModel {

	// 响喇叭
	private boolean alarmFlag = true;

	@Override
	public void start() {
		System.out.println("悍马H1启动");
	}

	@Override
	public void end() {
		System.out.println("悍马H1停止");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎声音");
	}

	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	/**
	 * 响不响喇叭，让客户端取决定
	 * @param isAlarm
	 * @return
	 */
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}

}
