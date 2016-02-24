package mediator;

/**
 * @author zx
 * @date 2016年2月9日
 */
public abstract class AbstractColleague {
	
	protected AbstractMediator mediator;

	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
}
