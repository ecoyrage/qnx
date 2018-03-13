package com.fh.sys.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable {
	private String id;
	private String parentId;
	private String parentIds;
	private String name;
	private String rightsCode;// 权限标识字符  唯一
	private Integer level;
	private Integer sort;
	private String href;
	private String target;// 目标（ mainFrame、_blank、_self、_parent、_top）
	private String icon;
	private Integer isHide;
	private String remarks;
	private String createBy;
	private java.util.Date createDate;
	private String updateBy;
	private java.util.Date updateDate;
	private Integer delFlag;

	
	private boolean checked;
	private List<Menu> children = new ArrayList<Menu>();
	
	
	public Menu(){
		this.sort = 30;
	}
	public Menu(String id){
		this.id = id;
	}
	
	
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

	public void setRightsCode(String rightsCode) {
		this.rightsCode=rightsCode == null ? rightsCode : rightsCode.trim();
	}

	public String getRightsCode() {
		return rightsCode;
	}

	public void setLevel(Integer level) {
		this.level=level;
	}

	public Integer getLevel() {
		return level;
	}

	public void setSort(Integer sort) {
		this.sort=sort;
	}

	public Integer getSort() {
		return sort;
	}

	public void setHref(String href) {
		this.href=href == null ? href : href.trim();
	}

	public String getHref() {
		return href;
	}

	public void setTarget(String target) {
		this.target=target == null ? target : target.trim();
	}

	public String getTarget() {
		return target;
	}

	public void setIcon(String icon) {
		this.icon=icon == null ? icon : icon.trim();
	}

	public String getIcon() {
		return icon;
	}

	public void setIsHide(Integer isHide) {
		this.isHide=isHide;
	}

	public Integer getIsHide() {
		return isHide;
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

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	
	
	@JsonIgnore
	public static void sortList(List<Menu> list, List<Menu> sourcelist, String parentId, boolean cascade){
		for (int i=0; i<sourcelist.size(); i++){
			Menu e = sourcelist.get(i);
			if (e.getParentId().equals(parentId)){
				list.add(e);
				if (cascade){
					// 判断是否还有子节点, 有则继续获取子节点
					for (int j=0; j<sourcelist.size(); j++){
						Menu child = sourcelist.get(j);
						if (child.getParentId().equals(e.getId())){
							sortList(list, sourcelist, e.getId(), true);
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
