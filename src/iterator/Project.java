package iterator;

import java.util.ArrayList;

/**
 * 项目信息，存储的是集合数据
 * 
 * @author zx
 * @date 2016年2月15日
 */
public class Project implements IProject {

	// 项目列表
	private ArrayList<IProject> projects = new ArrayList<>();

	// 项目名称
	private String name;
	// 项目成员数量
	private int num;
	// 项目费用
	private int cost;

	public Project() {
	}

	public Project(String name, int num, int cost) {
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	@Override
	public String getProjectInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("项目名称是：" + name);
		sb.append("\t项目人数是：" + num);
		sb.append("\t项目费用是：" + cost);
		return sb.toString();
	}

	@Override
	public void add(String name, int num, int cost) {
		this.projects.add(new Project(name, num, cost));
	}

	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projects);
	}

}
