package visitor;

/**
 * 访问者实现
 * 
 * @author zx
 * @date 2016年2月18日
 */
public class Visitor implements IVisitor {

	// 部门经理的工资系数是5
	private final static int MANAGER_COEFFICIENT = 5;
	// 员工的工资系数是2
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	// 普通员工的工资总和
	private int commonTotalSalary;
	// 部门经理的工资总和
	private int managerTotalSalary;

	/**
	 * 计算部门经理的工资总和
	 * @param salary
	 */
	private void calManagerSalary(int salary) {
		managerTotalSalary += salary * MANAGER_COEFFICIENT;
	}

	/**
	 * 计算普通员工的工资总和
	 * @param salary
	 */
	private void calCommonSalary(int salary) {
		commonTotalSalary += salary * COMMONEMPLOYEE_COEFFICIENT;
	}

	@Override
	public int getTotalSalary() {
		return managerTotalSalary + commonTotalSalary;
	}

	@Override
	public void visit(CommonEmployee commonEmployee) {
		calCommonSalary(commonEmployee.getSalary());
		System.out.println(getCommonEmployeeInfo(commonEmployee));
	}

	@Override
	public void visit(Manager manager) {
		calManagerSalary(manager.getSalary());
		System.out.println(getManagerInfo(manager));
	}

	/**
	 * 基本信息
	 * @param employee
	 * @return
	 */
	private String getBasicInfo(Employee employee) {
		String info = "姓名：" + employee.getName() + "\t性别：" + (employee.getSex() == Employee.FEMALE ? "女" : "男")
				+ "\t薪水：" + employee.getSalary() + "\t";
		return info;
	}

	/**
	 * 经理信息
	 * @param manager
	 * @return
	 */
	private String getManagerInfo(Manager manager) {
		String basicInfo = getBasicInfo(manager);
		String otherInfo = "业绩：" + manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}

	/**
	 * 普通员工信息
	 * @param commonEmployee
	 * @return
	 */
	private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
		String basicInfo = getBasicInfo(commonEmployee);
		String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
		return basicInfo + otherInfo;
	}

}
