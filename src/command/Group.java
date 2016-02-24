package command;

/**
 * @author zx
 * @date 2016年2月11日
 */
public abstract class Group {

	/**
	 * 找到某个组
	 */
	public abstract void find();

	/**
	 * 增加功能
	 */
	public abstract void add();

	/**
	 * 删除功能
	 */
	public abstract void delete();

	/**
	 * 修改功能
	 */
	public abstract void change();

	/**
	 * 给出所有变更计划
	 */
	public abstract void plan();

}
