package proxy.simple_proxy.proxy;

import proxy.simple_proxy.IGamePlayer;

/**
 * 一般代理
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayerProxy implements IGamePlayer {

	// 需要代理的玩家
	private IGamePlayer player = null;

	/**
	 * 传递代理玩家
	 * @param player
	 */
	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}

	/**
	 * 代理登录
	 * @param user
	 * @param password
	 */
	@Override
	public void login(String user, String password) {
		this.player.login(user, password);
	}

	/**
	 * 代理打怪
	 */
	@Override
	public void killBoss() {
		this.player.killBoss();
	}

	/**
	 * 代理升级
	 */
	@Override
	public void upgrade() {
		this.player.upgrade();
	}

}
