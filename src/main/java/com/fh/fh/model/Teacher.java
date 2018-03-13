package com.fh.fh.model;

public class Teacher {
	private Integer teacherId;
	private Integer schoolId;
	private String teacherName;
	private String logo;
	private String introduction;
	private java.util.Date createTime;

	public void setTeacherId(Integer teacherId) {
		this.teacherId=teacherId;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId=schoolId;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName=teacherName == null ? teacherName : teacherName.trim();
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setLogo(String logo) {
		this.logo=logo == null ? logo : logo.trim();
	}

	public String getLogo() {
		return logo;
	}

	public void setIntroduction(String introduction) {
		this.introduction=introduction == null ? introduction : introduction.trim();
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

}
