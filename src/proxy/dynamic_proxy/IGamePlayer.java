package proxy.dynamic_proxy;

/**
 * @author zx
 * @date 2015年11月11日
 */
public interface IGamePlayer {

	/**
	 * 登陆
	 * @param user
	 * @param password
	 */
	public void login(String user, String password);

	/**
	 * 打怪、杀怪
	 */
	public void killBoss();

	/**
	 * 升级
	 */
	public void upgrade();

}
