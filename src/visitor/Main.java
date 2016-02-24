package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式：封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作
 * 
 * 优点：
 * 	1、符合单一职责原则
 * 	2、优秀的扩展性
 * 	3、灵活性非常高
 * 
 * 缺点：
 * 	1、具体元素对访问者公布细节
 * 	2、具体元素变更比较困难
 * 	3、违背了依赖倒置原则
 * 
 * 访问者模式是一种集中规整模式，特别适用于大规模重构的项目，在这一个阶段需求已经非常清晰，原系统的功能点也已经明确，
 * 通过访问者模式可以很容易把一些功能进行梳理，达到最终的目的：功能集中化。
 * 
 * @author zx
 * @date 2016年2月18日
 */
public class Main {

	public static List<Employee> mockEmployee() {
		List<Employee> list = new ArrayList<>();
		// 张三
		CommonEmployee zhangsan = new CommonEmployee();
		zhangsan.setName("张三");
		zhangsan.setJob("Java程序员");
		zhangsan.setSalary(1800);
		zhangsan.setSex(Employee.MALE);
		list.add(zhangsan);
		// 李四
		CommonEmployee lisi = new CommonEmployee();
		lisi.setName("李四");
		lisi.setJob("页面美工");
		lisi.setSalary(2000);
		lisi.setSex(Employee.FEMALE);
		list.add(lisi);
		// 经理
		Manager wangwu = new Manager();
		wangwu.setName("王五");
		wangwu.setPerformance("基本是负值");
		wangwu.setSalary(3000);
		wangwu.setSex(Employee.MALE);
		list.add(wangwu);
		return list;
	}

	public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		List<Employee> employees = mockEmployee();
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			employee.accept(visitor);
		}
		System.out.println("月工资总和是：" + visitor.getTotalSalary());
	}

}
