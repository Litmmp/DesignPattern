package iterator;

/**
 * 项目信息接口
 * 
 * @author zx
 * @date 2016年2月15日
 */
public interface IProject {

	/**
	 * 增加项目
	 * @param name
	 * @param num
	 * @param cost
	 */
	void add(String name, int num, int cost);

	/**
	 * 项目信息
	 * @return
	 */
	String getProjectInfo();

	/**
	 * 获得一个可以被遍历的对象
	 * @return
	 */
	IProjectIterator iterator();

}
