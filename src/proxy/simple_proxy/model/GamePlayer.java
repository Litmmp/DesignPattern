package proxy.simple_proxy.model;

import proxy.simple_proxy.IGamePlayer;

/**
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayer implements IGamePlayer {

	private String name = null;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		System.out.println("登录名为  " + user + "  的用户  " + this.name + "  登录成功！");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + "  在打怪！");

	}

	@Override
	public void upgrade() {
		System.out.println(this.name + "  又升了一级！");
	}

}
