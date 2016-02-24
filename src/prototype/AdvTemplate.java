package prototype;

/**
 * 广告信模板代码
 * @author zx
 * @date 2015年11月30日
 */
public class AdvTemplate {
	
	//广告信名称
	private String advSubject = "XX银行抽奖活动";
	
	//广告信内容
	private String advContext = "抽奖活动通知：只要刷卡就送你一亿人民币！";

	public void setAdvSubject(String advSubject) {
		this.advSubject = advSubject;
	}

	public String getAdvSubject() {
		return advSubject;
	}

	public void setAdvContext(String advContext) {
		this.advContext = advContext;
	}

	public String getAdvContext() {
		return advContext;
	}
}
