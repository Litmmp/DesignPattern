package proxy.simple_proxy;

import proxy.simple_proxy.model.GamePlayer;

/**
 * 玩家自己亲自玩游戏
 * @author zx
 * @date 2015年11月11日
 */
public class Main1 {

	public static void main(String[] args) {
		IGamePlayer palyer = new GamePlayer("张三");
		System.out.println("---begin---");
		palyer.login("user", "password");
		palyer.killBoss();
		palyer.upgrade();
		System.out.println("---end---");
	}
}
