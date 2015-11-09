package builder.builder;

import java.util.ArrayList;

import builder.model.BenzModel;

/**
 * 奔驰建造者
 * @author zx
 * @date 2015年11月9日
 */
public class BenzBuilder extends CarBuilder {

	private ArrayList<String> sequence = null;

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	@Override
	public BenzModel getCarModel() {
		BenzModel model = new BenzModel();
		model.setSequence(this.sequence);
		return model;
	}

}
