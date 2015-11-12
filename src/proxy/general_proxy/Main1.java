package proxy.general_proxy;

import proxy.general_proxy.proxy.GamePlayerProxy;

/**
 * 普通代理，要求用户只能访问代理角色，而不能访问真实角色
 * @author zx
 * @date 2015年11月11日
 */
public class Main1 {

	public static void main(String[] args) {
		IGamePlayer proxy = new GamePlayerProxy("张三");
		System.out.println("---begin---");
		proxy.login("user", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("---end---");
	}

}
