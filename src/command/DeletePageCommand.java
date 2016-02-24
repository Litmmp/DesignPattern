package command;

/**
 * 命令：删除一个页面
 * 
 * @author zx
 * @date 2016年2月11日
 */
public class DeletePageCommand extends Command {

	@Override
	public void execute() {
		super.pg.find();
		super.pg.delete();
		super.pg.plan();
	}

}
