package memento;

/**
 * 男孩儿
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class Boy {

	// 男孩儿状态
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void changeState() {
		state = "心情可能很不好";
	}

	/**
	 * 创建备忘录
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 恢复一个备份
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		setState(memento.getState());
	}

}
