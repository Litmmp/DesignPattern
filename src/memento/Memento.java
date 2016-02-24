package memento;

/**
 * 备忘录
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class Memento {

	// 男孩儿的状态
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento(String state) {
		this.state = state;
	}

}
