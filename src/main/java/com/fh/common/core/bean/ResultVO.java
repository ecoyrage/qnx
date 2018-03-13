package com.fh.common.core.bean;

import com.fh.common.util.JsonMapper;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResultVO {
	
	private boolean success = true;
	private int errno;
	private String errmsg;
	private Object data;
	
	public ResultVO() {
	}
	public ResultVO(boolean success, String errmsg){
		this.success = success;
		this.errno = success ? 0 : 1;
		this.errmsg = errmsg;
	}
	public ResultVO(int errno, String errmsg){
		this.success = (errno==0);
		this.errno = errno;
		this.errmsg = errmsg;
	}
	public ResultVO(Object data){
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public ResultVO setSuccess(boolean success) {
		this.success = success;
		return this;
	}
	public int getErrno() {
		return errno;
	}
	public ResultVO setErrno(int errno) {
		this.errno = errno;
		return this;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public ResultVO setErrmsg(String errmsg) {
		this.errmsg = errmsg;
		return this;
	}
	public Object getData() {
		return data;
	}
	public ResultVO setData(Object data) {
		this.data = data;
		return this;
	}
	@JsonIgnore
	private boolean isJsonData;
	public static ResultVO jsonData(String jsonData) {
		return new ResultVO(jsonData).setJsonData(true);
	}
	@JsonIgnore
	public boolean isJsonData() {
		return isJsonData;
	}
	public ResultVO setJsonData(boolean isJsonData) {
		this.isJsonData = isJsonData;
		return this;
	}
	@Override
	public String toString() {
		if(isJsonData) {
			return "{\"success\": true,\"errno\": 0,\"errmsg\": null,\"data\": " + data + "}";
		}
		return JsonMapper.toJson(this);
    }
	
	
	
	
}
