package adapter;

/**
 * 适配器模式：将一个类的接口变成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * 
 * 适配器模式是一个补偿模式，或者说是一个“补救”模式，初期开发时没必要使用
 * 
 * 优点：
 * 	1、可以让两个没有任何关系的类在一起运行
 * 	2、增加了类的透明性
 * 	3、提高了类的复用性
 * 	4、灵活性非常好
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class Main {

	public static void main(String[] args) {
		IUserInfo youngGril;
		youngGril = new UserInfo();
		for (int i = 0; i < 100; i++) {
			youngGril.getMobileNumber();
		}
		youngGril = new OuterUserInfo();
		for (int i = 0; i < 100; i++) {
			youngGril.getMobileNumber();
		}
	}

}
