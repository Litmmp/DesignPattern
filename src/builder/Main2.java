package builder;

import builder.director.Director;

/**
 * 有导演类的时候
 * @author zx
 * @date 2015年11月9日
 */
public class Main2 {
	public static void main(String[] args) {
		Director director = new Director();
		// 100辆 奔驰A
		for (int i = 0; i < 100; i++) {
			director.getBenzModelA().run();
		}
		// 50辆 奔驰B
		for (int i = 0; i < 50; i++) {
			director.getBenzModelB().run();
		}

		// ...
	}
}
