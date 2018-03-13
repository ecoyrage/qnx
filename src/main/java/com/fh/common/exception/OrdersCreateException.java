/**
 * 
 */
package com.fh.common.exception;

public class OrdersCreateException extends RuntimeException {
	private static final long serialVersionUID = -8103319369081288806L;
	public OrdersCreateException() {
		super();
	}
	public OrdersCreateException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public OrdersCreateException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrdersCreateException(String message) {
		super(message);
	}

	public OrdersCreateException(Throwable cause) {
		super(cause);
	}

}
