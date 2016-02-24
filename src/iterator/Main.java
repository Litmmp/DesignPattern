package iterator;

/**
 * 迭代器模式：提供一种方法访问一个容器对象中各个元素，而又不需要暴露该对象的内部细节
 * 目前已经是一个很没落的模式！完全没有必要自己再去实现迭代器，基本可以从设计模式中排除了！
 * JDK1.2版本开始增加java.util.Iterator这个接口，并逐步把Iterator应用到各个集合类中，Java已经把迭代器融入到了我们经常使用的API中，我们才能应用的如此轻松、便捷。
 * 
 * @author zx
 * @date 2016年2月15日
 */
public class Main {

	public static void main(String[] args) {
		// 定义一个Project
		IProject project = new Project();
		project.add("星球大战", 10, 10000);
		project.add("扭转时空", 100, 1000000);
		project.add("超人项目", 5, 50000);
		// 再加100个项目
		for (int i = 1; i < 100; i++) {
			project.add("第" + i + "个项目", i * 2, 10000 * 2);
		}
		IProjectIterator iterator = project.iterator();
		while (iterator.hasNext()) {
			IProject object = (IProject) iterator.next();
			System.out.println(object.getProjectInfo());
		}
	}

}
