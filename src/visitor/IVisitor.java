package visitor;

/**
 * 访问者接口
 * 
 * @author zx
 * @date 2016年2月18日
 */
public interface IVisitor {

	/**
	 * 访问普通员工
	 * @param commonEmployee
	 */
	public void visit(CommonEmployee commonEmployee);

	/**
	 * 访问部门经理
	 * @param manager
	 */
	public void visit(Manager manager);
	
	public int getTotalSalary();

}
