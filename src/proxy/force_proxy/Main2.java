package proxy.force_proxy;

import proxy.force_proxy.model.GamePlayer;
import proxy.force_proxy.proxy.GamePlayerProxy;

/**
 * 直接访问代理
 * @author zx
 * @date 2015年11月11日
 */
public class Main2 {

	public static void main(String[] args) {
		// 创建真实对象
		IGamePlayer player = new GamePlayer("张三");
		// 创建代理
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.out.println("---begin---");
		proxy.login("user", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("---end---");
	}

}
