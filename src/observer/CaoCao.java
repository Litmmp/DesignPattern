package observer;

import java.util.Observable;

/**
 * 具体的被观察者
 * 
 * @author zx
 * @date 2016年2月16日
 */
public class CaoCao extends Observable implements ICaoCao {

	@Override
	public void haveBreakfast() {
		System.out.println("曹操：开始吃饭了...");
		super.setChanged();
		super.notifyObservers("曹操在吃饭");
	}

	@Override
	public void haveFun() {
		System.out.println("曹操：开始娱乐了...");
		super.setChanged();
		super.notifyObservers("曹操在娱乐");
	}

}
