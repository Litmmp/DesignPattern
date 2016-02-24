package memento;

/**
 * 备忘录管理者
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class Caretaker {

	// 备忘录对象
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
