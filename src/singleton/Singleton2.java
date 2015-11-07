package singleton;

/**
 * 单例模式（饱汉式模式），推荐使用
 * @author zx
 * @date 2015年11月7日
 */
public class Singleton2 {

	private static final Singleton2 instance = new Singleton2();

	private Singleton2() {
		// 私有化构造器，防止外部程序创建对象
	}

	/**
	 * 该方法不存在线程安全问题
	 * @return
	 */
	public static Singleton2 getInstance() {
		return instance;
	}
}
