package com.fh.sys.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Group {
	private String id;
	private String parentId;
	private String parentIds;
	private String name;
	private String roleId;
	private String groupType;
	private String provinceCode;
	private String cityCode;
	private String countyCode;
	private String address;
	private String zipCode;
	private Integer level;
	private String phone;
	private String fax;
	private String email;
	private Integer sort;
	private Integer useable;
	private String master;
	private String primaryPerson;
	private String deputyPerson;
	private String remarks;
	private String createBy;
	private java.util.Date createDate;
	private String updateBy;
	private java.util.Date updateDate;
	private Integer delFlag;
	
	private String roleName;

	public void setId(String id) {
		this.id=id == null ? id : id.trim();
	}

	public String getId() {
		return id;
	}

	public void setParentId(String parentId) {
		this.parentId=parentId == null ? parentId : parentId.trim();
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentIds(String parentIds) {
		this.parentIds=parentIds == null ? parentIds : parentIds.trim();
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setRoleId(String roleId) {
		this.roleId=roleId == null ? roleId : roleId.trim();
	}

	public String getRoleId() {
		return roleId;
	}

	public void setGroupType(String groupType) {
		this.groupType=groupType == null ? groupType : groupType.trim();
	}

	public String getGroupType() {
		return groupType;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode=provinceCode == null ? provinceCode : provinceCode.trim();
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode=cityCode == null ? cityCode : cityCode.trim();
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode=countyCode == null ? countyCode : countyCode.trim();
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setAddress(String address) {
		this.address=address == null ? address : address.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setZipCode(String zipCode) {
		this.zipCode=zipCode == null ? zipCode : zipCode.trim();
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setLevel(Integer level) {
		this.level=level;
	}

	public Integer getLevel() {
		return level;
	}

	public void setPhone(String phone) {
		this.phone=phone == null ? phone : phone.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setFax(String fax) {
		this.fax=fax == null ? fax : fax.trim();
	}

	public String getFax() {
		return fax;
	}

	public void setEmail(String email) {
		this.email=email == null ? email : email.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setSort(Integer sort) {
		this.sort=sort;
	}

	public Integer getSort() {
		return sort;
	}

	public void setUseable(Integer useable) {
		this.useable=useable;
	}

	public Integer getUseable() {
		return useable;
	}

	public void setMaster(String master) {
		this.master=master == null ? master : master.trim();
	}

	public String getMaster() {
		return master;
	}

	public void setPrimaryPerson(String primaryPerson) {
		this.primaryPerson=primaryPerson == null ? primaryPerson : primaryPerson.trim();
	}

	public String getPrimaryPerson() {
		return primaryPerson;
	}

	public void setDeputyPerson(String deputyPerson) {
		this.deputyPerson=deputyPerson == null ? deputyPerson : deputyPerson.trim();
	}

	public String getDeputyPerson() {
		return deputyPerson;
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
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	
	@JsonIgnore
	public static void sortList(List<Group> resultList, List<Group> sourceList, String parentId, boolean cascade){
		for (int i=0; i<sourceList.size(); i++){
			Group group = sourceList.get(i);
			if (group.getParentId().equals(parentId)){
				resultList.add(group);
				if (cascade){
					// 判断是否还有子节点, 有则继续获取子节点
					for (int j=0; j<sourceList.size(); j++){
						Group child = sourceList.get(j);
						if (child.getParentId().equals(group.getId())){
							sortList(resultList, sourceList, group.getId(), true);
							break;
						}
					}
				}
			}
		}
	}
	@JsonIgnore
	public static String getRootId(){
		return "1";
	}
	@JsonIgnore
	public static String getRootPId(){
		return "0";
	}

}
