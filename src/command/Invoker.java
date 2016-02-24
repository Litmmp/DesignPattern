package command;

/**
 * 沟通者，负责人
 * 
 * @author zx
 * @date 2016年2月11日
 */
public class Invoker {

	// 什么命令
	private Command command;

	// 客户发出命令
	public void setCommand(Command command) {
		this.command = command;
	}

	// 执行命令
	public void action() {
		this.command.execute();
	}

}
