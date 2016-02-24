package composite;

import java.util.ArrayList;

/**
 * 分支节点实现类
 * 
 * @author zx
 * @date 2016年2月16日
 */
public class Branch extends Corp {
	// 保存根节点下的分支节点和叶子节点
	private ArrayList<Corp> subordinates = new ArrayList<>();

	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	/**
	 * 获取下属
	 * @return
	 */
	public ArrayList<Corp> getSubordinateInfo() {
		return subordinates;
	}

	/**
	 * 新增下属
	 * @param corp
	 */
	public void addSubordinate(Corp corp) {
		subordinates.add(corp);

	}

}
