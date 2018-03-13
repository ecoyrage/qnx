package com.fh.framework.bean;

/**
 * 
 * @author Cailin
 *
 */
public class TokenVO {
	private String accessToken;
	private String refreshToken;
	
	public TokenVO() {
		// TODO Auto-generated constructor stub
	}
	public TokenVO(String accessToken, String refreshToken) {
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
}
