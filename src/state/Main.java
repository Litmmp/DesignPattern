package state;

/**
 * 状态模式：当一个对象内在状态改变时允许其改变行为，这个对象看起来改变了其类。
 * 
 * 状态模式的核心是封装，状态的变更引起了行为的变更，从外部看起来就好像对应的类发生了改变一样。
 * 
 * 优点：
 * 	1、结构清晰
 * 	2、遵循设计原则
 * 	3、封装性非常好
 * 
 * 缺点：
 * 	1、子类太多，会引起类膨胀。使用需谨慎
 * 
 * @author zx
 * @date 2016年2月19日
 */
public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
