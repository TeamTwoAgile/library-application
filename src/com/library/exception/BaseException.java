package com.library.exception;

public class BaseException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String msg;

	
	
	public BaseException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "BasicException [msg=" + msg + "]";
	}
	
}
