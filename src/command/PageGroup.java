package command;

/**
 * @author zx
 * @date 2016年2月11日
 */
public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到美工组...");
	}

	@Override
	public void add() {
		System.out.println("增加页面...");
	}

	@Override
	public void delete() {
		System.out.println("删除页面...");
	}

	@Override
	public void change() {
		System.out.println("修改页面...");
	}

	@Override
	public void plan() {
		System.out.println("给出页面变更计划...");
	}

}
