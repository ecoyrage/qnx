package com.fh.common.exception;

public class SystemException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private Integer code;
	public Integer getCode() {
		return this.code;
	}
	public SystemException(Exception e) {
		super(e);
	}
	public SystemException(String message) {
		super(message);
	}
	public SystemException(int code, String message) {
		super(message);
		this.code = Integer.valueOf(code);
	}
	public SystemException(String message, Throwable e) {
		super(message, e);
	}

}