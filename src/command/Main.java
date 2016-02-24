package command;

public class Main {

	public static void main(String[] args) {
		// 接头人
		Invoker invoker = new Invoker();
		System.out.println("----------客户要求增加一个需求----------");
		// 客户给我们下命令
		Command command = new AddRequirementCommand();// 变动命令的地方，其它的都不用变
		// 接头人接收到命令
		invoker.setCommand(command);
		// 接头人执行命令
		invoker.action();
	}

}
