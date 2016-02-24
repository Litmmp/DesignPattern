package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者
 * 
 * @author zx
 * @date 2016年2月16日
 */
public class LuSu implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("鲁肃：观察到曹操活动，开始向老板汇报...");
		this.cry(arg.toString());
		System.out.println("鲁肃：哭死了...\n");
	}

	/**
	 * 看到对方还有活动，就会悲伤
	 * @param context
	 */
	private void cry(String context) {
		System.out.println("鲁肃：因为" + context + ",---所以我悲伤啊！");
	}
}
