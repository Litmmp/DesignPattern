package builder.builder;

import java.util.ArrayList;

import builder.model.CarModel;

/**
 * 建造者基类
 * @author zx
 * @date 2015年11月9日
 */
public abstract class CarBuilder {
	/**
	 * 设置组装顺序
	 * @param sequence
	 */
	public abstract void setSequence(ArrayList<String> sequence);

	/**
	 * 获取CarModel实例
	 * @return
	 */
	public abstract CarModel getCarModel();
}
