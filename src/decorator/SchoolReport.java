package decorator;

/**
 * 成绩单
 * 
 * @author zx
 * @date 2016年2月13日
 */
public abstract class SchoolReport {
	/**
	 * 成绩情况
	 */
	public abstract void report();

	/**
	 * 家长签字
	 */
	public abstract void sign(String name);

}
