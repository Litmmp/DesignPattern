package prototype;

import java.util.Random;

/**
 * 原型模式：不通过new关键字来产生一个对象，而是通过对象复制clone来实现的的模式就叫做原型模式
 * Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * @author zx
 * @date 2015年11月30日
 */
public class Client {
	private static int MAX_COUNT = 6;

	public static void main(String[] args) {
		// 模拟发送邮件
		int i = 0;
		// 把模板定义出来，这个应该是从数据库中获取
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有！");
		while (i < MAX_COUNT) {
			// 每封邮件不同的地方
			Mail clone = mail.clone();
			clone.setAppellation(getRandString(5) + "  先生（女士）");
			clone.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
			sendMail(clone);
			i++;
		}
	}

	/**
	 * 发送邮件
	 * @param mail
	 */
	public static void sendMail(Mail mail) {
		System.out.println("标 题：" + mail.getSubject());
		System.out.println("收件人：" + mail.getReceiver());
		System.out.println("...发送成功！");
	}

	/**
	 * 获取指定长度的随即字符串
	 * @param maxLength
	 * @return
	 */
	public static String getRandString(int maxLength) {
		String source = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < maxLength; i++) {
			sb.append(source.charAt(random.nextInt(source.length())));
		}
		return sb.toString();
	}
}
