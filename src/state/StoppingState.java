package state;

/**
 * 停止状态
 * 
 * @author zx
 * @date 2016年2月19日
 */
public class StoppingState extends LiftState {

	@Override
	public void open() {
		context.setLiftState(Context.openningState);
		context.getLiftState().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
	}

	@Override
	public void run() {
		context.setLiftState(Context.runningState);
		context.getLiftState().run();
	}

	@Override
	public void stop() {
		System.out.println("电梯停止了...");
	}

}
