package iterator;

import java.util.ArrayList;

/**
 * 实现迭代器
 * 
 * @author zx
 * @date 2016年2月15日
 */
public class ProjectIterator implements IProjectIterator {

	// 项目列表
	private ArrayList<IProject> projects = new ArrayList<>();
	private int currentItem;

	public ProjectIterator(ArrayList<IProject> projects) {
		this.projects = projects;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if (this.currentItem >= projects.size() || this.projects.get(this.currentItem) == null) {
			b = false;
		}
		return b;
	}

	@Override
	public Object next() {
		return this.projects.get(this.currentItem++);
	}

	@Override
	public void remove() {
		// 暂时没有使用到
	}

}
