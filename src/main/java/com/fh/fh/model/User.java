package com.fh.fh.model;

public class User {
	private Integer id;
	private String userCode;
	private String mobile;
	private String realName;
	private String password;
	private String accessToken;
	private java.util.Date expiredTime;
	private String loginType;
	private String address;
	private Integer useable;
	private String remark;
	private java.math.BigDecimal amount;
	private java.util.Date createTime;
	private java.util.Date updateTime;

	public void setId(Integer id) {
		this.id=id;
	}

	public Integer getId() {
		return id;
	}

	public void setUserCode(String userCode) {
		this.userCode=userCode == null ? userCode : userCode.trim();
	}

	public String getUserCode() {
		return userCode;
	}

	public void setMobile(String mobile) {
		this.mobile=mobile == null ? mobile : mobile.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setRealName(String realName) {
		this.realName=realName == null ? realName : realName.trim();
	}

	public String getRealName() {
		return realName;
	}

	public void setPassword(String password) {
		this.password=password == null ? password : password.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken=accessToken == null ? accessToken : accessToken.trim();
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setExpiredTime(java.util.Date expiredTime) {
		this.expiredTime=expiredTime;
	}

	public java.util.Date getExpiredTime() {
		return expiredTime;
	}

	public void setLoginType(String loginType) {
		this.loginType=loginType == null ? loginType : loginType.trim();
	}

	public String getLoginType() {
		return loginType;
	}

	public void setAddress(String address) {
		this.address=address == null ? address : address.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setUseable(Integer useable) {
		this.useable=useable;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setRemark(String remark) {
		this.remark=remark == null ? remark : remark.trim();
	}

	public String getRemark() {
		return remark;
	}

	public void setAmount(java.math.BigDecimal amount) {
		this.amount=amount;
	}

	public java.math.BigDecimal getAmount() {
		return amount;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime=updateTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

}
