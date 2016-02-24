package state;

/**
 * 关闭状态
 * 
 * @author zx
 * @date 2016年2月19日
 */
public class ClosingState extends LiftState {

	@Override
	public void open() {
		context.setLiftState(Context.openningState);
		context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}

	@Override
	public void run() {
		context.setLiftState(Context.runningState);
		context.getLiftState().run();
	}

	@Override
	public void stop() {
		context.setLiftState(Context.stoppingState);
		context.getLiftState().stop();
	}

}
