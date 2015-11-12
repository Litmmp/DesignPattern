package proxy.simple_proxy;

import proxy.simple_proxy.model.GamePlayer;
import proxy.simple_proxy.proxy.GamePlayerProxy;

/**
 * 简单代理，代理帮玩家玩游戏
 * @author zx
 * @date 2015年11月11日
 */
public class Main2 {

	public static void main(String[] args) {
		// 真实玩家
		IGamePlayer player = new GamePlayer("张三");
		// 代理
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.out.println("---begin---");
		proxy.login("user", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("---end---");
	}

}
