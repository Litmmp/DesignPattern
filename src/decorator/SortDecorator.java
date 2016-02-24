package decorator;

/**
 * 排名装饰器
 * 
 * @author zx
 * @date 2016年2月13日
 */
public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportSort() {
		System.out.println("本次考试排名38");
	}

	@Override
	public void report() {
		super.report();
		reportSort();
	}

}
