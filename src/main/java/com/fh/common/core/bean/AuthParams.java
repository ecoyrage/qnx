package com.fh.common.core.bean;

import com.fh.framework.bean.Token;

public class AuthParams {
	private String service;
	private String params;
	private int version;
	private String uid;
	private Token token;
	private String accessToken;
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
}
