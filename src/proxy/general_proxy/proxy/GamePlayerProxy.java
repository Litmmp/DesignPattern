package proxy.general_proxy.proxy;

import proxy.general_proxy.IGamePlayer;
import proxy.general_proxy.model.GamePlayer;

/**
 * 普通代理
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayerProxy implements IGamePlayer {

	// 需要代理的玩家
	private IGamePlayer player = null;

	/**
	 * 通过构造函数，传递需要对谁进行代理
	 * @param player
	 */
	public GamePlayerProxy(String name) {
		player = new GamePlayer(this, name);
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
