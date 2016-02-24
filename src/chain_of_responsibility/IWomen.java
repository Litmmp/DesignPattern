package chain_of_responsibility;

/**
 * @author zx
 * @date 2016年2月12日
 */
public interface IWomen {

	/**
	 * 获得个人状况
	 * @return
	 */
	int getType();

	/**
	 * 获取个人请求内容。逛街？约会？看电影？
	 * @return
	 */
	String getRequest();

}
