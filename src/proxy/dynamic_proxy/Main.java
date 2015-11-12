package proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import proxy.dynamic_proxy.model.GamePlayer;
import proxy.dynamic_proxy.proxy.GamePlayIH;

/**
 * 动态代理
 * @author zx
 * @date 2015年11月11日
 */
public class Main {

	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		InvocationHandler handler = new GamePlayIH(player);
		System.out.println("---begin---");
		ClassLoader loader = player.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[] { IGamePlayer.class }, handler);
		proxy.login("user", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("---end---");
	}
}
