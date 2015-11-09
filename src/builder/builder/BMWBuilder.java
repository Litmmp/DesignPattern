package builder.builder;

import java.util.ArrayList;

import builder.model.BMWModel;

/**
 * 宝马建造者
 * @author zx
 * @date 2015年11月9日
 */
public class BMWBuilder extends CarBuilder {

	private ArrayList<String> sequence;

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}

	@Override
	public BMWModel getCarModel() {
		BMWModel model = new BMWModel();
		model.setSequence(this.sequence);
		return model;
	}

}
