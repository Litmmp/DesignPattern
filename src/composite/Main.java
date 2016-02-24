package composite;

import java.util.ArrayList;

/**
 * 组合模式：有时又叫做部分-整体模式（Part-Whole）
 * 定义：将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性
 * 
 * 优点：
 * 	1、高层模块调用简单
 * 	2、节点自由增加
 * 
 * 缺点：
 * 	1、直接使用实现类！这在面向接口编程上是很不恰当的，与依赖倒置原则冲突，使用时要考虑清楚，它限制了接口的影响范围
 * 
 * 本例中的组合模式仅仅是理论基础，实际使用过程中，是需要变通的。实践出真知！！！
 * 
 * @author zx
 * @date 2016年2月16日
 */
public class Main {

	public static void main(String[] args) {
		// 首先得到一个树结构
		Branch ceo = compositeCorpTree();
		// CEO信息
		System.out.println(ceo.getInfo());
		// 员工信息
		System.out.println(getTreeInfo(ceo));
	}

	/**
	 * 组装树
	 * @return
	 */
	public static Branch compositeCorpTree() {
		// CEO
		Branch root = new Branch("刘备", "总经理", 100000);
		// 三个部门经理
		Branch developDep = new Branch("关羽", "研发部门经理", 10000);
		Branch salesDep = new Branch("张飞", "销售部分经理", 20000);
		Branch financeDep = new Branch("赵云", "财务部经理", 30000);
		// 两个小组长
		Branch firstDevGroup = new Branch("关平", "开发一组组长", 5000);
		Branch secondDevGroup = new Branch("张苞", "开发二组组长", 5000);
		Branch thirdDevGroup = new Branch("法正", "开发三组组长", 5000);
		// 小兵
		Leaf a = new Leaf("a", "开发人员", 2000);
		Leaf b = new Leaf("b", "开发人员", 2000);
		Leaf c = new Leaf("c", "开发人员", 2000);
		Leaf d = new Leaf("d", "开发人员", 2000);
		Leaf e = new Leaf("e", "开发人员", 2000);
		Leaf f = new Leaf("f", "开发人员", 2000);
		Leaf g = new Leaf("g", "开发人员", 2000);
		Leaf h = new Leaf("h", "开发人员", 2000);
		Leaf i = new Leaf("i", "开发人员", 2000);
		Leaf j = new Leaf("j", "开发人员", 2000);
		Leaf k = new Leaf("k", "开发人员", 2000);
		// 组装
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);

		developDep.addSubordinate(firstDevGroup);
		salesDep.addSubordinate(secondDevGroup);
		financeDep.addSubordinate(thirdDevGroup);

		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);

		secondDevGroup.addSubordinate(d);
		secondDevGroup.addSubordinate(e);
		secondDevGroup.addSubordinate(f);

		thirdDevGroup.addSubordinate(g);
		thirdDevGroup.addSubordinate(h);
		thirdDevGroup.addSubordinate(i);
		thirdDevGroup.addSubordinate(j);
		thirdDevGroup.addSubordinate(k);

		return root;
	}

	/**
	 * 遍历整棵树，只需要根节点
	 * @param root
	 * @return
	 */
	public static String getTreeInfo(Branch root) {
		ArrayList<Corp> list = root.getSubordinateInfo();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			Corp object = list.get(i);
			if (object instanceof Leaf) {
				sb.append(object.getInfo() + "\n");
			} else {
				sb.append(object.getInfo() + "\n" + getTreeInfo((Branch) object));
			}
		}
		return sb.toString();
	}
}
