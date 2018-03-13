package com.fh.common.domain;

import java.util.List;

public class Page<T> {
	private int pageNum = 1;
    private int pageSize = 16;
    private long pages;
    private long total = 1;
    private List<T> list;
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getPages() {
		return pages;
	}
	public void setPages(long pages) {
		this.pages = pages;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		if (total>0) {
			this.total = total;
		}
	}
	public Page data(List list) {
		setList(list);
		if (list instanceof com.github.pagehelper.Page) {
			com.github.pagehelper.Page page = (com.github.pagehelper.Page) list;
			setTotal(page.getTotal());
			setPages(page.getPages());
			setPageNum(page.getPageNum());
			setPageSize(page.getPageSize());
		}
		return this;
	}
    
    
}
