package com.fh.fh.model;

public class Apply {
	private Integer applyId;
	private Integer courseId;
	private Integer schoolId;
	private String content;
	private String name;
	private String tel;
	private String trainingType;
	private String businessCircle;
	private java.util.Date createTime;

	public void setApplyId(Integer applyId) {
		this.applyId=applyId;
	}

	public Integer getApplyId() {
		return applyId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId=courseId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId=schoolId;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setContent(String content) {
		this.content=content == null ? content : content.trim();
	}

	public String getContent() {
		return content;
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

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

}
