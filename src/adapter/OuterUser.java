package adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 劳务公司的人员信息接口实现类
 * 
 * @author zx
 * @date 2016年2月14日
 */
public class OuterUser implements IOuterUser {

	@Override
	public Map<String, Object> getUserBaseInfo() {
		HashMap<String, Object> baseInfo = new HashMap<>();
		baseInfo.put("userName", "员工姓名...");
		baseInfo.put("mobileNumber", "员工电话...");
		return baseInfo;
	}

	@Override
	public Map<String, Object> getUserOfficeInfo() {
		HashMap<String, Object> officeInfo = new HashMap<>();
		officeInfo.put("jobPosition", "员工职位...");
		officeInfo.put("officeTelNumber", "员工的办公电话...");
		return officeInfo;
	}

	@Override
	public Map<String, Object> getUserHomeInfo() {
		HashMap<String, Object> homeInfo = new HashMap<>();
		homeInfo.put("homeTelNumber", "员工的家庭电话...");
		homeInfo.put("homeAddress", "员工的家庭地址...");
		return homeInfo;
	}

}
