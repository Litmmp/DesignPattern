package observer;

import java.util.Observer;

/**
 * 观察者模式：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新
 * 
 * 观察者模式在 Java API 中已经定义好了现成的框架，在Java的世界中，多看看API是有好处的！
 * 
 * 优点：
 * 	1、观察者和被观察者之间是抽象耦合
 * 	2、建立一套触发机制
 * 
 * 缺点：
 * 	1、该模式需要考虑一下开发效率和运行效率问题，一个被观察者，多个观察者，开发和调试就会比较复杂，而且在Java中消息的通知默认是顺序执行，
 * 	一个观察者卡壳，会影响整体的执行效率。在这种情况下，一般考虑采用异步方式。
 * 	2、多级触发时，效率更是让人担忧。
 * 
 * @author zx
 * @date 2016年2月16日
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// 被观察者
		CaoCao hanFeiZi = new CaoCao();

		// 三个观察者
		Observer liSi = new ZhuGeliang();
		Observer zhaoGao = new LuSu();

		// 添加观察者
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(zhaoGao);

		// 曹操吃早饭了
		Thread.sleep(1000);
		hanFeiZi.haveBreakfast();

		// 曹操娱乐了
		Thread.sleep(1000);
		hanFeiZi.haveFun();
	}

}
