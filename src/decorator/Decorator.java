package decorator;

/**
 * @author zx
 * @date 2016年2月13日
 */
public class Decorator extends SchoolReport {
	// 哪个成绩单
	private SchoolReport sr;

	public Decorator(SchoolReport sr) {
		this.sr = sr;
	}

	@Override
	public void report() {
		this.sr.report();
	}

	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
