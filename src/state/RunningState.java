package state;

/**
 * 运行状态
 * 
 * @author zx
 * @date 2016年2月19日
 */
public class RunningState extends LiftState {

	@Override
	public void open() {
		// TODO Auto-generated method stub
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
	}

	@Override
	public void run() {
		System.out.println("电梯上下运行...");
	}

	@Override
	public void stop() {
		context.setLiftState(Context.stoppingState);
		context.getLiftState().stop();
	}

}
