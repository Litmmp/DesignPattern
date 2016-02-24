package facade;

/**
 * 外观模式：要求一个子系统的外部与其内部的通信必须通过一个统一的对象进行。门面模式提供一个高层次的接口，使得子系统更易于使用。
 * 
 * 该模式注重“统一的对象”，也就是提供一个访问子系统的接口，除了这个接口不允许有任何子系统的行为发生。
 * 
 * 优点：
 * 	1、减少系统的相互依赖
 * 	2、提高了灵活性
 * 	3、提高安全性
 * 
 * 缺点：
 * 	最大的缺点就是不符合开闭原则，对修改关闭，对扩展开放。外观对象(PostOffice)可是重中之重，以后一旦出现问题，继承、重写根本解决不了问题。
 * 	唯一能做的就是修改门面对象代码，而这个风险又是很大的，设计时需要多多考虑。
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class Main {

	public static void main(String[] args) {
		PostOffice post = new PostOffice();
		String context = "Hello! My lover.";
		String address = "China";
		post.sendLetter(context, address);
	}

}
