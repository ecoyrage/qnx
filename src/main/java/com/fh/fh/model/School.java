package com.fh.fh.model;

public class School {
	private Integer schoolId;
	private String name;
	private String tel;
	private String logo;
	private String address;
	private Integer hot;
	private String trainingType;
	private String businessCircle;
	private String introduction;
	private String label;
	private Integer state;
	private java.util.Date createTime;

	public void setSchoolId(Integer schoolId) {
		this.schoolId=schoolId;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setTel(String tel) {
		this.tel=tel == null ? tel : tel.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setLogo(String logo) {
		this.logo=logo == null ? logo : logo.trim();
	}

	public String getLogo() {
		return logo;
	}

	public void setAddress(String address) {
		this.address=address == null ? address : address.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setHot(Integer hot) {
		this.hot=hot;
	}

	public Integer getHot() {
		return hot;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType=trainingType == null ? trainingType : trainingType.trim();
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setBusinessCircle(String businessCircle) {
		this.businessCircle=businessCircle == null ? businessCircle : businessCircle.trim();
	}

	public String getBusinessCircle() {
		return businessCircle;
	}

	public void setIntroduction(String introduction) {
		this.introduction=introduction == null ? introduction : introduction.trim();
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setLabel(String label) {
		this.label=label == null ? label : label.trim();
	}

	public String getLabel() {
		return label;
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
