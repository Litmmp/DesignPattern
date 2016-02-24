package command;

/**
 * @author zx
 * @date 2016年2月11日
 */
public class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到需求组...");
	}

	@Override
	public void add() {
		System.out.println("增加需求...");
	}

	@Override
	public void delete() {
		System.out.println("删除需求...");
	}

	@Override
	public void change() {
		System.out.println("修改需求...");
	}

	@Override
	public void plan() {
		System.out.println("给出需求变更计划...");
	}

}
