package proxy.force_proxy.model;

import proxy.force_proxy.IGamePlayer;
import proxy.force_proxy.proxy.GamePlayerProxy;

/**
 * 真实对象
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayer implements IGamePlayer {
	// 真实对象名字
	private String name = null;
	// 我的代理
	private IGamePlayer proxy = null;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		if (this.isProxy()) {
			System.out.println("登录名为  " + user + "  的用户  " + this.name + "  登录成功！");
		} else {
			System.out.println("请使用指定的代理访问！");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name + "  在打怪！");
		} else {
			System.out.println("请使用指定的代理访问！");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name + "  又升了一级！");
		} else {
			System.out.println("请使用指定的代理访问！");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}

	/**
	 * 校验是否是代理访问
	 * @return
	 */
	private boolean isProxy() {
		if (this.proxy == null) {
			return false;
		} else {
			return true;
		}
	}

}
