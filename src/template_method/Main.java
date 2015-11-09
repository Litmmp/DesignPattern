package template_method;

import template_method.model.HummerH1Model;
import template_method.model.HummerH2Model;

/**
 * @author zx
 * @date 2015年11月9日
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("---第一辆悍马H1不响喇叭---");
		HummerH1Model h1_1 = new HummerH1Model();
		h1_1.setAlarm(false);
		h1_1.run();

		System.out.println("---第二辆悍马H2响喇叭---");
		HummerH1Model h1_2 = new HummerH1Model();
		h1_2.run();

		System.out.println("---悍马H2默认就是不响喇叭的---");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();

	}
}
