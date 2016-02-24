package strategy;

/**
 * 策略模式使用的就是面向对象的继承和多态机制
 * 
 * 策略模式借用了代理模式的思路，差别就是策略模式的封装角色和被封装的策略类不用是同一个接口，如果是同一个接口那就成了代理模式
 * 
 * 优点：
 * 	1、算法可以自由切换
 * 	2、避免使用多重条件判断
 * 	3、扩展性良好
 * 
 * 缺点：
 * 	1、每一个策略都是一个类，复用的可能性很小，类数量增多
 * 	2、所有的策略类都需要对外暴露，这与迪米特法则相违背。我只是想使用一个策略，为什么就要了解这个策略呢？如果这样，封装类还有什么意义？
 * 	这是原始策略模式的一个缺点，幸运的是，我们可以使用其它模式来修正这个缺陷，如工厂方法模式、代理模式或享元模式。
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class Main {

	public static void main(String[] args) {
		Context context;
		System.out.println("---刚到吴国的时候，拆第一个锦囊---");
		context = new Context(new BackDoor());// 这里暴露出了“妙计”本身，是原始策略模式致命的缺点！
		context.operate();
		System.out.println();
		System.out.println("---刘备乐不思蜀了，拆第二个锦囊---");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println();
		System.out.println("---孙权的追兵来了，拆第三个锦囊---");
		context = new Context(new BlockEnemy());
		context.operate();
	}

}
