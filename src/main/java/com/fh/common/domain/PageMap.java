package com.fh.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;

public class PageMap extends HashMap<String, Object> {
	public PageMap() {
		super();
	}
	public PageMap(int pageNum, int pageSize) {
		super();
		setPageNum(pageNum);
		setPageSize(pageSize);
	}
	public PageMap(long total, List list) {
		super();
		setTotal(total);
		setList(list);
	}
	public PageMap(List list) {
		super();
		data(list);
	}
	public PageMap data(List list) {
		setList(list);
		if (list instanceof Page) {
			Page page = (Page) list;
			setTotal(page.getTotal());
			setPages(page.getPages());
			setPageNum(page.getPageNum());
			setPageSize(page.getPageSize());
		}
		return this;
	}
	
	
	public Integer getPageNum() {
		return (Integer) get("pageNum");
	}
	public void setPageNum(Integer pageNum) {
		put("pageNum", pageNum);
	}
	public Integer getPageSize() {
		return (Integer) get("pageSize");
	}
	public void setPageSize(Integer pageSize) {
		put("pageSize", pageSize);
	}
	public Long getTotal() {
		return (Long) get("total");
	}
	public void setTotal(Long total) {
		put("total", total);
	}
	public Integer getPages() {
		return (Integer) get("pages");
	}
	public void setPages(Integer pages) {
		put("pages", pages);
	}
	public List getList() {
		return (List) get("list");
	}
	public void setList(List list) {
		put("list", list);
	}
	public String getOrderBy() {
		return (String) get("orderBy");
	}
	public String getOrderByWith(String lastOrderBy) {
		String orderBy = (String) get("orderBy");
		if(orderBy != null){
			return orderBy + "," + lastOrderBy;
		}else{
			return lastOrderBy;
		}
	}
	public void setOrderBy(String orderBy) {
		put("orderBy", orderBy);
	}
	
	
	/********/
	@JsonIgnore
	public String getStr(String key){
		return (String) get(key);
	}
	@JsonIgnore
	public Integer getInt(String key){
		try {
			return Integer.valueOf(getStr(key));
		} catch (Exception e) {
			return null;
		}
	}
	@JsonIgnore
	public Long getLong(String key){
		try {
			return Long.valueOf(getStr(key));
		} catch (Exception e) {
			return null;
		}
	}
	@JsonIgnore
	public Double getDouble(String key){
		try {
			return Double.valueOf(getStr(key));
		} catch (Exception e) {
			return null;
		}
	}
	@JsonIgnore
	public Boolean getBoolean(String key){
		try {
			String val = getStr(key);
			//return Boolean.valueOf(getStr(key));
			return ((val != null) && ("true".equalsIgnoreCase(val) || "1".equals(val)));
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
