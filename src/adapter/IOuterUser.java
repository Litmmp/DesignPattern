package adapter;

import java.util.Map;

/**
 * 劳务公司的人员信息接口
 * 
 * @author zx
 * @date 2016年2月14日
 */
public interface IOuterUser {

	/**
	 * 员工的基本信息
	 * @return
	 */
	Map<String, Object> getUserBaseInfo();

	/**
	 * 有关员工的工作信息
	 * @return
	 */
	Map<String, Object> getUserOfficeInfo();

	/**
	 * 用户的家庭信息
	 * @return
	 */
	Map<String, Object> getUserHomeInfo();

}
