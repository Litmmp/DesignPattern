package adapter;

/**
 * 我们公司的人员信息接口
 * 
 * @author zx
 * @date 2016年2月14日
 */
public interface IUserInfo {

	/**
	 * 用户姓名
	 * @return
	 */
	String getUserName();

	/**
	 * 家庭地址
	 * @return
	 */
	String getHomeAddress();

	/**
	 * 手机号码
	 * @return
	 */
	String getMobileNumber();

	/**
	 * 办公电话
	 * @return
	 */
	String getOfficeTelNumber();

	/**
	 * 职位
	 * @return
	 */
	String getJobPosition();

	/**
	 * 家庭电话
	 * @return
	 */
	String getHomeTelNumber();

}
