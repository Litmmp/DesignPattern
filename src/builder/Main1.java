package builder;

import java.util.ArrayList;

import builder.builder.BMWBuilder;
import builder.builder.BenzBuilder;

/**
 * 建造者模式，没有导演类的时候
 * @author zx
 * @date 2015年11月9日
 */
public class Main1 {
	public static void main(String[] args) {
		// 执行顺序
		ArrayList<String> sequence = new ArrayList<>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");

		// 奔驰
		BenzBuilder benzBuilder = new BenzBuilder();
		benzBuilder.setSequence(sequence);
		benzBuilder.getCarModel().run();

		// 宝马
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		bmwBuilder.getCarModel().run();
	}
}
