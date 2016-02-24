package memento;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
 * 
 * 备忘录有太多的变形和处理方式。每种方式都有它自己的优点和缺点，标准的备忘录模式很难在项目中遇到，基本上都有一些变换处理方式。
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class Main {

	public static void main(String[] args) {
		// 主角
		Boy boy = new Boy();
		// 备忘录管理者
		Caretaker caretaker = new Caretaker();
		// 初始化状态
		boy.setState("心情很棒！");
		System.out.println("===男孩儿现在的状态===");
		System.out.println(boy.getState());
		// 记录下当前状态
		caretaker.setMemento(boy.createMemento());
		// 男孩儿去追求女孩儿，状态改变
		boy.changeState();
		System.out.println("\n===男孩儿追女孩儿后的状态===");
		System.out.println(boy.getState());
		// 追求失败，恢复原状
		boy.restoreMemento(caretaker.getMemento());
		System.out.println("\n===男孩儿恢复后的状态===");
		System.out.println(boy.getState());
	}

}
