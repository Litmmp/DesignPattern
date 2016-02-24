package command;

/**
 * 命令：增加一个需求
 * 
 * @author zx
 * @date 2016年2月11日
 */
public class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		super.rg.find();
		super.rg.add();
		super.rg.plan();
	}

}
