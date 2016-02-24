package facade;

/**
 * 信件检查类
 * 
 * @author zx
 * @date 2016年2月17日
 */
public class Police {

	/**
	 * 检查
	 * @param letterProcess
	 */
	public void checkLetter(ILetterProcess letterProcess) {
		System.out.println(letterProcess + " 信件已检查盖章");
	}

}
