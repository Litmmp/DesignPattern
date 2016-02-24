package chain_of_responsibility;

import java.util.ArrayList;
import java.util.Random;

/**
 * 	责任链模式
 * 
 * 	非常显著的优点：
 * 		将请求和处理分开。请求者不用知道处理者是谁，处理者不用知道请求者的全貌。
 * 
 * 	两个显著的缺点：
 * 		1、每个请求都是从链头遍历到链尾，特别是在链比较长的时候，性能是一个非常大的问题。
 * 		2、由于采用了类似于递归的方式，调试的时候逻辑可能比较复杂，特别是在链比较长的时候。
 * 
 * @author zx
 * @date 2016年2月12日
 */
public class Main {

	public static void main(String[] args) {
		// 随即挑选几个女性
		Random random = new Random();
		ArrayList<IWomen> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new Women(random.nextInt(4), "我要去逛街"));
		}
		// 定义三个请示对象
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		// 设置请求顺序
		father.setNextHandler(husband);
		husband.setNextHandler(son);

		for (int i = 0; i < list.size(); i++) {
			father.HandleMessage(list.get(i));
		}
	}
}
