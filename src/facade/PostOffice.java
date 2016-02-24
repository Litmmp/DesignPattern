package facade;

/**
 * 邮局
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class PostOffice {

	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police police = new Police();

	/**
	 * 写信、装封、投递，一体化了
	 * @param context
	 * @param address
	 */
	public void sendLetter(String context, String address) {
		// 帮你写信
		letterProcess.writeContext(context);
		// 写好信封
		letterProcess.fillEnvelope(address);
		// 把信放到信封中
		letterProcess.letterInotoEnvelope();
		// 信件检查
		police.checkLetter(letterProcess);
		// 邮递信件
		letterProcess.sendLetter();
	}

}
