package proxy.force_proxy;

import proxy.force_proxy.model.GamePlayer;

/**
 * 直接使用真实对象
 * @author zx
 * @date 2015年11月11日
 */
public class Main1 {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		System.out.println("---begin---");
		player.login("user", "password");
		player.killBoss();
		player.upgrade();
		System.out.println("---end---");
	}

}
