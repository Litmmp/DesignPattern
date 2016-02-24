package visitor;

/**
 * 普通员工
 * 
 * @author zx
 * @date 2016年2月18日
 */
public class CommonEmployee extends Employee {

	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	protected void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
