package com.fh.common.util.sms;
/**
 * 
 * @author tianyh 
 * @Description:普通短信发送实体类
 */
public class SmsSendRequest {
	private String account;
	private String password;
	private String msg;
	private String phone;
	private String sendtime;
	private String report;
	private String extend;
	private String uid;
	
	public SmsSendRequest() {
		
	}
	public SmsSendRequest(String account, String password, String msg, String phone) {
		super();
		this.account = account;
		this.password = password;
		this.msg = msg;
		this.phone = phone;
	}
	public SmsSendRequest(String account, String password, String msg, String phone, String report) {
		super();
		this.account = account;
		this.password = password;
		this.msg = msg;
		this.phone = phone;
		this.report=report;
	}
	
	public SmsSendRequest(String account, String password, String msg, String phone, String report, String sendtime) {
		super();
		this.account = account;
		this.password = password;
		this.msg = msg;
		this.phone = phone;
		this.sendtime=sendtime;
		this.report=report;
	}
	public SmsSendRequest(String account, String password, String msg, String phone, String sendtime, String report, String uid) {
		super();
		this.account = account;
		this.password = password;
		this.msg = msg;
		this.phone = phone;
		this.sendtime=sendtime;
		this.report=report;
		this.uid=uid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getExtend() {
		return extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
