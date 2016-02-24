package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者
 * 
 * @author zx
 * @date 2016年2月16日
 */
public class ZhuGeliang implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("诸葛亮：观察到曹操活动，开始向老板汇报...");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("诸葛亮：汇报完毕...\n");

	}

	/**
	 * 向上级汇报
	 * @param context
	 */
	private void reportToQinShiHuang(String context) {
		System.out.println("诸葛亮：报告！刘老板！曹操有活动了--->" + context);
	}
}
