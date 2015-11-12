package proxy.general_proxy.model;

import proxy.general_proxy.IGamePlayer;

/**
 * @author zx
 * @date 2015年11月11日
 */
public class GamePlayer implements IGamePlayer {

	private String name = null;

	/**
	 * 通过构造函数传递player参数，限定谁能创建真实的玩家对象，比如说类名为Proxy等限制，需根据实际情况扩展
	 * @param player
	 * @param name
	 */
	public GamePlayer(IGamePlayer player, String name) {
		if (player == null) {
			System.out.println("不能创建真实玩家角色");
			System.exit(-1);
		} else {
			this.name = name;
		}
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
