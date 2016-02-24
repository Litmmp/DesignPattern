package prototype;

/**
 * 原型模型通用源码
 * 原型模式：不通过new关键字来产生一个对象，而是通过对象复制clone来实现的的模式就叫做原型模式
 * 
 * Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 
 * 原型模式是在内存二进制流的拷贝，要比直接new对象性能好得多。
 * 因为原型模式是直接在内存中操作二进制流，所以可以逃避构造函数的约束，这既是它的优点也是缺点。
 * 
 * 使用原型模式的时候要注意“深浅拷贝”的问题
 * 
 * @author zx
 * @date 2015年11月30日
 */
public class PrototypeClass implements Cloneable {

	@Override
	protected PrototypeClass clone() {
		PrototypeClass clone = null;
		try {
			clone = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

}
