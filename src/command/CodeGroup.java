package command;

/**
 * @author zx
 * @date 2016年2月11日
 */
public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到代码组...");
	}

	@Override
	public void add() {
		System.out.println("增加功能...");
	}

	@Override
	public void delete() {
		System.out.println("删除功能...");
	}

	@Override
	public void change() {
		System.out.println("修改功能...");
	}

	@Override
	public void plan() {
		System.out.println("给出功能变更计划...");
	}

}
