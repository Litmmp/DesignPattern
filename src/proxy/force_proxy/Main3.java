package proxy.force_proxy;

import proxy.force_proxy.model.GamePlayer;

/**
 * 通过对象获取代理
 * @author zx
 * @date 2015年11月11日
 */
public class Main3 {

	public static void main(String[] args) {
		// 真实对象
		IGamePlayer player = new GamePlayer("张三");
		// 通过真实对象获取代理
		IGamePlayer proxy = player.getProxy();
		System.out.println("---begin---");
		proxy.login("user", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("---end---");
	}

}
