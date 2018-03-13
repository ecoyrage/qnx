package com.fh.framework.bean;

import java.io.Serializable;

/**
 * 
 * @author Cailin
 *
 */
public class Token implements Serializable {
	
	/**
	 * 用户ID
	 */
	private String uid;
	/**
	 * 用户角色
	 * @return
	 */
	private String role;
	/**
	 * 过期时间戳
	 */
	private long expires;
	
	private String refreshToken;
	
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getExpires() {
		return expires;
	}
	public void setExpires(long expires) {
		this.expires = expires;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
}
