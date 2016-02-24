package strategy;

/**
 * 妙计三：孙夫人断后
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class BlockEnemy implements IStrategy {

	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵！");
	}

}
