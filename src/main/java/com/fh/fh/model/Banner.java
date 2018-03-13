package com.fh.fh.model;

public class Banner {
	private Integer id;
	private String title;
	private Integer type;
	private String imgUrl;
	private String linkUrl;
	private Integer status;
	private java.util.Date createTime;
	private java.util.Date updateTime;

	public void setId(Integer id) {
		this.id=id;
	}

	public Integer getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title=title == null ? title : title.trim();
	}

	public String getTitle() {
		return title;
	}

	public void setType(Integer type) {
		this.type=type;
	}

	public Integer getType() {
		return type;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl=imgUrl == null ? imgUrl : imgUrl.trim();
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl=linkUrl == null ? linkUrl : linkUrl.trim();
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setStatus(Integer status) {
		this.status=status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime=createTime;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime=updateTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

}
