package singleton;

/**
 * 单例模式（懒汉式模式）
 * @author zx
 * @date 2015年11月7日
 */
public class Singleton1 {

	private static Singleton1 singleton = null;

	private Singleton1() {
		// 私有化构造起，避免外部程序创建该对象
	}

	/**
	 * 该方法存在线程安全问题，有可能返回多个实例
	 * @return
	 */
	public static Singleton1 getInstance() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

}
