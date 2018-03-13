package com.fh.fh.model;

public class Franchisee {
	private Integer franchiseeId;
	private String franchiseeName;
	private String logo;
	private Integer state;
	private java.util.Date createTime;

	public void setFranchiseeId(Integer franchiseeId) {
		this.franchiseeId=franchiseeId;
	}

	public Integer getFranchiseeId() {
		return franchiseeId;
	}

	public void setFranchiseeName(String franchiseeName) {
		this.franchiseeName=franchiseeName == null ? franchiseeName : franchiseeName.trim();
	}

	public String getFranchiseeName() {
		return franchiseeName;
	}

	public void setLogo(String logo) {
		this.logo=logo == null ? logo : logo.trim();
	}

	public String getLogo() {
		return logo;
	}

	public void setState(Integer state) {
		this.state=state;
	}

	public Integer getState() {
		return state;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

}
