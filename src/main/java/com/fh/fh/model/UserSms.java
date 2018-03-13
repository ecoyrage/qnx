package com.fh.fh.model;

public class UserSms {
	private Long id;
	private String content;
	private java.util.Date endTime;
	private String fromName;
	private String method;
	private java.util.Date startTime;
	private Integer status;
	private String tel;
	private String vaildCode;
	private Integer vaildTimes;

	public void setId(Long id) {
		this.id=id;
	}

	public Long getId() {
		return id;
	}

	public void setContent(String content) {
		this.content=content == null ? content : content.trim();
	}

	public String getContent() {
		return content;
	}

	public void setEndTime(java.util.Date endTime) {
		this.endTime=endTime;
	}

	public java.util.Date getEndTime() {
		return endTime;
	}

	public void setFromName(String fromName) {
		this.fromName=fromName == null ? fromName : fromName.trim();
	}

	public String getFromName() {
		return fromName;
	}

	public void setMethod(String method) {
		this.method=method == null ? method : method.trim();
	}

	public String getMethod() {
		return method;
	}

	public void setStartTime(java.util.Date startTime) {
		this.startTime=startTime;
	}

	public java.util.Date getStartTime() {
		return startTime;
	}

	public void setStatus(Integer status) {
		this.status=status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setTel(String tel) {
		this.tel=tel == null ? tel : tel.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setVaildCode(String vaildCode) {
		this.vaildCode=vaildCode == null ? vaildCode : vaildCode.trim();
	}

	public String getVaildCode() {
		return vaildCode;
	}

	public void setVaildTimes(Integer vaildTimes) {
		this.vaildTimes=vaildTimes;
	}

	public Integer getVaildTimes() {
		return vaildTimes;
	}

}
