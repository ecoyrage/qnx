package com.fh.sys.model;

public class Admin {
	private String id;
	private String userCode;
	private String groupId;
	private String roleIds;
	private String loginname;
	private String password;
	private String jobno;
	private String name;
	private Integer sex;
	private String email;
	private String mobile;
	private String phone;
	private String userType;
	private String photo;
	private String loginIp;
	private java.util.Date loginDate;
	private Integer useable;
	private String remarks;
	private String createBy;
	private java.util.Date createDate;
	private String updateBy;
	private java.util.Date updateDate;
	private Integer delFlag;

	public void setId(String id) {
		this.id=id == null ? id : id.trim();
	}

	public String getId() {
		return id;
	}

	public void setUserCode(String userCode) {
		this.userCode=userCode == null ? userCode : userCode.trim();
	}

	public String getUserCode() {
		return userCode;
	}

	public void setGroupId(String groupId) {
		this.groupId=groupId == null ? groupId : groupId.trim();
	}

	public String getGroupId() {
		return groupId;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds=roleIds == null ? roleIds : roleIds.trim();
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setLoginname(String loginname) {
		this.loginname=loginname == null ? loginname : loginname.trim();
	}

	public String getLoginname() {
		return loginname;
	}

	public void setPassword(String password) {
		this.password=password == null ? password : password.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setJobno(String jobno) {
		this.jobno=jobno == null ? jobno : jobno.trim();
	}

	public String getJobno() {
		return jobno;
	}

	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setSex(Integer sex) {
		this.sex=sex;
	}

	public Integer getSex() {
		return sex;
	}

	public void setEmail(String email) {
		this.email=email == null ? email : email.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setMobile(String mobile) {
		this.mobile=mobile == null ? mobile : mobile.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setPhone(String phone) {
		this.phone=phone == null ? phone : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setUserType(String userType) {
		this.userType=userType == null ? userType : userType.trim();
	}

	public String getUserType() {
		return userType;
	}

	public void setPhoto(String photo) {
		this.photo=photo == null ? photo : photo.trim();
	}

	public String getPhoto() {
		return photo;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp=loginIp == null ? loginIp : loginIp.trim();
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginDate(java.util.Date loginDate) {
		this.loginDate=loginDate;
	}

	public java.util.Date getLoginDate() {
		return loginDate;
	}

	public void setUseable(Integer useable) {
		this.useable=useable;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setRemarks(String remarks) {
		this.remarks=remarks == null ? remarks : remarks.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setCreateBy(String createBy) {
		this.createBy=createBy == null ? createBy : createBy.trim();
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate=createDate;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy=updateBy == null ? updateBy : updateBy.trim();
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate=updateDate;
	}

	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag=delFlag;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

}
