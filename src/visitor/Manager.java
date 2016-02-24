package visitor;

/**
 * 管理阶层
 * 
 * @author zx
 * @date 2016年2月18日
 */
public class Manager extends Employee {
	// 业绩
	private String performance;

	public String getPerformance() {
		return performance;
	}

	public void setPerformance(String performance) {
		this.performance = performance;
	}

	@Override
	protected void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
