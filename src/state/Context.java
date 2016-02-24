package state;

/**
 * 上下文类
 * 
 * @author zx
 * @date 2016年2月19日
 */
public class Context {

	// 所有电梯状态
	final static OpenningState openningState = new OpenningState();
	final static ClosingState closingState = new ClosingState();
	final static RunningState runningState = new RunningState();
	final static StoppingState stoppingState = new StoppingState();

	// 电梯当前状态
	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
		liftState.setContext(this);
	}

	public void open() {
		liftState.open();
	}

	public void close() {
		liftState.close();
	}

	public void run() {
		liftState.run();
	}

	public void stop() {
		liftState.stop();
	}

}
