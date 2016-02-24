package state;

/**
 * 开门状态
 * 
 * @author zx
 * @date 2016年2月19日
 */
public class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("电梯门开启...");
	}

	@Override
	public void close() {
		context.setLiftState(Context.closingState);
		context.getLiftState().close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

}
