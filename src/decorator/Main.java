package decorator;

/**
 * 装饰器模式是比较常用的一种模式：动态地给一个对象添加一些额外的功能职责。就增加功能来说，装饰模式相比生成子类更加灵活。
 * 
 * 装饰模式是对继承的有力补充！
 * 
 * 优点：
 * 	1、装饰类和被装饰类可以独立发展，而不会相互耦合。
 * 	2、装饰模式是继承关系的一个替代方案。
 * 	3、装饰模式可以动态地扩展一个实现类的功能。
 * 
 * 缺点：
 * 	1、多层的装饰比较复杂。因此，尽量减少装饰类的数量，以便降低系统的复杂度。
 * 
 * @author zx
 * @date 2016年2月13日
 */
public class Main {

	public static void main(String[] args) {
		SchoolReport sr;
		// 原始成绩单
		sr = new FouthGradeSchoolReport();
		// 加了最高分情况
		sr = new HighScoreDecorator(sr);
		// 又加了成绩排名的说明
		sr = new SortDecorator(sr);
		// 看成绩单
		sr.report();
		// 签字
		sr.sign("父亲");
	}

}
