package singleton;

/**
 * 单例模式
 * @author zx
 * @date 2015年11月7日
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("---懒汉式---");
		Singleton1 lazy1 = Singleton1.getInstance();
		Singleton1 lazy2 = Singleton1.getInstance();
		System.out.println(lazy1 == lazy2);

		System.out.println("---饱汉式---");
		Singleton2 eager1 = Singleton2.getInstance();
		Singleton2 eager2 = Singleton2.getInstance();
		System.out.println(eager1 == eager2);

	}
}
