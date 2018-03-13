package com.fh.sys.model;

import java.util.List;

public class Role {
	private String id;
	private String groupId;
	private String name;
	private String enname;
	private String roleType;
	private String remarks;
	private Integer useable;
	private String createBy;
	private java.util.Date createDate;
	private String updateBy;
	private java.util.Date updateDate;
	private Integer delFlag;

	//
	private List<RoleMenu> roleMenuList;
	
	
	public void setId(String id) {
		this.id=id == null ? id : id.trim();
	}

	public String getId() {
		return id;
	}

	public void setGroupId(String groupId) {
		this.groupId=groupId == null ? groupId : groupId.trim();
	}

	public String getGroupId() {
		return groupId;
	}

	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setEnname(String enname) {
		this.enname=enname == null ? enname : enname.trim();
	}

	public String getEnname() {
		return enname;
	}

	public void setRoleType(String roleType) {
		this.roleType=roleType == null ? roleType : roleType.trim();
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRemarks(String remarks) {
		this.remarks=remarks == null ? remarks : remarks.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setUseable(Integer useable) {
		this.useable=useable;
	}

	public Integer getUseable() {
		return useable;
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

	public List<RoleMenu> getRoleMenuList() {
		return roleMenuList;
	}

	public void setRoleMenuList(List<RoleMenu> roleMenuList) {
		this.roleMenuList = roleMenuList;
	}

}
