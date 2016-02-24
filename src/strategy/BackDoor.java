package strategy;

/**
 * 妙计一：乔国老开后门
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("找乔国老帮忙，让吴国太给孙权施加压力！");
	}

}
