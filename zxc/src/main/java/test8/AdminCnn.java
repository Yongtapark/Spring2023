package test8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AdminCnn implements InitializingBean, DisposableBean {
	private String adminId;
	private String adminPw;
	private String subId;
	private String subPw;
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubPw() {
		return subPw;
	}
	public void setSubPw(String subPw) {
		this.subPw = subPw;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("√ ±‚»≠");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("∞¥√ºº“∏Í");
		
	}
	
	

}
