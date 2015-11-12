package proxy.force_proxy.proxy;

import proxy.force_proxy.IGamePlayer;

/**
 * 强制代理
 * 强制代理在设计模式中比较另类。
 * 一般的思维都是通过代理找真实的对象，但是强制代理却要“强制”必须通过真实对象找到代理，否则不能访问。
 * 也就是说，一般的思维是代理管理真实对象，但是“强制代理”确实真实对象管理代理
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayerProxy implements IGamePlayer {

	// 真实玩家
	private IGamePlayer player;

	/**
	 * 传递真实对象
	 * @param player
	 */
	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}

	@Override
	public void login(String user, String password) {
		this.player.login(user, password);
	}

	@Override
	public void killBoss() {
		this.player.killBoss();
	}

	@Override
	public void upgrade() {
		this.player.upgrade();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}

}
