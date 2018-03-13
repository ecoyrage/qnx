/**
 * 
 */
package com.fh.common.exception;

public class CustomException extends RuntimeException  {
	private static final long serialVersionUID = 8807743014882605213L;
	public CustomException() {
		super();
	}
	public CustomException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(Throwable cause) {
		super(cause);
	}
	
}
