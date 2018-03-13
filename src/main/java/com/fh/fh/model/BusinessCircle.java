package com.fh.fh.model;

public class BusinessCircle {
	private Integer id;
	private String name;
	private Integer level;
	private Integer parentId;
	private Integer rank;
	private String treePath;
	private String fullName;

	public void setId(Integer id) {
		this.id=id;
	}

	public Integer getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}

	public void setLevel(Integer level) {
		this.level=level;
	}

	public Integer getLevel() {
		return level;
	}

	public void setParentId(Integer parentId) {
		this.parentId=parentId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setRank(Integer rank) {
		this.rank=rank;
	}

	public Integer getRank() {
		return rank;
	}

	public void setTreePath(String treePath) {
		this.treePath=treePath == null ? treePath : treePath.trim();
	}

	public String getTreePath() {
		return treePath;
	}

	public void setFullName(String fullName) {
		this.fullName=fullName == null ? fullName : fullName.trim();
	}

	public String getFullName() {
		return fullName;
	}

}
