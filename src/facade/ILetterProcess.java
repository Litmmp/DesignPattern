package facade;

/**
 * 写信过程接口
 * 
 * @author zx
 * @date 2016年2月17日
 */
public interface ILetterProcess {
	/**
	 * 写信内容
	 * @param context
	 */
	void writeContext(String context);

	/**
	 * 写信封
	 * @param address
	 */
	void fillEnvelope(String address);

	/**
	 * 把信放到信封里
	 */
	void letterInotoEnvelope();

	/**
	 * 邮递
	 */
	void sendLetter();
}
