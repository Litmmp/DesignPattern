package builder.director;

import java.util.ArrayList;

import builder.builder.BMWBuilder;
import builder.builder.BenzBuilder;
import builder.model.BMWModel;
import builder.model.BenzModel;

/**
 * 导演类，统一指挥，在这里面可以自由组合车的执行顺序
 * @author zx
 * @date 2015年11月9日
 */
public class Director {

	// 建造者
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();

	/**
	 * 奔驰A型号
	 * @return
	 */
	public BenzModel getBenzModelA() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.add("start");
		sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return this.benzBuilder.getCarModel();
	}

	/**
	 * 奔驰B型号
	 * @return
	 */
	public BenzModel getBenzModelB() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return this.benzBuilder.getCarModel();
	}

	/**
	 * 宝马A型号
	 * @return
	 */
	public BMWModel getBMWModelA() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.add("start");
		sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return this.bmwBuilder.getCarModel();
	}

	/**
	 * 宝马B型号
	 * @return
	 */
	public BMWModel getBMWModelB() {
		ArrayList<String> sequence = new ArrayList<>();
		sequence.add("start");
		sequence.add("alarm");
		sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return this.bmwBuilder.getCarModel();
	}

	// ...
}
