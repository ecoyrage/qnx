package com.fh.fh.model;

public class Suggest {
	private Integer suggestId;
	private String title;
	private String tel;
	private String content;
	private java.util.Date createTime;

	public void setSuggestId(Integer suggestId) {
		this.suggestId=suggestId;
	}

	public Integer getSuggestId() {
		return suggestId;
	}

	public void setTitle(String title) {
		this.title=title == null ? title : title.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setTel(String tel) {
		this.tel=tel == null ? tel : tel.trim();
	}

	public String getTel() {
		return tel;
	}

	public void setContent(String content) {
		this.content=content == null ? content : content.trim();
	}

	public String getContent() {
		return content;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

}
