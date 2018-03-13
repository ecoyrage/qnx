package com.fh.fh.model;

public class Course {
	private Integer courseId;
	private Integer schoolId;
	private String courseName;
	private String content;
	private String level;
	private String cycle;
	private String courseTime;
	private String trainingType;
	private String logo;
	private Integer hot;
	private java.util.Date createTime;
	private Integer state;

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

	public void setCourseName(String courseName) {
		this.courseName=courseName == null ? courseName : courseName.trim();
	}

	public String getCourseName() {
		return courseName;
	}

	public void setContent(String content) {
		this.content=content == null ? content : content.trim();
	}

	public String getContent() {
		return content;
	}

	public void setLevel(String level) {
		this.level=level == null ? level : level.trim();
	}

	public String getLevel() {
		return level;
	}

	public void setCycle(String cycle) {
		this.cycle=cycle == null ? cycle : cycle.trim();
	}

	public String getCycle() {
		return cycle;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime=courseTime == null ? courseTime : courseTime.trim();
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType=trainingType == null ? trainingType : trainingType.trim();
	}

	public String getTrainingType() {
		return trainingType;
	}

	public void setLogo(String logo) {
		this.logo=logo == null ? logo : logo.trim();
	}

	public String getLogo() {
		return logo;
	}

	public void setHot(Integer hot) {
		this.hot=hot;
	}

	public Integer getHot() {
		return hot;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setState(Integer state) {
		this.state=state;
	}

	public Integer getState() {
		return state;
	}

}
