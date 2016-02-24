package decorator;

/**
 * 最高分装饰器
 * 
 * @author zx
 * @date 2016年2月13日
 */
public class HighScoreDecorator extends Decorator {

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}

	/**
	 * 汇报最高成绩
	 */
	private void reportHighSchool() {
		System.out.println("这次考试语文最高分75，数学最高分78，自然最高分80");
	}

	@Override
	public void report() {
		reportHighSchool();
		super.report();
	}

}
