package command;

/**
 * 命令模式优点：
 * 	1、类间解耦
 * 	2、可扩展性
 * 	3、命令模式结合其它模式会更优秀
 * 命令模式缺点：
 * 	如果命令太多，Command的子类就会迅速膨胀！使用时需考虑这点
 * 
 * @author zx
 * @date 2016年2月11日
 */
public abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();// 需求组
	protected PageGroup pg = new PageGroup();// 美工组
	protected CodeGroup cg = new CodeGroup();// 代码组

	// 只有这一个方法，要做什么事儿
	public abstract void execute();

}
