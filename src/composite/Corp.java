package composite;

/**
 * 公司人员接口
 * 
 * @author zx
 * @date 2016年2月16日
 */
public abstract class Corp {

	// 节点名称
	private String name;
	// 节点职位
	private String position;
	// 节点薪水
	private int salary;

	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	/**
	 * 获取信息
	 * @return
	 */
	public String getInfo() {
		String info = "名称：" + name + "\t职位：" + position + "\t薪水" + salary;
		return info;
	}
}
